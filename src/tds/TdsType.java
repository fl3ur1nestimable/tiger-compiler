package tds;

public class TdsType extends TdsElement {
    public TdsType(String name) {
        this.name=name;
    }
    public void setType(String t){
        this.type=t;
    }
    public void setTds(Tds tds){
        this.tds=tds;
    }

    @Override
    public String toString() {
        return "Type [name=" + getName() + ", type=" + getType() +"]";
    }
    
    
}