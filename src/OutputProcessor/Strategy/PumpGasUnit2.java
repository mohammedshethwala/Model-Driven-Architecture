package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class PumpGasUnit2 implements PumpGasUnit{
    public void PumpGasUnit(DataStore d)
    {
        System.out.println("Pumped 1 liter of gas...");
        
        int l = d.getL2();
        l = l + 1;
        d.setL2(l);
        
        int price = d.getPrice2();
        int total = d.getTotal2();
        total = price*l;
        d.setTotal2(total);
    }
}
