/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public abstract class TaxComputation {
    public abstract double computeTax(PurchasedItems items, ReceiptDate date);
    protected abstract boolean taxHoliday(ReceiptDate date);
}
