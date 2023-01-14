package tds;

public class TdsArrayType extends TdsType{
    private String baseType;

    public TdsArrayType(String name, String type, String baseType, Tds tds){
        super(name,type,tds);
        this.baseType=baseType;
    }

    public String getBaseType(){
        return this.baseType;
    }

    public String toString(){
        return "Type [name=" + getName() + ", type=" + getType() + ", baseType=" + baseType+"]";
    }
}