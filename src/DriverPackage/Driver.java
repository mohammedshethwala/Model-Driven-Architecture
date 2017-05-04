package DriverPackage;
import AbstractFactoryPackage.*;
import Data.*;
import MDA.*;
import MDA.StatePattern.*;
import InputProcessor.*;
import OutputProcessor.*;
import OutputProcessor.Strategy.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Mohammed
 * This is the driver class for the GasPump components
 * All the methods to the GasPump1 and GasPump2 components are called from this class
 */
public class Driver {
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	String input = null;
    	int choice = 1;
        
        System.out.println(" ******** CS 586 Project Demo - Spring'17 *******" );
        System.out.println(" ************* by Mohammed Shethwala ************" );
        
        System.out.println("");
    	
        //Prompting user to select any one GasPump
        System.out.println(" **************** Select Gas Pump ***************" );
        System.out.println("                  1. Gas Pump-1" );
        System.out.println("                  2. Gas Pump-2" );
        
        try {
            input = bufferedReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //If user selects GasPump1
        if(input.equalsIgnoreCase("1"))
        {
            //Creating GasPump1Factory, DataStore, OutputProcessor, MDAEFSM and GasPump1 objects
            AbstractFactory af = new GasPump1Factory();
            DataStore ds = af.getDataStore();
            OutputProcessor op = new OutputProcessor(af, ds);
            MDAEFSM mda = new MDAEFSM(op);
            GasPump1 gp1 = new GasPump1(mda, ds);
            
            System.out.println("*************************************");
            System.out.println("          Gas Pump-1" );	
            System.out.println("          MENU of Operations" );
            System.out.println("          1. Activate(a,b)" );
            System.out.println("          2. Start()" );
            System.out.println("          3. PayCredit()" );
            System.out.println("          4. Approved()" );
            System.out.println("          5. Reject()" );
            System.out.println("          6. Cancel()" );
            System.out.println("          7. Regular()" );
            System.out.println("          8. Super()" );
            System.out.println("          9. StartPump()" );
            System.out.println("          10. PumpGallon()" );
            System.out.println("          11. StopPump()" );
            System.out.println("          q. Quit" );	
            System.out.println("  Please make a note of these operations" );
            System.out.println("");
            System.out.println("           Gas Pump-1 Execution" );
            System.out.println("*************************************");
            
            while(true)
            {
                System.out.println("");
                System.out.println("  Select Operation: ");
                System.out.println("1-Activate,2-Start,3-PayCredit,4-Approved,5-Reject,6-Cancel,7-Regular,8-Super,9-StartPump,10-PumpGallon,11-StopPump,q-Quit");

                //getting the input from the user
                try {
                    input = bufferedReader.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
                }

                if(input.isEmpty()) continue;
                //if input is q, then the application will quit
                if(input.equalsIgnoreCase("q"))
                    break;

                choice = Integer.parseInt(input);
                
                switch(choice)
                {
                    case 1:   //Activate(a,b)
                            float a,b;
                            //getting values of a and b from the user
                            System.out.println("\n  Operation:  Activate(float a, float b)");
                            System.out.println("   Enter value of a:");
                            a = in.nextFloat();
                            System.out.println("   Enter value of b:");
                            b = in.nextFloat();
                            gp1.Activate(a, b);
                            break;
                    
                    case 2:   //Start()
                            System.out.println("\n  Operation:  Start()");
                            gp1.Start();
                            break;
                            
                    case 3:   //PayCredit()
                            System.out.println("\n  Operation:  PayCredit()");
                            gp1.PayCredit();
                            break;
                    
                    case 4:   //Approved()
                            System.out.println("\n  Operation:  Approved()");
                            gp1.Approved();
                            break;        
                    
                    case 5:   //Reject()
                            System.out.println("\n  Operation:  Reject()");
                            gp1.Reject();
                            break;
                            
                    case 6:   //Cancel()
                            System.out.println("\n  Operation:  Cancel()");
                            gp1.Cancel();
                            break;
                            
                    case 7:   //Regular()
                            System.out.println("\n  Operation:  Regular()");
                            gp1.Regular();
                            break;
                            
                    case 8:   //Super()
                            System.out.println("\n  Operation:  Super()");
                            gp1.Super();
                            break;
                            
                    case 9:   //StartPump()
                            System.out.println("\n  Operation:  StartPump()");
                            gp1.StartPump();
                            break;
                            
                    case 10:   //PumpGallon()
                            System.out.println("\n  Operation:  PumpGallon()");
                            gp1.PumpGallon();
                            break;
                            
                    case 11:   //StopPump()
                            System.out.println("\n  Operation:  StopPump()");
                            gp1.StopPump();
                            break;
                            
                    default:  //Invalid choice
                            System.out.println("Invalid Choice");
                            break;
                }
            }
            
            System.out.println("Thanks for using Gas pump - 1" );
            
        }
        
        //If user selects GasPump2
        else if(input.equalsIgnoreCase("2"))
        {
            AbstractFactory af = new GasPump2Factory();
            DataStore ds = af.getDataStore();
            OutputProcessor op = new OutputProcessor(af, ds);
            MDAEFSM mda = new MDAEFSM(op);
            GasPump2 gp2 = new GasPump2(mda, ds);
            
            System.out.println("*************************************");
            System.out.println("          Gas Pump-2" );	
            System.out.println("          MENU of Operations" );
            System.out.println("          1. Activate(a,b,c)" );
            System.out.println("          2. Start()" );
            System.out.println("          3. PayCash(c)" );
            System.out.println("          4. Cancel()" );
            System.out.println("          5. Premium()" );
            System.out.println("          6. Regular()" );
            System.out.println("          7. Super()" );
            System.out.println("          8. StartPump()" );
            System.out.println("          9. PumpLiter()" );
            System.out.println("          10. Stop()" );
            System.out.println("          11. Receipt()" );
            System.out.println("          12. NoReceipt()" );
            System.out.println("          q. Quit" );	
            System.out.println("  Please make a note of these operations" );	  	    	
            System.out.println("           Gas Pump-2 Execution" );
            
            while(true)
            {
                System.out.println("");
                System.out.println("  Select Operation: ");
                System.out.println("1-Activate,2-Start,3-PayCash,4-Cancel,5-Premium,6-Regular,7-Super,8-StartPump,9-PumpLiter,10-Stop,11-Receipt,12-NoReceipt,q-Quit");

                try {
                    input = bufferedReader.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
                }

                if(input.isEmpty()) continue;
                if(input.equalsIgnoreCase("q"))
                    break;

                choice = Integer.parseInt(input);
                
                switch(choice)
                {
                    case 1:   //Activate(a,b,c)
                            int a,b,c;
                            System.out.println("\n  Operation:  Activate(int a, int b, int c)");
                            System.out.println("   Enter value of a:");
                            a = in.nextInt();
                            System.out.println("   Enter value of b:");
                            b = in.nextInt();
                            System.out.println("   Enter value of c:");
                            c = in.nextInt();
                            gp2.Activate(a,b,c);
                            break;
                    
                    case 2:   //Start()
                            System.out.println("\n  Operation:  Start()");
                            gp2.Start();
                            break;
                            
                    case 3:   //PayCash(c)
                            int cash;
                            System.out.println("\n  Operation:  PayCash(int c)");
                            System.out.println("   Enter value of c:");
                            cash = in.nextInt();
                            gp2.PayCash(cash);
                            break;
                    
                    case 4:   //Cancel()
                            System.out.println("\n  Operation:  Cancel()");
                            gp2.Cancel();
                            break;        
                    
                    case 5:   //Premium()
                            System.out.println("\n  Operation:  Premium()");
                            gp2.Premium();
                            break;
                            
                    case 6:   //Regular()
                            System.out.println("\n  Operation:  Regular()");
                            gp2.Regular();
                            break;
                            
                    case 7:   //Super()
                            System.out.println("\n  Operation:  Super()");
                            gp2.Super();
                            break;
                            
                    case 8:   //StartPump()
                            System.out.println("\n  Operation:  StartPump()");
                            gp2.StartPump();
                            break;
                            
                    case 9:   //PumpLiter()
                            System.out.println("\n  Operation:  PumpLiter()");
                            gp2.PumpLiter();
                            break;
                            
                    case 10:   //Stop()
                            System.out.println("\n  Operation:  Stop()");
                            gp2.Stop();
                            break;
                            
                    case 11:   //Receipt()
                            System.out.println("\n  Operation:  Receipt()");
                            gp2.Receipt();
                            break;
                            
                    case 12:   //NoReceipt()
                            System.out.println("\n  Operation:  NoReceipt()");
                            gp2.NoReceipt();
                            break;
                            
                    default:  //Invalid choice
                            System.out.println("Invalid Choice");
                            break;
                }
            }
            
            System.out.println("Thanks for using Gas Pump - 2" );
        }
  
    }
    
}
