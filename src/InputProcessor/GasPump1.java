package InputProcessor;
import MDA.*;
import Data.*;
import AbstractFactoryPackage.*;
import MDA.StatePattern.*;
import OutputProcessor.*;
import OutputProcessor.Strategy.*;
/**
 *
 * @author Mohammed
 * This is the InputProcessor GasPump1 class
 * Method calls from the driver comes directly to this class.
 * This class further delegates the method calls to MDAEFSM class after checking some constraints
 */
public class GasPump1 {
    
    private MDAEFSM mda;
    private DataStore ds;
    
    //constructor in which objects of MDAEFSM and DataStore are initialized
    public GasPump1(MDAEFSM mda, DataStore ds)
    {
        this.mda = mda;
        this.ds = ds;
    }
    
    public void Activate(float a, float b){    
        if(a>0 && b>0)
        {
            ds.setTemp_a1(a);
            ds.setTemp_b1(b);
            mda.Activate();
        }
    }
    
    public void Start(){  
        mda.Start();
    }
    
    public void PayCredit(){    
        mda.PayType(1);
    }
    
    public void Reject(){
        mda.Reject();
    }
    
    public void Cancel(){
        mda.Cancel();
    }
    
    public void Approved(){
        mda.Approved();
    }
    
    public void Super(){
        //2 is identified as Super gas
        mda.SelectGas(2);
    }
    
    public void Regular(){
        //1 is identified as Regular Gas
        mda.SelectGas(1);
    }
    
    public void StartPump(){
        mda.StartPump();
    }
    
    public void PumpGallon(){
        mda.PumpGas();
    }
    
    public void StopPump(){
        //As there is no display for receipt? or NoReceipt in GasPump1, Receipt is called after StopPump
        mda.StopPump();
        mda.Receipt();
    }
    
    //Getter and setter methods for mda, af and ds objects
    public MDAEFSM getMda() {
        return mda;
    }

    public void setMda(MDAEFSM mda) {
        this.mda = mda;
    }

    public DataStore getDs() {
        return ds;
    }

    public void setDs(DataStore ds) {
        this.ds = ds;
    }
    
}
