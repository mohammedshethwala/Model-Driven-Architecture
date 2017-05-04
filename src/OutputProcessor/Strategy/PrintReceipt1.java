package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class PrintReceipt1 implements PrintReceipt{
    public void PrintReceipt(DataStore d)
    {
        System.out.println("Here is your receipt: ");
        System.out.println("Gallons: "+d.getG1());
        System.out.println("Total: $"+d.getTotal1());
    }
}
