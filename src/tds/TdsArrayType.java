package tds;

public class TdsArrayType extends TdsElement{
    private String name;
    private String type;
    private String baseType;

    public TdsArrayType(String name, String type, String baseType, Tds tds){
        super(name,type, tds);
        this.baseType=baseType;
    }

    public String getBaseType(){
        return this.baseType;
    }

    public String toString(){
        return "Name : " + name + ", Type : " + type + ", baseType : " + baseType;
    }
}