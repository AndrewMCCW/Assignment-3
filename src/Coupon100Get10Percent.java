
public class Coupon100Get10Percent implements AddOn, Coupon {
	public boolean applies(PurchasedItems items) {
		if(items.getTotalCost() > 100.00)
			return true;
		return false;
	}
	
	public String getLines()
	{
		return "Coupon has been accepted, You get 10% back!";
	}
}
