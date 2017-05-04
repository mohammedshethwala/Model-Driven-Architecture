package OutputProcessor.Strategy;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class PayMsg1 implements PayMsg{
    public void PayMsg()
    {
        System.out.println("Select type of payment: ");
        System.out.println("->PayCredit");
    }
}
