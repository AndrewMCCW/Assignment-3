
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awelsh4
 */
public class PurchasedItems {
    private ArrayList<StoreItem> items;
    
    public PurchasedItems()
    {
        items = new ArrayList<StoreItem>();
    }
    
    public void addItem (StoreItem item)
    {
        items.add(item);
    }
    
    public double getTotalCost()
    {
        double c = 0.0;
        for (int i = 0; i < items.size(); i++)
        {
           c = c + items.get(i).getItemPrice();   
        }
        return c; 
    }
    
    public boolean containsItem (String itemCode)
    {
       for (int i = 0; i < items.size(); i++)
       {
           if (items.get(i).getItemCode().equals(itemCode))
               return true;
       }
       return false;
    }

	public int size() {
		return items.size();
	}

	public StoreItem get(int i) {
		return items.get(i); 
	}

}
