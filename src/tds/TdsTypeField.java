package tds;

public class TdsTypeField extends TdsElement{

    public TdsTypeField(String name){
        this.name=name;
    }
    public void setType(String t){
        this.type=t;
    }
    public void setTds(Tds tds){
        this.tds=tds;
    }
    @Override
    public String toString(){
        return getName() + " : " + getType();
    }
}