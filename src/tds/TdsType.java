package tds;

public class TdsType extends TdsElement {
    private int size;

    public TdsType(String name, Type type, int size, Tds tds) {
        super(name,type, tds);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Type [name=" + getName() + ", size=" + size + "of type" + getType() +"]";
    }
    
    
}