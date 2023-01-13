package tds;

public class TdsTypeField extends TdsElement{
    private String name;
    private String type;

    public TdsTypeField(String name, String type,Tds tds){
        super(name, type, tds);
    }

    @Override
    public String toString(){
        return name + " : " + type;
    }
}