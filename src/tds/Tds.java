package tds;

import java.util.ArrayList;

public class Tds {
    private String name;
    private int numBloc;
    private int numImbrication;
    private Tds parent;
    private ArrayList<TdsElement> elements;

    public Tds(String name,int numBloc, int numImbrication, Tds parent) {
        this.name = name;
        this.numBloc = numBloc;
        this.numImbrication = numImbrication;
        this.parent = parent;
        this.elements = new ArrayList<TdsElement>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "TDS_"+name+"_"+numBloc+"_"+numImbrication;
    }

    public int getNumBloc() {
        return numBloc;
    }

    public int getNumImbrication() {
        return numImbrication;
    }

    public Tds getParent() {
        return parent;
    }

    public ArrayList<TdsElement> getElements() {
        return elements;
    }

    public void addElement(TdsElement element) {
        this.elements.add(element);
    }
    public void supprimerElement(TdsElement element) {
        this.elements.remove(element);
    }

    public TdsElement getElement(String name) {
        for (TdsElement element : elements) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return null;
    }

    public boolean contains(String name) {
        for (TdsElement element : elements) {
            if (element.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<TdsElement> getFuncAndVars() {
        ArrayList<TdsElement> funcAndVars = new ArrayList<TdsElement>();
        for (TdsElement element : elements) {
            if (element instanceof TdsFunction || element instanceof TdsVariable) {
                funcAndVars.add(element);
            }
        }
        return funcAndVars;
    }

    public ArrayList<TdsElement> getTypes(){
        ArrayList<TdsElement> types = new ArrayList<TdsElement>();
        for (TdsElement element : elements) {
            if (element instanceof TdsType ) {
                types.add(element);
            }
        }
        return types;
    }

    public ArrayList<TdsElement> getFuncs() {
        ArrayList<TdsElement> funcs = new ArrayList<TdsElement>();
        for (TdsElement element : elements) {
            if (element instanceof TdsFunction) {
                funcs.add(element);
            }
        }
        return funcs;
    }

    public ArrayList<TdsElement> getVars() {
        ArrayList<TdsElement> vars = new ArrayList<TdsElement>();
        for (TdsElement element : elements) {
            if (element instanceof TdsVariable) {
                vars.add(element);
            }
        }
        return vars;
    }

    public TdsVariable findVar(String name) {
        ArrayList<TdsElement> funcAndVars = getFuncAndVars();
        TdsVariable var = null;
        for (TdsElement element : funcAndVars) {
            if (element instanceof TdsVariable && element.getName().equals(name)) {
                var = (TdsVariable) element;
            }
        }
        if (var != null) {
            return var;
        }
        if (parent != null) {
            return parent.findVar(name);
        }
        return null;
    }

    public TdsFunction findFunc(String name) {
        ArrayList<TdsElement> funcAndVars = getFuncAndVars();
        TdsFunction func = null;
        for (TdsElement element : funcAndVars) {
            if (element instanceof TdsFunction && element.getName().equals(name)) {
                func = (TdsFunction) element;
            }
        }
        if (func != null) {
            return func;
        }
        if (parent != null) {
            return parent.findFunc(name);
        }
        return null;
    }

    public TdsType findType(String name) {
        ArrayList<TdsElement> types = getTypes();
        TdsType  type = null;
        for (TdsElement element : types) {
            if (element.getName().equals(name)) {
                type = (TdsType) element;
            }
        }
        if (type!=null) {
            return type;
        }
        if(parent != null){
            return parent.findType(name);
        }
        return null;
    }



    
}
