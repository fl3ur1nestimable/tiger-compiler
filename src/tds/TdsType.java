package tds;

public class TdsType extends TdsElement {
    String baseType;
    String fields;
    public TdsType(String name, Type type, String base,String fiels, Tds tds) {
        super(name,type,tds);
        this.baseType = base;
        this.fields = fiels;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getFields() {
        return fields;
    }

    @Override
    public String toString() {
        if (type==Type.ARRAYTY) {
            return "Type [name=" + getName() + ", type=" + getType() + ", baseType=" + baseType + "]";
        }
        else if (type==Type.RECORDTY){
            return "Type [name=" + getName() + ", type=" + getType() + ", Fields={" + fields + "}]";
        }
        return "Type [name=" + getName() + ", type=" + getType() +"]";
    }
    
    
}