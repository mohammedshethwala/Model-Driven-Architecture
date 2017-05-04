package OutputProcessor.Strategy;

/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 */
public class DisplayMenu2 implements DisplayMenu{
    
    public void DisplayMenu()
    {
        System.out.println("---MENU---");
        System.out.println("Select the type of gas:");
        System.out.println("->Regular");
        System.out.println("->Super");
        System.out.println("->Premium");
    }
}
