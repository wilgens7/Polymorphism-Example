
/**
*
* Used to create a DVD item. It is a child class of LibraryItem.
*@see LibraryItem
*
*@author Wilgens Pierre
*@version %I%,%G%
*
*/
public class DVD extends LibraryItem{

	private int lengthInMinutes;
	private int storageCapacity;
	private boolean isRewritable;


	/**
	*
	* Sets initial values for DVD item
	*
	*@param title the title of the item 
	*@param publisher the publisher of the item
	*@param deweyDecimalClassification the dewey decimal classification for the item
	*/
	
	//constructor
	public DVD(String title, String publisher, String deweyDecimalClassification){
		super(title, publisher, deweyDecimalClassification);
		//System.out.println("New DVD created.");
	}

	/**
	*
	* {@inheritDoc}
	*/
	//overidden methods
	public String getItemType(){

		return super.getItemType()+"\nYou can watch it...just not with DVD's watch method.lol\n";
	}

	/**
	*
	* plays dvd from beginning
	*/
	public void watch(){

		System.out.println("Watching dvd...\n");
	}


	/**
	*
	* erases content of disc and replaces with new content
	*/
	public void rewrite(){

		if(isRewritable==true){
			System.out.println("Content erased and replaced.");
		}

		else{
			System.out.println("This DVD is not rewritable.");
		}
	}
}