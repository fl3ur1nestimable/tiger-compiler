package tds;

public class TdsVariable extends TdsElement{

    String baseType;
    int size;

    public TdsVariable(String name, String type,int size,Tds tds) {
        super(name,tds);
        this.baseType=type;
        this.size = size;
    }

    @Override
    public String toString() {
        if(type!=null){
            return "Variable [name=" + getName() + ", type=" + type+"]";
        }
        return "Variable [name=" + getName() + ", type=" + baseType+"]";
    }
    
}
