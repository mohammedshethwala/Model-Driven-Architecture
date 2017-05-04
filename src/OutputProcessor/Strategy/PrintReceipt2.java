package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class PrintReceipt2 implements PrintReceipt{
    public void PrintReceipt(DataStore d)
    {
        System.out.println("Here is your receipt: ");
        System.out.println("Liters: "+d.getL2());
        System.out.println("Total: $"+d.getTotal2());
    }
}
