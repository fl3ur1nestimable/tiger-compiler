package tds;
import java.util.*;


public class TdsFunction extends TdsElement {
    ArrayList<String> parameters;
    String otherType;

    public TdsFunction(String name, ArrayList<String> parameters, Type returnType,String otherType, Tds tds) {
        super(name+"_f",returnType,tds);
        this.parameters = parameters;
        this.otherType = otherType;
    }

    public ArrayList<String> getParameters() {
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
