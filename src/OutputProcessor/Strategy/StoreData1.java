package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class StoreData1 implements StoreData{
    public void StoreData(DataStore d){
        
        float Rprice = d.getTemp_a1();
        float Sprice = d.getTemp_b1();
        
        d.setRprice1(Rprice);
        d.setSprice1(Sprice);
        
        System.out.println("Gas pump is activated !");
        System.out.println("Regular Price: "+Rprice);
        System.out.println("Super Price: "+Sprice);
        
    }
}
