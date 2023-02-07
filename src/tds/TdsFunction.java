package tds;
import java.util.*;


public class TdsFunction extends TdsElement {
    ArrayList<String> parameters=new ArrayList<String>();
    
    public TdsFunction(String name) {
        this.name = name;
    }

    public void setTds(Tds t){
        this.tds=t;
    }

    public void setParametres(ArrayList<String> p){
        this.parameters=p;
    }

    public void setReturnType(String returnT){
        this.type=returnT;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "Function [name=" + getName() + ", parameters={" + parameters + "}, returnType=" + getType() + "]";
        
    }




}
