/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public abstract class Decorator implements Receipt {
    private Receipt trailer;
    
    public Decorator (Receipt r)
    {
        trailer = r;
    }
    
    public void callTrailer() 
    {
        trailer.prtReceipt();
    }
    
    public abstract void prtReceipt();
    
}
