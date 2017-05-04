package OutputProcessor.Strategy;

/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class DisplayMenu1 implements DisplayMenu{
    public void DisplayMenu()
    {
        System.out.println("---MENU---");
        System.out.println("Select the type of gas:");
        System.out.println("->Regular");
        System.out.println("->Super");
    }
}
