package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class PumpGasUnit1 implements PumpGasUnit{
    public void PumpGasUnit(DataStore d)
    {
        System.out.println("Pumped 1 gallon of gas...");
        
        int g = d.getG1();
        g = g + 1;
        d.setG1(g);
        
        float price = d.getPrice1();
        float total = d.getTotal1();
        total = price*g;
        d.setTotal1(total);
    }
}
