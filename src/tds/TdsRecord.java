package tds;

import java.util.ArrayList;

public class TdsRecord extends TdsElement {
    private ArrayList<TdsVariable> variables;

    public TdsRecord(String name, Tds tds, ArrayList<TdsVariable> variables) {
        super(name, tds);
        this.variables = variables;
    }

    public int getSize() {
        return variables.size();
    }

    @Override
    public String toString() {
        return "Record [name=" + getName() + ", variables=" + variables.toString() + "]";
    }
    
}
