package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class StorePrice1 implements StorePrice{
    public void StorePrice(int g, DataStore d)
    {
        if(g==1)
        {
            d.setPrice1(d.getRprice1());
            System.out.println("Regular Gas type selected");
        }
        else if(g==2)
        {
            d.setPrice1(d.getSprice1());
            System.out.println("Super Gas type selected");
        }
        
    }
}
