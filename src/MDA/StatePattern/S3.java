package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;
/**
 *
 * @author Mohammed
 * Design Pattern: State
 * Class corresponding to the state S3
 */
public class S3 extends State {
    
    public S3(MDAEFSM mda, OutputProcessor op)
    {
        this.mda = mda;
        this.op = op;
    }
    
    //display cancel msg and change state to S0
    public void Cancel()
    {
        op.CancelMsg();
        mda.ChangeState(0);
    }
    
    //call the StorePrice and change the state to S4
    public void SelectGas(int g)
    {
        op.StorePrice(g);
        mda.ChangeState(4);
    }
    
}
