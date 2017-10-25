/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public class ReceiptFactory {
    String header;
    String state_code;
    
    private TaxComputation[] taxComputationObjs;
    private AddOn[] addOns;
    
    public ReceiptFactory()
    {
    	TaxComputation MD, CA, MA;
    	AddOn rebate, coupon, greeting;
        taxComputationObjs = new TaxComputation[] {
        		MD = new MDTaxComputation(), CA = new CATaxComputation(), MA = new MATaxComputation()
        };
        
        addOns = new AddOn[] {
        		rebate = new Rebate1406(), coupon = new Coupon100Get10Percent(), greeting = new HolidayGreeting()
        };
    }
    
    public void setState (String s)
    {
    	state_code = s;
    }
    
    public Receipt getReceipt (PurchasedItems items, ReceiptDate date)
    {
       Decorator pre, post; 
       BasicReceipt b = new BasicReceipt(items);
       b.setDate(date);
       
       b.setTaxComputation(taxComputationObjs[0]);
       
       for (int i = 0; i < addOns.length; i++)
       {
    	   if(addOns[i].applies(items) && addOns[i] instanceof SecondaryHeading)
    	   {
    		  pre = new PreDecorator(addOns[i], b);
    	   }
    	   
    	   if ((addOns[i].applies(items) && addOns[i] instanceof Rebate) || (addOns[i].applies(items) && addOns[i] instanceof Coupon))
    	   {
    		   post = new PostDecorator (addOns[i], b);
    	   }
       }
       return b; 
    }
}
