package tds;

public class TdsVariable extends TdsElement{

    int size;

    public TdsVariable(String name) {
        this.name=name;
        
    }
    public void setType(String t){
        this.type=t;
    }
    public void setSize(int size){
        this.size=size;
    }
    public void setTds(Tds tds){
        this.tds=tds;
    }

    @Override
    public String toString() {
        return "Variable [name=" + getName() + ", type=" + type+"]";
    }
    
}
