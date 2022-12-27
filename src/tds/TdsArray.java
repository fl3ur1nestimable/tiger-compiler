package tds;

public class TdsArray extends TdsElement {
    private int size;

    public TdsArray(String name, Type type, int size, Tds tds) {
        super(name,type, tds);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Array [name=" + getName() + ", size=" + size + "of type" + getType() +"]";
    }
    
}
