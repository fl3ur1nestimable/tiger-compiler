package tds;


public class TdsFunction extends TdsElement {
    String parameters;
    String otherType;

    public TdsFunction(String name, String parameters, Type returnType,String otherType, Tds tds) {
        super(name,returnType,tds);
        this.parameters = parameters;
        this.otherType = otherType;
    }

    public String getParameters() {
        return parameters;
    }

    public String getOtherTYpe(){
        return otherType;
    }

    @Override
    public String toString() {
        if (otherType != null) {
            return "Function [name=" + getName() + ", parameters={" + parameters + "}, returnType=" + otherType + "]";
        }
        return "Function [name=" + getName() + ", parameters={" + parameters +"}]";
    }




}
