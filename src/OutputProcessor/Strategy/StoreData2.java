package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class StoreData2 implements StoreData{
    public void StoreData(DataStore d){
        
        int Rprice = d.getTemp_a2();
        int Sprice = d.getTemp_b2();
        int Pprice = d.getTemp_c2();
        
        d.setRprice2(Rprice);
        d.setSprice2(Sprice);
        d.setPprice2(Pprice);
        
        System.out.println("Gas pump is activated: ");
        System.out.println("Regular Price: "+Rprice);
        System.out.println("Super Price: "+Sprice);
        System.out.println("Premium Price: "+Pprice);
    }
}
