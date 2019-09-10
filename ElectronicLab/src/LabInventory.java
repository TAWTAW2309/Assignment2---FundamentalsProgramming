/**
 * 
 */
import java.util.*;

/**
 * @author Tawhid nubheebucus
 *
 */
public class LabInventory {
	 

	/**
	 * 
	 */
	public LabInventory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		
		//create variable
		String itemID = null;
		String name = null;
		String description = null;
		String category = null;
		String supplierName = null;
		int contact = 0;
		int price = 0;
		int AvailableQty = 0;
		
System.out.println("LabInventory\n");
		
		System.out.println("All the option\n");
		System.out.println("1. Enter a new Item to the inventory\n"
				+ "2. Change information of an existing Item\n"
				+ "3. Display all the Items with the specified category\n"
				+ "4. Display all Items to be re-ordered\n"
				+ "5. Number of Items currently in store\n"
				+ "6. Quit\n");
		
		//Scanner,itemdatabase, the number of item size
		int size;
		System.out.print("Enter the max number of items:");
		size= myScanner.nextInt();
		Inventory[] itemDatabase = new Inventory[size];
		System.out.println("Max items that can store:"+size+" items\n");
		
		int option = 0;
		System.out.print("which option do you choose:option1, option2, option3, option4, option5, option6");
		option = myScanner.nextInt();
		
		//option1
		if (option ==1) {
			int items = 0;
			System.out.print("how many items do you want to enter");
			items = myScanner.nextInt();
			
			for (int i = 0; (i<itemDatabase.length & i<items); i++) {
				
			System.out.println("please enter details for item");
			
			System.out.print("ItemID:");
			itemID = myScanner.next();
			
			System.out.print("name:");
			name = myScanner.next();
			
			System.out.print("Description:");
			description = myScanner.next();
			
			System.out.print("Category:");
			category = myScanner.next();
			
			System.out.print("Suppliername:");
			supplierName = myScanner.next();
			
			System.out.print("contact:");
			contact = myScanner.nextInt();
			
			System.out.print("price:");
			price = myScanner.nextInt();
			
			System.out.print("quantity:");
			AvailableQty = myScanner.nextInt();
			
			itemDatabase[i] = new Inventory(itemID, name, description, category, supplierName, contact, price, AvailableQty); 
			itemDatabase[i].setItemID(itemID);
			itemDatabase[i].setName(name);
			itemDatabase[i].setDescription(description);
			itemDatabase[i].setSupplierName(supplierName);
			itemDatabase[i].setSupplierContacts(contact);
			itemDatabase[i].setAvailableQty(AvailableQty);
			itemDatabase[i].setPrice(price);
			
			System.out.println("All details of" + itemDatabase[i]);
			
			}
		}
		
		
		//option2 - update an item information
		else if (option == 2);
		System.out.println("which item do you want to update");
		System.out.println("Name, Description, Category, supplier name, supplier contact. price, AvailableQty, Quit");

		int update = 0;
		System.out.println("Enter the item you want to update");
		update = myScanner.nextInt();
		
		if (update ==1) {
			System.out.print("Enter New Name");
			name = myScanner.next();
			System.out.println("The new name for item number is now "+name);
		}
		else if (update ==2) {
		System.out.print("Enter new description");
		description = myScanner.next();
		System.out.println("The new description for the item is now"+ description);
		}
		else if (update ==3) {
		System.out.print("Enter new category");
		category = myScanner.next();
		System.out.print("The new category for the item is now"+ category);
		}
		else if(update ==4) {
			System.out.print("Enter the new supplier name");
			supplierName = myScanner.next();
			System.out.print("The new supplier name is now"+ supplierName);
		}
		else if(update ==5) {
			System.out.print("Enter the new supplier contact");
				contact = myScanner.nextInt();
				System.out.print("The new supplier contact is"+ contact);
				}
		else if(update ==6) {
			System.out.print("enter the new price");
			price = myScanner.nextInt();
			System.out.print("The new price of the item is"+ price);
			}
		else if(update ==7) {
			System.out.print("Enter the new quantity");
			AvailableQty = myScanner.nextInt();
			System.out.print("The new quantity is "+AvailableQty);
		}
		else if(update ==8) {
			System.out.print("System has been quit");
			System.exit(0);
		}
		
		
		//option 4 need to re-ordered item
		else if(option ==4);
		int i = 0;
		System.out.print("which Items need to be re ordered");
		itemDatabase[i].getAvailableQty();
		if(AvailableQty<5) {
			System.out.print("Need to be Re ordered");
		}
		
		//option5
	      if(option == 5) {
	    	 System.out.println("the total number of items that has been created so far is:");
	    	 Inventory.totalinventory();
	     }
		
		//option6
	      if(option == 6)
	      {
	       System.out.print("system shut down");
	       System.exit(0);
	       }
	
		
		
		
	}

	private static char[] totalinventory(int availableQty, String category) {
		// TODO Auto-generated method stub
		return null;
	}

}
