package tds;

public class TdsArrayType extends TdsType{
    private String baseType;

    public TdsArrayType(String name){
        super(name);
    }
    public void setType(String t){
        this.type=t;
    }
    public void setBaseType(String bt){
        this.baseType=bt;
    }
    public void setTds(Tds tds){
        this.tds=tds;
    }

    public String getBaseType(){
        return this.baseType;
    }

    public String toString(){
        return "Type [name=" + getName() + ", type=" + getType() + ", baseType=" + baseType+"]";
    }
}