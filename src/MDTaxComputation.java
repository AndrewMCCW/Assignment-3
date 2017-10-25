/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public class MDTaxComputation extends TaxComputation {
	
	String state_code;
	
	public MDTaxComputation()
	{
		this.state_code = "MD";
	}
	
    @Override
    public double computeTax (PurchasedItems items, ReceiptDate date)
    {
        if (taxHoliday(date))
            return 0.0;
        return items.getTotalCost() * 0.06;
    }
    
    @Override
    protected boolean taxHoliday (ReceiptDate date)
    {
        return false;
    }
}
