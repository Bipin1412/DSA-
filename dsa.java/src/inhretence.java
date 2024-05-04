class continet{
    String continetname;
    continet(String name){
        this.continetname=name;
    }
    void displaycontinent(){
        System.out.println( "continet" + continetname);
    }

}

class country extends continet{
    String countryname;
    country(String countryname,String name){
        super(countryname);
        this.countryname=name;
    }

}
public class inhretence {

}
