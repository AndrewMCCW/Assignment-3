
public class StoreHeader {
	private String street_addr;
	private String state_code;
	private String phone_num;
	private String store_num;
	
	public StoreHeader (String street, String state, String phone, String store)
	{
		this.street_addr = street;
		this.state_code = state;
		this.phone_num = phone;
		this.store_num = store;
	}
	
	public String getStoreCode()
	{
		return store_num;
	}
	
	public String getStateCode()
	{
		return state_code;
	}
	public String toString()
	{
		return street_addr + "\n" + state_code + "\n" + phone_num + "\n" + "Store Number: " + store_num;
	}

}
