package tds;

public abstract class TdsElement {
    protected String name;
    protected String type;
    protected Tds tds;


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
