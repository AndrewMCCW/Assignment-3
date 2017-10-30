/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public class CATaxComputation extends TaxComputation {
	
	private String statecode;
	
	@Override
    public double computeTax (PurchasedItems items, ReceiptDate date)
    {
        if(taxHoliday(date))
            return 0.0;
        return items.getTotalCost(); 
    }
    
    @Override
    protected boolean taxHoliday (ReceiptDate date)
    {
        return false;
    }
    
    public String getStateCode()
    {
    	return statecode;
    }
}
