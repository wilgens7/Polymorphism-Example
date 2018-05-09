


public class LibraryItem{
	
	private String title;
	private String publisher;
	private String deweyDecimalClassification;

	/**
	*
	* Sets initial values for library items
	*
	*@param title the title of the item 
	*@param publisher the publisher of the item
	*@param deweyDecimalClassification the dewey decimal classification for the item
	*/

	//constructor
	public LibraryItem(String title, String publisher, String deweyDecimalClassification){

		this.title = title;
		this.publisher = publisher;
		this. deweyDecimalClassification = deweyDecimalClassification;

		System.out.println("New "+this.getClass().getSimpleName()+" created. \n");
		
	}


	/**
	*
	* temporarily moves item from list of available items
	*/

	public void checkOutItem(){

		System.out.println("You checked out this item: "+ this.title);
	}

	/**
	*
	* adds item back to list of available items
	*/

	public void returnItem(){

		System.out.println("You have returned this item: "+ this.title);
	}

	/**
	*
	* returns the name of the class that the item belongs to
	*
	*@return the class name in form of a String
	*/

	public String getItemType(){
		return this.title +" is a "+ this.getClass().getSimpleName() +".\n";
	}

}