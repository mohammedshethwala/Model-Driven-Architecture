package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class CancelMsg2 implements CancelMsg{

    @Override
    public void CancelMsg(DataStore d) {
        System.out.println("Purchase Cancelled !");
        System.out.println("Returned $"+d.getCash2()+" cash");
    }
    
}
