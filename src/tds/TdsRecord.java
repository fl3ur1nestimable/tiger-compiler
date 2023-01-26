package tds;


public class TdsRecord extends TdsType {

    public TdsRecord(String name) {
        super(name);
        
    }

    public void setTds(Tds tds){
        this.tds=tds;
    }

}
