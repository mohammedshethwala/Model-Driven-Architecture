package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class InitializeValues1 implements InitializeValues{
    public void InitializeValues(DataStore d)
    {
        d.setG1(0);
        d.setTotal1(0);
        
        //System.out.println("Initialized G=0 and Total=0");
    }
}
