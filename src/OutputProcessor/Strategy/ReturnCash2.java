package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class ReturnCash2 implements ReturnCash{
    public void ReturnCash(DataStore d)
    {
        int cash = d.getCash2();
        int total = d.getTotal2();
        int remainingCash = cash - total;
        System.out.println("Cash Returned: $"+remainingCash);
    }
}
