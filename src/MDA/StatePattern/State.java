package MDA.StatePattern;
import MDA.MDAEFSM;
import OutputProcessor.OutputProcessor;
import AbstractFactoryPackage.*;
import Data.*;
/**
 *
 * @author Mohammed
 * Design Pattern: State
 * This is the abstract class 'State' which is extended by the actual state classes
 * All the methods are abstract and needs to be implemented by the respective state classes
 */
public abstract class State {
    
    MDAEFSM mda;
    OutputProcessor op;
    
    public void Activate()
    {     
    }
    
    public void Start()
    {   
    }
    
    public void PayType(int t)
    {   
    }
    
    public void Reject()
    {   
    }
    
    public void Approved()
    {   
    }
    
    public void Cancel()
    {   
    }
    
    public void SelectGas(int g)
    {   
    }
    
    public void StartPump()
    {   
    }
    
    public void PumpGas()
    {   
    }
    
    public void StopPump()
    {   
    }
    
    public void Receipt()
    {   
    }
    
    public void NoReceipt()
    {
    }

    //getter and setter methods
    public MDAEFSM getMda() {
        return mda;
    }

    public void setMda(MDAEFSM mda) {
        this.mda = mda;
    }

    public OutputProcessor getOp() {
        return op;
    }

    public void setOp(OutputProcessor op) {
        this.op = op;
    }
    
    
}
