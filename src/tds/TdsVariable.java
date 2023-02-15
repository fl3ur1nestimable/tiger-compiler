package tds;

public class TdsVariable extends TdsElement{

    int deplacement;
    int size;

    public TdsVariable(String name) {
        this.name=name;
        
    }
    public void setType(String t){
        this.type=t;
    }
    public void setDeplacement(int deplacement){
        this.deplacement=deplacement;
    }
    public void setSize(int size){
        this.size=size;
    }
    public void setTds(Tds tds){
        this.tds=tds;
    }

    public int getDeplacement(){
        return deplacement;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "Variable [name=" + getName() + ", type=" + type+ ", deplacement=" + deplacement + ", size=" + size + "]";
    }
    
}
