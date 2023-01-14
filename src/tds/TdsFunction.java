package tds;
import java.util.*;


public class TdsFunction extends TdsElement {
    ArrayList<String> parameters;

    public TdsFunction(String name, ArrayList<String> parameters, String returnType, Tds tds) {
        super(name,returnType,tds);
        this.parameters = parameters;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "Function [name=" + getName() + ", parameters={" + parameters + "}, returnType=" + getType() + "]";
        
    }




}
