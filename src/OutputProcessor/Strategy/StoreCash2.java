package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class StoreCash2 implements StoreCash{
    public void StoreCash(DataStore d)
    {
        int tempCash = d.getTemp_cash2();
        d.setCash2(tempCash);
        //System.out.println("Cash stored.");
    }
}
