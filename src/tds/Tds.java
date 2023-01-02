package tds;

import java.util.ArrayList;

public class Tds {
    private String name;
    private int numBloc;
    private int numImbrication;
    private Tds parent;
    private ArrayList<TdsElement> elements;

    public Tds(String name,int numBloc, int numImbrication, Tds parent) {
        this.name = "TDS_"+name+"_"+numBloc+"_"+numImbrication;
        this.numBloc = numBloc;
        this.numImbrication = numImbrication;
        this.parent = parent;
        this.elements = new ArrayList<TdsElement>();
    }

    public String getName() {
        return name;
    }

    public int getNumBloc() {
        return numBloc;
    }

    public int getNumImbrication() {
        return numImbrication;
    }

    public Tds getParent() {
        return parent;
    }

    public ArrayList<TdsElement> getElements() {
        return elements;
    }

    public void addElement(TdsElement element) {
        this.elements.add(element);
    }

    public TdsElement getElement(String name) {
        for (TdsElement element : elements) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return null;
    }

    public boolean contains(String name) {
        for (TdsElement element : elements) {
            if (element.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }



    
}
