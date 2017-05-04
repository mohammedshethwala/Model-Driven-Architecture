package OutputProcessor.Strategy;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class RejectMsg1 implements RejectMsg{
    public void RejectMsg()
    {
        System.out.println("Credit card not approved !");
        System.out.println("Transaction is cancelled ! Please start over again");
    }
}
