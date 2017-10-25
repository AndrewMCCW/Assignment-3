
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public class BasicReceipt implements Receipt {
    private String storeInfo;
    private String stateCode;
    
    private PurchasedItems items;
    private ReceiptDate date;
    private TaxComputation tc;
    
    public BasicReceipt (PurchasedItems items)
    {
        this.items = items;
    }
    
    public void setTaxComputation(TaxComputation tc)
    {
        this.tc = tc;
    }
    
    public void setDate (ReceiptDate date)
    {
        this.date = date;
    }
    
    public void prtReceipt()
    {
        System.out.println(this.storeInfo);
        System.out.println(this.stateCode);
        System.out.println(this.date.getDate());
        
        for (int i = 0; i < items.size(); i++)
        {
        	System.out.println(items.get(i).getItemCode() + " " + items.get(i).getItemDesc() + " " + items.get(i).getItemPrice());
        }
        
        System.out.println("Subtotal is: " + " " +  items.getTotalCost());
        double total = tc.computeTax(items, date) + items.getTotalCost();
        System.out.println("Total with Tax is: " + total);
        
    }
}
