package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class DisplayGas2 implements DisplayGas{
    
    public void DisplayGas(DataStore d)
    {
        System.out.println("Total Gas Pumped: "+d.getL2()+" Liters");
    }
}
