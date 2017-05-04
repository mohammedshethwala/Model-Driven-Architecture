package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;
/**
 *
 * @author Mohammed
 * Design Pattern: State
 * Class corresponding to the state S1
 */
public class S1 extends State {
    
    public S1(MDAEFSM mda, OutputProcessor op)
    {
        this.mda = mda;
        this.op = op;
    }
    
    //value of t decides the execution
    //t=1 means credit card and t=2 means cash payment
    //if credit card then change state to S2
    //else if cash then display menu and store cash. and also change state to S3
    public void PayType(int t)
    {
        if(t==1)
        {
            System.out.println("Checking Credit Card...");
            mda.ChangeState(2);
        }
        else if(t==2)
        {
            op.DisplayMenu();
            op.StoreCash();
            mda.ChangeState(3);
        }
            
    }
    
}
