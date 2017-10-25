/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public class MATaxComputation extends TaxComputation {

    @Override
    public double computeTax (PurchasedItems items, ReceiptDate date)
    {
        if (taxHoliday(date))
            return 0.0;
        return items.getTotalCost() * 0.0625;
    }
    
    @Override
    protected boolean taxHoliday (ReceiptDate date)
    {
        if (date.getDate().equals("13/08/2016") || date.getDate().equals("14/08/2016"))
            return true;
        return false;
    }
}
