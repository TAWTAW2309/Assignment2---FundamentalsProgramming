/**
 * 
 */

/**
 * @author tawhid nubheebucus
 *
 */
public class Inventory {
	
    //attributes
	private String itemID;
	private String name;
	private String description;
	private String category;
	private String supplierName;
	private int supplierContacts;
	private double price;
	private double availableQty;
	
	/**
	 *default constructor 
	 */
	public Inventory() {
		super();
	}

	/**
	 * overloaded constructors
	 * @param itemID
	 * @param name
	 * @param description
	 * @param category
	 * @param supplierName
	 * @param supplierContacts
	 * @param price
	 * @param availableQty
	 */
	public Inventory(String itemID, String name, String description, String category, String supplierName,
			int supplierContacts, double price, double availableQty) {
		super();
		this.itemID = itemID;
		this.name = name;
		this.description = description;
		this.category = category;
		this.supplierName = supplierName;
		this.supplierContacts = supplierContacts;
		this.price = price;
		this.availableQty = availableQty;
	}
	
	//getter
	/**
	 * @return the itemID
	 */
	public String getItemID() {
		return itemID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * @return the supplierContacts
	 */
	public int getSupplierContacts() {
		return supplierContacts;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the availableQty
	 */
	public double getAvailableQty() {
		return availableQty;
	}

	//setter
	/**
	 * @param itemID the itemID to set
	 */
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	 * @param supplierContacts the supplierContacts to set
	 */
	public void setSupplierContacts(int supplierContacts) {
		this.supplierContacts = supplierContacts;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param availableQty the availableQty to set
	 */
	public void setAvailableQty(double availableQty) {
		this.availableQty = availableQty;
	}
	
	/**
	 * calculate total items
	 * return the available Qty * 
	 */
	
	public double totalItems(double availableQty, double category) {
		return 0;
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	public boolean equals(Inventory i) {
		if (this.itemID.equalsIgnoreCase(i.itemID)){
			return true;
			}
			else
				return false;
		}
	
	//String to String
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", supplierName=" + supplierName + ", supplierContacts=" + supplierContacts + ", price=" + price
				+ ", availableQty=" + availableQty + "]";
	}

	public static void totalinventory() {
		// TODO Auto-generated method stub
		
	}
	
}


