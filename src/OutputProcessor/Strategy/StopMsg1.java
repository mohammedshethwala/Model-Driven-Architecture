package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class StopMsg1 implements StopMsg{
    public void StopMsg(DataStore d)
    {
        System.out.println("Gas pumping stopped !");
    }
}
