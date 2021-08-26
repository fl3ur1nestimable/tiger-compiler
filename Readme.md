# TP Projet compilation des languages 

## Introduction

L'objectif de ce TP est l'apprentissage et la mise en oeuvre de l'utilition d'Antlr.

Antlr est un programme d’analyse syntaxique. Il permet de générer un parseur de langage a partir d'une grammaire.

Pour ce TP, nous utiliserons la version 4 d'Antlr. En première année, vous avez étudié les analyseurs syntaxiques LL(1). Antlr permet de générer des analyseurs LL(*). Cela signifie que le programme lui même le nombre minimum de charactère necessaire pour pouvoir lire un texte sans ambiguïté. Grace à cela, nous alons pouvoir écrire des grammaires beaucoup plus simple.

## Partie 0 : Préambule

Ce repo git contient déjà le jar d'Antlr. 

Notez que plusieurs IDE comme visual studio code ou Jetbrains InteliJ possèdent des extensions qui facilite le dévellopement avec Antlr. Nous vous invitons à les installer. MODIFIER CEST PAS CLAIR


## Partie 1 : première grammaire

#### a - Etude de la grammaire

Ouvrer le fichier __expr.g4__ situé à la racine du projet.

Le fichier commence par le nom de la grammaire.

```grammar expr;```. 
Il est important de noter que la grammaire doit avoir le même nom que le fichier

Une regle grammaticale se construit de la façon suivante: 
```nom_de_la_regle : contenu ; ```

ainsi, la rêgle gramaticale A -> AB s'écrit dans antlr sous la forme:
```a : ab ;```

On peut remarquer deux types de regles différentes. les regles en majuscules (la rêgle INT) qui permettent d'écrire les terminaux de la grammaire. On les appelle les rêgles de lexer.

Le second type de rêgles, écrite en minuscules (la règle exp), est celui des règles grammaticale. Il s'agit des non terminaux de la grammaire (en gros, c'est l'inverse de ce que vous avez fait en MI).

On peut remarquer les choses suivantes :

* Les tokens dans les rêgle gramaticales sont encadré par des quotes simple (‘+’)
* La syntaxe des expressions régulière (?, +, *) est également utilisable dans ANTLR
* Chaque règle se termine par un ;
* Il est nécessaire de différencier les règles terminales (majuscule) et les règles non terminales (en minuscule)
* Dans les règles terminales, on peux utiliser la syntaxe .. pour désigner un ensemble de caractères. (‘0’..’9’) signifie l’ensemble des caractères entre 0 et 9.
* La barre verticale | est un ou, elle permet de faire la différences entre deux alternatives pour une même règle (et même à l’intérieur d’une règle).


Bon, il est temps de pratiquer un peu maintenant.

#### b - Les identifiants

En vous appuyant sur la grammaire expr, écrivez la règle de lexer permettant de definir les identifiants (on la nottera IDF). Ils obéissent aux rêgles suivante :
* Un identifiant peut contenir des lettres, des chiffres et le charactère '_'
* Un identifiant ne peux pas commencer par un chiffre

#### c - Affectation de variable

Ecrivez une rêgle permettant l'affectation de variable à une expression de la forme.

```nom_variable = expression ;```

Cette rêgle doit suivre les contraintes suivantes:
* La rêgle se termine par un __;__
* Seule une variable peut être affecté
* Une expression peut être une variable ou un calcul

(indice : Vous avez le droit de modifier les rêgles précédentes et d'ajouter des rêgles auxiliaires)

#### d - Instruction et programme

Creez une rêgle __instruction__ qui contiendra l'ensemble des instructions du langage. Pour le moment, la seule instruction que nous connaissons est l'affectation, nous allons en ajouter dans les parties suivantes.

Ajoutez ensuite la rêgle __programme__ qui correspond à une suite non nulle d'instructions terminé par le charactère spécial __EOF__ (ne l'oubliez pas sinon tout va planter).

Cette rêgle sera la racine de notre grammaire (nous verrons ça plus tard).


#### d - Instruction conditionelle If

Ajoutez une rêgle premettant l'écriture d'une instruction conditionelle __if__ dont la syntaxe sera : 
``` if (condition) {instruction+} else {instruction+}```

Le if obéit aux contraintes suivantes:
* La condition est soit une expression, soit une variable

Ajoutez ensuite cette rêgle dans la liste des instructions

#### d - Instruction d'affichage Print
Ajoutez une rêgle print qui obéit à la syntaxe suivante: 
```print valeur ;```

La rêgle print obéit aux contraintes suivantes : 
* La valeur est soit une expression, soit une variable

Ajoutez ensuite cette rêgle à la liste des instructions

#### e - Ignorer certains charactères

Lorsque l'on écrit dans un langage de programmation, on ignore les espaces et les retours à la ligne (bon sauf en Python). Cela permet une meilleure lisibilité du code.

Il faut donc dire au parser qu'il doit ignorer certains charactères lors de l'analyse.

Antlr permet de réaliser cette opération grace à a l'instruction suivante:
```
WS : [\n]+ -> skip ;
```

Cette instruction permet de dire a l'analyseur lexical d'ignorer les charactères de l'expression régulière ```[\n]+```. Cette rêgle permet donc d'ignorer les retours à la ligne.

Ajoutez cette rêgle dans votre grammaire et modifiez là pour ignorer les tabulations et les espaces.


## Partie 2 : Priorisation des oppérateurs

#### a - Petit rappel
En première année, vous avez travaillé sur l'analyse syntaxique en MI. Durant l'un des TD, on vous a présenté le concept de priorisation d'oppérateur. Comme un petit rappel ne fait jamais de mal, nous vous proposons l'exercice suivant:

Ecrivez l'arbre syntaxique correspondant a l'expression arithmétique __2*3+4__ en utilisant la grammaire:
A -> B (*|+) A | B       
B -> idf | int


Vous devriez remarquez que l'ordre des oppérateurs n'est pas respecté. la multiplication se trouve plus haut dans l'arbre que l'addition. 

Durant la compilation, le calcul 3+4 sera donc exécuté avant le calcul 2*3, ce qui ne respecte pas la priorité des oppérateurs.

Il faut donc utiliser une méthode pour prioriser l'oppérateur * sur l'oppérateur +.

Pour cela, on décompose la plusieurs sous rêgle (Une par niveau de priorité). Cela donne la grammaire :
A -> B + A | B
B -> C * B | C
C -> idf | int

De cette façon, l'oppérateur + apparaitra toujours avant l'oppérateur * (vous pouvez essayer d'interprêter l'oppération 2*3+4).

#### b - Implémentation dans la grammaire expr

Antlr permet d'éviter l'utilisation de grammaire récursive comme celles de la partie précédente. Nous pouvons à la place utiliser l'étoile __*__ pour écrire toutes les oppérations de la même priorité sur une seule rêgle. Dans la rêgle exp, vous devriez avoir quelque chose de la forme :
```exp : (INT|IDF) ( ('+'|'-'|'*'|'/')   (INT|IDF) )* ;```

Dans cette rêgle, les oppérateurs sont ajoutés les uns à la suite des autres. Bien que cette façon e faire soit contre intuitive (on aimerais construire l'arbre de priorité tout de suite), elle simplifiera énormément l'écriture de l'AST dans les prochains TP.

En vous apuyant sur ce principe, prioriser les oppérateurs de la rêgle exp


## Partie 3 : Compilation de la grammaire et tests


#### a - compilation du parser

Nous avons terminé l'écriture de notre grammaire, il serait temps de la lancer pour voir si ça marche non ?

Pour cette partie, il est necessaire de posseder un JDK dans sa version 14. Pour l'instalation du jdk, référez vous aux liens suivants[INSERER LIEN JAVA]


Pour cela, il sufit d'éxécuter le jar situé dans le dossier lib.

```bash
java -jar antlr-4.9.2-complete.jar
```

Cela devrait vous afficher l'ensemble des commandes utilisables. Les plus importantes sont :
* ```-o [path]``` qui permet de choisir la destination des fichiers compilés par antlr
* ```-visitor```, ```-no-visitor```, ```-listener```, ```-no-listener``` qui permettent de creer ou non des classes facilitant le traitement de l'arbre syntaxique (nous allons les ignorer pour le moment mais elles seront très utiles au prochain TP)
* ```-Dlanguage=[language]``` qui permet de spécifier le langage de sortie d'Antlr. En effet Antlr permet de générer des parsers dans de nombreux langages (Python, C/C++, Java, Rust, Javascript ...).


Pour le moment, nous utiliserons le langage Java qui est le langage par défaut d'Antlr. 

Compilez avec la commande :
```bash
java -jar antlr-4.9.2-complete.jar expr.g4 -no-listener -no-visitor -o ./src/parser
```

Si tout se passe bien, cela devrait générer dans le dossier src un sous dossier parser ainsi que 2 classes java :
* ```exprLexer.java``` : L'analyseur lexical
* ```exprParser.java``` : L'analyseur syntaxique

Ces deux classes permettent d'analyser un texte et de vérifier s'il peut être reconnu par la grammaire expr.


#### b - Utilisation du parser

Le parser généré par Antlr utilise les instructions suivantes:


```java        
CharStream input = CharStreams.fromFileName(testFile);
exprLexer lexer = new exprLexer(input); 
CommonTokenStream stream = new CommonTokenStream(lexer);
exprParser parser = new exprParser(stream);
```

Le programme lis d'abord une chaine de charactères, puis il la passe à l'analyseur lexical (ligne 2). Ceci permet de transformer la chaine de charactère en une suite de mots (ou token) du langage (par exemple __'if'__).
On utilise ensuite le lexer pour transformer la chaine de départ en chaine de token (ligne 3). Pour finir, on parse la chaine de Token grace à la classe de parser généré par antlr.

Pour récupérer l'arbre syntaxique, il suffit d'exécuter la commande suivante:

```java
ProgramContext program = parser.program();
```

L'objet program représente la racine de l'arbre syntaxique.

Pour l'afficher, nous utilisons un petit code situé dans le main.


#### c - Affichage de l'arbre syntaxique


La classe Main à la racine de src contient tout ce qui est necessaire pour tester notre parser. Essayer de compiler Main.java avec la commande :
```javac -target 14 -cp ./lib/antlr-4.9.2-complete.jar:./src ./src/Main.java -d ./bin```

Normalement, vous devriez avoir une erreur de compilation car java ne reconnais pas le exprLexer et exprParser. En effet, ces deux fichiers ne se trouve pas dans un package, donc Java ne les reconnais pas. Pour corriger, nous allons modifier le fichier expr.g4 pour lui préciser d'ajouter des headers lorsqu'il compile la grammaire.

Au début du fichier expr.g4 (après la définition du nom de la grammaire), ajouter les lignes suivante : 
```
@header{
package parser;
}
```

Recompilez ensuite la grammaire, puis réexécutez la commande précédente. Vous devriez générez des fichier .class dans le dossier bin



Vous pouvez tester avec les deux programmes du dossier exemples avec la commande : 
```
java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main ./examples/good.exp
```

```
java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main ./examples/bad.exp
```







