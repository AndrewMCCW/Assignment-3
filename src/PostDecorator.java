/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public class PostDecorator extends Decorator {
    private AddOn a;
    
    public PostDecorator (AddOn a, Receipt r)
    {
        super(r);
        this.a = a;
    }
    
    public void prtReceipt()
    {
        callTrailer();
        System.out.println(a.getLines());
    }
}
