package tds;

public class TdsType extends TdsElement {
    public TdsType(String name, Type type,Tds tds) {
        super(name+"_t",type,tds);
    }

    @Override
    public String toString() {
        return "Type [name=" + getName() + ", type=" + getType() +"]";
    }
    
    
}