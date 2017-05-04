/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;
/**
 *
 * @author Mohammed
 * Design Pattern: State
 * Class corresponding to the state S6
 */
public class S6 extends State {
    
    public S6(MDAEFSM mda, OutputProcessor op)
    {
        this.mda = mda;
        this.op = op;
    }
    
    //print receipt and return cash and change state back to S0
    public void Receipt()
    {
        op.PrintReceipt();
        op.ReturnCash();
        mda.ChangeState(0);
    }
    
    //return cash and change state to S0
    public void NoReceipt()
    {
        op.ReturnCash();
        mda.ChangeState(0);
    }
            
    
}
