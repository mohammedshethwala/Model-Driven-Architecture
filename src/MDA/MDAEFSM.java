package MDA;
import MDA.StatePattern.*;
import AbstractFactoryPackage.*;
import OutputProcessor.OutputProcessor;
import OutputProcessor.Strategy.*;
/**
 *
 * @author Mohammed
 * Design Pattern: State
 * This is the generic MDA-EFSM class for both the GasPumps
 */
public class MDAEFSM {

    private State s;
    private State[] LS;
    
    //setting up states in the constructor
    //also assigning Start state to the current state s
    //also pasing OutProcessor object to every state so that they can have the reference to the op object
    public MDAEFSM(OutputProcessor op)
    {
        LS = new State[8];
        
        LS[0] = new S0(this, op);
        LS[1] = new S1(this, op);
        LS[2] = new S2(this, op);
        LS[3] = new S3(this, op);
        LS[4] = new S4(this, op);
        LS[5] = new S5(this, op);
        LS[6] = new S6(this, op);
        LS[7] = new Start(this, op);
        
        s = LS[7];
    }
    
    //used to change the state from within the different state classes
    public void ChangeState(int z)
    {
        s = LS[z];
    }
    
    public void Activate()
    {
        s.Activate();
    }
    
    public void Start()
    {
        s.Start();
    }
    
    public void PayType(int t)
    {
        s.PayType(t);
    }
    
    public void Reject()
    {
        s.Reject();
    }
    
    public void Approved()
    {
        s.Approved();
    }
    
    public void Cancel()
    {
        s.Cancel();
    }
    
    public void SelectGas(int g)
    {
        s.SelectGas(g);
    }
    
    public void StartPump()
    {
        s.StartPump();
    }
    
    public void PumpGas()
    {
        s.PumpGas();
    }
    
    public void StopPump()
    {
        s.StopPump();
    }
    
    public void Receipt()
    {
        s.Receipt();
    }
    
    public void NoReceipt()
    {
        s.NoReceipt();
    }
    
}
