package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;
/**
 *
 * @author Mohammed
 * Design Pattern: State
 * Class corresponding to the state Start
 */
public class Start extends State {
    
    public Start(MDAEFSM mda, OutputProcessor op)
    {
        this.mda = mda;
        this.op = op;
    }
    
    //calls StoreData and changes the state to S0
    public void Activate()
    {
        op.StoreData();
        mda.ChangeState(0);
    }
    
}
