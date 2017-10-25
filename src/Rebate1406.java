/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public class Rebate1406 implements AddOn, Rebate {
    public boolean applies(PurchasedItems items)
    {
        return items.containsItem("1406");
    }
    
    public String getLines()
    {
        return "Mail-in Rebate for Item #1406\n" + "Name:\n" +
                "Address:\n\n" +
                "Mail To: Best Buy Rebates, P.O. Box 1400, Orlando, Fl";
    }
}
