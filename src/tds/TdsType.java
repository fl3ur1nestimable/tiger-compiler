package tds;

public class TdsType extends TdsElement {
    public TdsType(String name, String type,Tds tds) {
        super(name,type,tds);
    }

    @Override
    public String toString() {
        return "Type [name=" + getName() + ", type=" + getType() +"]";
    }
    
    
}