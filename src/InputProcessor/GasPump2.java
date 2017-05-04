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
 * This is the InputProcessor GasPump2 class
 * Method calls from the driver comes directly to this class.
 * This class further delegates the method calls to MDAEFSM class after checking some constraints
 */
public class GasPump2 {
    
    private MDAEFSM mda;
    private DataStore ds;
   
    public GasPump2(MDAEFSM mda, DataStore ds)
    {
        this.mda = mda;
        this.ds = ds;
    }
    
    public void Activate(int a, int b, int c){
        if(a>0 && b>0 && c>0)
        {
            ds.setTemp_a2(a);
            ds.setTemp_b2(b);
            ds.setTemp_c2(c);
            mda.Activate();
        }
    }
    
    public void Start(){
        mda.Start();
    }
    
    public void PayCash(int c){
        if(c>0)
        {
            ds.setTemp_cash2(c);
            mda.PayType(2);
        }
    }
    
    public void Cancel(){
        mda.Cancel();
    }
    
    public void Premium(){
        mda.SelectGas(3);
    }
    
    public void Regular(){
        mda.SelectGas(1);
    }
    
    public void Super(){
        mda.SelectGas(2);
    }
    
    public void StartPump(){
        mda.StartPump();
    }
    
    //In this method we need to check if there is enough cash or not
    //If there us enough cash, then call PumpGas, otherwise call StopPump
    public void PumpLiter(){
        
        int cash = ds.getCash2();
        int L = ds.getL2();
        int price = ds.getPrice2();
        
        if(cash >= price*(L+1))
        {
            mda.PumpGas();
        }
        else
        {
            mda.StopPump();   
        }
    }
    
    public void Stop(){
        mda.StopPump();
    }
    
    public void Receipt(){
        mda.Receipt();
    }
    
    public void NoReceipt(){
        mda.NoReceipt();
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
