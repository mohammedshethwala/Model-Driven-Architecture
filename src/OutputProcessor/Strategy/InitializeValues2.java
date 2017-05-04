package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class InitializeValues2 implements InitializeValues{
    public void InitializeValues(DataStore d)
    {
        d.setL2(0);
        d.setTotal2(0);
        
        //System.out.println("Initialized L=0 and Total=0");
    }
}
