/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public class HolidayGreeting implements AddOn, SecondaryHeading {
    public boolean applies(PurchasedItems items)
    {
        return true;
    }
    
    public String getLines()
    {
        return "*Happy Holidays from Best Buy*";
    }
    
}
