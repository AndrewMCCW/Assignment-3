/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author awelsh4
 */
public class ReceiptFactory {
    String header;
    String state_code;
    
    private TaxComputation[] taxComputationObjs;
    private AddOn[] addOns;
    private TaxComputation tc;
    private StoreHeader sh;
    public ReceiptFactory() throws FileNotFoundException
    {
    	TaxComputation MD, CA, MA;
    	AddOn rebate, coupon, greeting;
    	
    	//reads through config file and sets storeheader.
    	String file = "C:\\Users\\Andre\\Documents\\Eclipse WorkSpace\\Assignment 3\\src\\config.txt";
    	String[] data = new String[4];
    	int count = 0;
    	Scanner reader = new Scanner(new File(file));
    	while (reader.hasNextLine())
    	{
    		data[count] = reader.nextLine();
    		System.out.println(data[count]);
    		count++;
    	}
    	reader.close();
    	sh = new StoreHeader(data[0], data[1], data[2], data[3]);
    	
    	//gathers all "relevant" information
        taxComputationObjs = new TaxComputation[] {
        		MD = new MDTaxComputation(), CA = new CATaxComputation(), MA = new MATaxComputation()
        };
        
        addOns = new AddOn[] {
        		rebate = new Rebate1406(), coupon = new Coupon100Get10Percent(), greeting = new HolidayGreeting()
        };
        
        //sets local tc to appropriate one.
        for (int i = 0; i < taxComputationObjs.length; i++)
        {
        	if (sh.getStateCode().equals(taxComputationObjs[i].getStateCode()))
        	{
        		tc = taxComputationObjs[i];
        	}
        }
        
        
    }
    
    
    public Receipt getReceipt (PurchasedItems items, ReceiptDate date)
    {
       
       System.out.println(sh.toString());
       Decorator pre, post; 
       BasicReceipt b = new BasicReceipt(items);
       
       for (int i = 0; i < addOns.length; i++)
       {
    	   if(addOns[i].applies(items) && addOns[i] instanceof SecondaryHeading)
    	   {
    		  pre = new PreDecorator(addOns[i], b);
    	   }
       }
       
       b.setDate(date);
       b.setTaxComputation(tc);
       
	   for (int i = 0; i < addOns.length; i++)
	   {
	    	   if ((addOns[i].applies(items) && addOns[i] instanceof Rebate) || (addOns[i].applies(items) && addOns[i] instanceof Coupon))
	    	   {
			   post = new PostDecorator (addOns[i], b);
	    	   }
	   }
       return b; 
    }
}
