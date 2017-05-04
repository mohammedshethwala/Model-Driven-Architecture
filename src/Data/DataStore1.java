package Data;
/**
 *
 * @author Mohammed
 * This is the concrete DataStore class for GasPump1
 * All the temporary and execution related data is stored in this class
 * Apart from the variables, this class has all the getter and setter methods for all variables
 */
public class DataStore1 extends DataStore {
    
    private float Rprice1, Sprice1;
    private float price1;
    private float total1;
    private int G1;
    private float temp_a1, temp_b1;

    public float getRprice1() {
        return Rprice1;
    }

    public void setRprice1(float Rprice1) {
        this.Rprice1 = Rprice1;
    }

    public float getSprice1() {
        return Sprice1;
    }

    public void setSprice1(float Sprice1) {
        this.Sprice1 = Sprice1;
    }

    public float getPrice1() {
        return price1;
    }

    public void setPrice1(float price1) {
        this.price1 = price1;
    }

    public int getG1() {
        return G1;
    }

    public void setG1(int G1) {
        this.G1 = G1;
    }

    public float getTemp_a1() {
        return temp_a1;
    }

    public void setTemp_a1(float temp_a1) {
        this.temp_a1 = temp_a1;
    }

    public float getTemp_b1() {
        return temp_b1;
    }

    public void setTemp_b1(float temp_b1) {
        this.temp_b1 = temp_b1;
    }

    public float getTotal1() {
        return total1;
    }

    public void setTotal1(float total1) {
        this.total1 = total1;
    }

    @Override
    public int getRprice2() {
        return 0;
    }

    @Override
    public void setRprice2(int Rprice2) {
    }

    @Override
    public int getSprice2() {
        return 0;
    }

    @Override
    public void setSprice2(int Sprice2) {
    }

    @Override
    public int getPprice2() {
        return 0;
    }

    @Override
    public void setPprice2(int Pprice2) {
    }

    @Override
    public int getPrice2() {
        return 0;
    }

    @Override
    public void setPrice2(int price2) {
    }

    @Override
    public int getCash2() {
        return 0;    
    }

    @Override
    public void setCash2(int cash2) {
    }

    @Override
    public int getTotal2() {
        return 0;
    }

    @Override
    public void setTotal2(int total2) {
    }

    @Override
    public int getL2() {
        return 0;
    }

    @Override
    public void setL2(int L2) {
    }

    @Override
    public int getTemp_a2() {
        return 0;
    }

    @Override
    public void setTemp_a2(int temp_a2) {

    }

    @Override
    public int getTemp_b2() {
        return 0;
    }

    @Override
    public void setTemp_b2(int temp_b2) {
        
    }

    @Override
    public int getTemp_c2() {
        return 0;
    }

    @Override
    public void setTemp_c2(int temp_c2) {
    }

    @Override
    public int getTemp_cash2() {
        return 0;
    }

    @Override
    public void setTemp_cash2(int temp_cash2) {
    }
    
}
