package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class CancelMsg1 implements CancelMsg{

    @Override
    public void CancelMsg(DataStore d) {
        System.out.println("Purchase Cancelled !");
    }
    
}
