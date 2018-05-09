
/**
*
* Used to create a Journal item. It is a child class of LibraryItem.
*@see LibraryItem
*
*@author Wilgens Pierre
*@version %I%,%G%
*
*/
public class Journal extends LibraryItem{

	private int numberOfPages;
	private int numberOfChapters;
	private int currentPage;
	private int numberOfPagesLeft;

	private String type; 


	/**
	*
	* Sets initial values for Journal
	*
	*@param title the title of the item 
	*@param publisher the publisher of the item
	*@param deweyDecimalClassification the dewey decimal classification for the item
	*/

	//constructor
	public Journal(String title, String publisher, String deweyDecimalClassification){
		super(title, publisher, deweyDecimalClassification);
		//System.out.println("New journal created.");
	}

	/**
	*
	* {@inheritDoc}
	*/
	//overidden methods
	public String getItemType(){
		
		return super.getItemType()+ "\nYou can read it...just not with Journal's. read method.lol\n";
	}

	/**
	*
	* displays first page of the journal
	*/
	public void read(){

		System.out.println("Reading journal... \n");
	}

	/**
	*
	* increments current page number by one 
	*/
	public void turnPage(){

		if(numberOfPages==currentPage){
			closeJournal();
		}

		else{
			currentPage++;
		}
		
	}

	/**
	*
	* sets current page to 1
	*/
	public void openJournal(){
		System.out.println("Journal opened. ");
		currentPage=1;
	}

	/**
	*
	* closes journal
	*/
	public void closeJournal(){
		System.out.println("Journal closed. ");
		currentPage=0;
	}

}