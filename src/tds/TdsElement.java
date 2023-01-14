package tds;

public abstract class TdsElement {
    protected String name;
    protected String type;
    protected Tds tds;

    public TdsElement(String name, Tds tds){
        this.name = name;
        this.tds = tds;
    }

    public TdsElement(String name, String type, Tds tds){
        this.name = name;
        this.type = type;
        this.tds = tds;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public abstract String toString();

    public void setType(String type){
        this.type = type;
    }

    public Tds getTds(){
        return tds;
    }


}
