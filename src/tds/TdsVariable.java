package tds;

public class TdsVariable extends TdsElement{
    private int offset;

    public TdsVariable(String name, Type type, int offset,Tds tds) {
        super(name, type, tds);
        this.offset = offset;
    }

    public TdsVariable(String name, String nameType, int offset,Tds tds) {
        super(name, nameType, tds);
        this.offset = offset;
    }

    public TdsVariable(String name, int offset,Tds tds) {
        super(name, tds);
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "Variable [name=" + getName() + ", type=" + getType() + ", offset=" + offset + "]";
    }
    
}
