package AbstractFactoryPackage;
import Data.*;
import OutputProcessor.Strategy.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Abstract Factory
 * This is the Concrete Factory for GasPump1
 * The methods return the objects related to the GasPump1Factory
 */
public class GasPump1Factory implements AbstractFactory {

    @Override
    public DataStore getDataStore() {
        return new DataStore1();
    }

    @Override
    public CancelMsg getCancelMsg() {
       return new CancelMsg1(); 
    }

    @Override
    public DisplayGas getDisplayGas() {
        return new DisplayGas1();
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return  new DisplayMenu1();
    }

    @Override
    public InitializeValues getInitializeValues() {
        return  new InitializeValues1();
    }

    @Override
    public PayMsg getPayMsg() {
        return  new PayMsg1();
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt1();
    }

    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit1();
    }

    @Override
    public ReadyMsg getReadyMsg() {
        return new ReadyMsg1();
    }

    @Override
    public RejectMsg getRejectMsg() {
           return new RejectMsg1();
    }

    @Override
    public ReturnCash getReturnCash() {
           return new ReturnCash1();
    }

    @Override
    public StopMsg getStopMsg() {
        return new StopMsg1();
    }

    @Override
    public StoreCash getStoreCash() {
        return new StoreCash1();
    }

    @Override
    public StoreData getStoreData() {
        return new StoreData1();
    }

    @Override
    public StorePrice getStorePrice() {
        return new StorePrice1();
    }
    
    
    
}
