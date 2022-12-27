package tds;

import java.util.List;

public class TdsFunction extends TdsElement {
    List<String> parameters;
    TdsType returnType;

    public TdsFunction(String name, List<String> parameters, TdsType returnType, Tds tds) {
        super(name,tds);
        this.parameters = parameters;
        this.returnType = returnType;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public TdsType getReturnType() {
        return returnType;
    }

    @Override
    public String toString() {
        return "Function [name=" + getName() + ", parameters=" + parameters + ", returnType=" + getReturnType() + "]";
    }




}
