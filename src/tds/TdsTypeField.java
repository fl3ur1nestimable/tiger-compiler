package tds;

public class TdsTypeField extends TdsElement{

    public TdsTypeField(String name, String type,Tds tds){
        super(name, type, tds);
    }

    @Override
    public String toString(){
        return getName() + " : " + getType();
    }
}