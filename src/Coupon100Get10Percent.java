
public class Coupon100Get10Percent implements AddOn, Coupon {
	public boolean applies(PurchasedItems items) {
		return true;
	}
	
	public String getLines()
	{
		return "Coupon has been accepted, You get 10% back!";
	}
}
