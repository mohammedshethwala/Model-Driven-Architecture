package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;
/**
 *
 * @author Mohammed
 * Design Pattern: State
 * Class corresponding to the state S4
 */
public class S4 extends State {
    
    public S4(MDAEFSM mda, OutputProcessor op)
    {
        this.mda = mda;
        this.op = op;
    }
    
    //Initialize values and display ready message. Change state to S5
    public void StartPump()
    {
        op.InitializeValues();
        op.ReadyMsg();
        mda.ChangeState(5);
    }
    
}
