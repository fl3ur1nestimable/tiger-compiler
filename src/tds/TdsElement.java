package tds;

public abstract class TdsElement {
    protected String name;
    protected Type type;
    protected String nameType;
    protected Tds tds;

    public TdsElement(String name, Tds tds){
        this.name = name;
        this.tds = tds;
    }

    public TdsElement(String name, Type type, Tds tds){
        this.name = name;
        this.type = type;
        this.tds = tds;
    }

    public TdsElement(String name, String nameType, Tds tds){
        this.name = name;
        this.nameType = nameType;
        this.tds = tds;
    }

    public String getName(){
        return name;
    }

    public Type getType(){
        return type;
    }

    public String getNameType(){
        return nameType;
    }

    public abstract String toString();

    public void setType(Type type){
        this.type = type;
    }

    public Tds getTds(){
        return tds;
    }


}
