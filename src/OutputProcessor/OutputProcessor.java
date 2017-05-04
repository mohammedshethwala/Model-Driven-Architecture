package OutputProcessor;
import Data.*;
import AbstractFactoryPackage.*;
import MDA.MDAEFSM;
import MDA.StatePattern.*;
import OutputProcessor.Strategy.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Strategy
 * This class is an OutputProcessor class for both the GasPumps
 * This class also acts as a Context class for different strategy classes
 */
public class OutputProcessor {
    
    private DataStore d;
    private AbstractFactory af;

    private StoreData storeData;
    private PayMsg payMsg;
    private DisplayMenu displayMenu;
    private RejectMsg rejectMsg;
    private CancelMsg cancelMsg;
    private StoreCash storeCash;
    private StorePrice storePrice;
    private InitializeValues initializeValues;
    private ReadyMsg readyMsg;
    private StopMsg stopMsg;
    private PumpGasUnit pumpGasUnit;
    private DisplayGas displayGas;
    private ReturnCash returnCash;
    private PrintReceipt printReceipt;
    
    public OutputProcessor(AbstractFactory af, DataStore d)
    {
        this.af = af;
        this.d = d;
        
        storeData = af.getStoreData();
        payMsg = af.getPayMsg();
        displayMenu = af.getDisplayMenu();
        rejectMsg = af.getRejectMsg();
        cancelMsg = af.getCancelMsg();
        storeCash = af.getStoreCash();
        storePrice = af.getStorePrice();
        initializeValues = af.getInitializeValues();
        readyMsg = af.getReadyMsg();
        stopMsg = af.getStopMsg();
        pumpGasUnit = af.getPumpGasUnit();
        displayGas = af.getDisplayGas();
        returnCash = af.getReturnCash();
        printReceipt = af.getPrintReceipt(); 
    }
    
    public void StoreData()
    {
        storeData.StoreData(d);
    }
    
    public void PayMsg()
    {
        payMsg.PayMsg();
    }
    
    public void DisplayMenu()
    {
        displayMenu.DisplayMenu();
    }
    
    public void RejectMsg()
    {
        rejectMsg.RejectMsg();
    }
    
    public void CancelMsg()
    {
        cancelMsg.CancelMsg(d);
    }
    
    public void StoreCash()
    {
        storeCash.StoreCash(d);
    }
    
    public void StorePrice(int g)
    {
        storePrice.StorePrice(g, d);
    }
    
    public void InitializeValues()
    {
        initializeValues.InitializeValues(d);
    }
    
    public void ReadyMsg()
    {
        readyMsg.ReadyMsg();
    }
    
    public void StopMsg()
    {
        stopMsg.StopMsg(d);
    }
    
    public void PumpGasUnit()
    {
        pumpGasUnit.PumpGasUnit(d);
    }
    
    public void DisplayGas()
    {
        displayGas.DisplayGas(d);
    }
    
    public void ReturnCash()
    {
        returnCash.ReturnCash(d);
    }
    
    public void PrintReceipt()
    {
        printReceipt.PrintReceipt(d);
    }
    
    //getter and setter methods
    public DataStore getD() {
        return d;
    }

    public void setD(DataStore d) {
        this.d = d;
    }

    public AbstractFactory getAf() {
        return af;
    }

    public void setAf(AbstractFactory af) {
        this.af = af;
    }
    
}
