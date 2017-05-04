package Data;
/**
 *
 * @author Mohammed
 * This is the concrete DataStore for GasPump2
 * All the temporary and execution related data is stored in this class
 * Apart from the variables, this class has all the getter and setter methods for all variables
 */
public class DataStore2 extends DataStore{
    
    private int Rprice2, Sprice2, Pprice2;
    private int price2;
    private int cash2;
    private int total2;
    private int L2;
    private int temp_a2, temp_b2, temp_c2;
    private int temp_cash2;

    public int getRprice2() {
        return Rprice2;
    }

    public void setRprice2(int Rprice2) {
        this.Rprice2 = Rprice2;
    }

    public int getSprice2() {
        return Sprice2;
    }

    public void setSprice2(int Sprice2) {
        this.Sprice2 = Sprice2;
    }

    public int getPprice2() {
        return Pprice2;
    }

    public void setPprice2(int Pprice2) {
        this.Pprice2 = Pprice2;
    }

    public int getPrice2() {
        return price2;
    }

    public void setPrice2(int price2) {
        this.price2 = price2;
    }

    public int getCash2() {
        return cash2;
    }

    public void setCash2(int cash2) {
        this.cash2 = cash2;
    }

    public int getTotal2() {
        return total2;
    }

    public void setTotal2(int total2) {
        this.total2 = total2;
    }

    public int getL2() {
        return L2;
    }

    public void setL2(int L2) {
        this.L2 = L2;
    }

    public int getTemp_a2() {
        return temp_a2;
    }

    public void setTemp_a2(int temp_a2) {
        this.temp_a2 = temp_a2;
    }

    public int getTemp_b2() {
        return temp_b2;
    }

    public void setTemp_b2(int temp_b2) {
        this.temp_b2 = temp_b2;
    }

    public int getTemp_c2() {
        return temp_c2;
    }

    public void setTemp_c2(int temp_c2) {
        this.temp_c2 = temp_c2;
    }

    public int getTemp_cash2() {
        return temp_cash2;
    }

    public void setTemp_cash2(int temp_cash2) {
        this.temp_cash2 = temp_cash2;
    }

    @Override
    public float getRprice1() {
        return 0;
    }

    @Override
    public void setRprice1(float Rprice1) {
    }

    @Override
    public float getSprice1() {
        return 0;
    }

    @Override
    public void setSprice1(float Sprice1) {
    }

    @Override
    public float getPrice1() {
        return 0;
    }

    @Override
    public void setPrice1(float price1) {
    }

    @Override
    public float getTotal1() {
        return 0;
    }

    @Override
    public void setTotal1(float total1) {
    }

    @Override
    public int getG1() {
        return 0;
    }

    @Override
    public void setG1(int G1) {
    }

    @Override
    public float getTemp_a1() {
        return 0;
    }

    @Override
    public void setTemp_a1(float temp_a1) {
    }

    @Override
    public float getTemp_b1() {
        return 0;
    }

    @Override
    public void setTemp_b1(float temp_b1) {
    }
    
}
