package OutputProcessor.Strategy;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class StopMsg2 implements StopMsg{
    public void StopMsg(DataStore d)
    {
        int cash = d.getCash2();
        int L = d.getL2();
        int price = d.getPrice2();
        
        if(cash >= price*(L+1))
        {
            System.out.println("Gas pumping stopped !");
            System.out.println("Please select one option: ");
            System.out.println("->Receipt");
            System.out.println("->No Receipt");
        }
        else
        {
            System.out.println("Gas pumping stopped ! Not sufficient amount of cash");
            System.out.println("Please select one option: ");
            System.out.println("->Receipt");
            System.out.println("->No Receipt");
        }
        
        
    }
}
