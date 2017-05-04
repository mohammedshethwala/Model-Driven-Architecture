package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class StorePrice2 implements StorePrice{
    public void StorePrice(int g, DataStore d)
    {
        if(g==1)
        {
            d.setPrice2(d.getRprice2());
            System.out.println("Regular Gas type selected");
        }
        else if(g==2)
        {
            d.setPrice2(d.getSprice2());
            System.out.println("Super Gas type selected");
        }
        else if(g==3)
        {
            d.setPrice2(d.getPprice2());
            System.out.println("Premium Gas type selected");
        }
        
        
    }
}
