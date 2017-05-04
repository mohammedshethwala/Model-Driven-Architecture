package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;
/**
 *
 * @author Mohammed
 * Design Pattern: State
 * Class corresponding to the state S2
 */
public class S2 extends State {
    
    public S2(MDAEFSM mda, OutputProcessor op)
    {
        this.mda = mda;
        this.op = op;
    }
    
    //If credit card approved, then call DisplayMenu and change state to S3
    public void Approved()
    {
        op.DisplayMenu();
        mda.ChangeState(3);
    }
    
    //If rejected, then display reject msg and change state to S0
    public void Reject()
    {
        op.RejectMsg();
        mda.ChangeState(0);
    }
    
}
