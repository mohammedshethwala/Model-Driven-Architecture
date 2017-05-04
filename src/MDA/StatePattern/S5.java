package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;
/**
 *
 * @author Mohammed
 * Design Pattern: State
 * Class corresponding to the state S5
 */
public class S5 extends State {
    
    public S5(MDAEFSM mda, OutputProcessor op)
    {
        this.mda = mda;
        this.op = op;
    }
    
    //Pump gas and display the total gas pumped
    public void PumpGas()
    {
        op.PumpGasUnit();
        op.DisplayGas();
    }
    
    //stop the pump and display stop message. change the state to S6
    public void StopPump()
    {
        op.StopMsg();
        mda.ChangeState(6);
    }
    
}
