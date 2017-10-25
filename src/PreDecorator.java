/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public class PreDecorator extends Decorator {
    private AddOn a;
    
    public PreDecorator (AddOn a, Receipt r) 
    {
        super(r);
        this.a = a;
    }
    
    public void prtReceipt()
    {
        System.out.println(a.getLines());
        callTrailer();
    }
    
}
