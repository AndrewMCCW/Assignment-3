/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public class StoreItem {
    private String itemCode;
    private String itemDescription;
    private double itemPrice;
    
    public StoreItem (String code, String descript, double price)
    {
        itemCode = code;
        itemDescription = descript;
        itemPrice = price;
    }
    
    public void setItemCode(String c)
    {
        itemCode = c;
    }
    
    public String getItemCode()
    {
        return this.itemCode;
    }
    
    public void setItemDesc(String d)
    {
        itemDescription = d;
    }
    
    public String getItemDesc()
    {
        return this.itemDescription;
    }
    
    public void setItemPrice(double p)
    {
        itemPrice = p;
    }
    
    public double getItemPrice()
    {
        return itemPrice;
    }
}
