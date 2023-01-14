package tds;

public class TdsVariable extends TdsElement{

    int size;

    public TdsVariable(String name, String type,int size,Tds tds) {
        super(name,type,tds);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Variable [name=" + getName() + ", type=" + type+"]";
    }
    
}
