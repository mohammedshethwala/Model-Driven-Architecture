package AbstractFactoryPackage;
import Data.*;
import OutputProcessor.Strategy.*;
/**
 *
 * @author Mohammed
 * Design Pattern: Abstract Factory
 * This is an interface (abstract class) for the Abstract Factory Design Pattern
 * Concrete factories must implement all these methods
 */
public interface AbstractFactory {
 
    DataStore getDataStore();
    
    CancelMsg getCancelMsg();
    DisplayGas getDisplayGas();
    DisplayMenu getDisplayMenu();
    InitializeValues getInitializeValues();
    PayMsg getPayMsg();
    PrintReceipt getPrintReceipt();
    PumpGasUnit getPumpGasUnit();
    ReadyMsg getReadyMsg();
    RejectMsg getRejectMsg();
    ReturnCash getReturnCash();
    StopMsg getStopMsg();
    StoreCash getStoreCash();
    StoreData getStoreData();
    StorePrice getStorePrice();
}
