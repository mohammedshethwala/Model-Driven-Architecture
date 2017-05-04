package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;
/**
 *
 * @author Mohammed
 * Design Pattern: State
 * Class corresponding to the state S0
 */
public class S0 extends State{
    
    public S0(MDAEFSM mda, OutputProcessor op)
    {
        this.mda = mda;
        this.op = op;
    }
    
    //Call PayMsg and change the state to S1
    public void Start()
    {
        op.PayMsg();
        mda.ChangeState(1);
    }
    
}
    