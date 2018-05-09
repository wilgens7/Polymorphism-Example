

public class LibraryDriver{

	private static DVD dvd;
	private static Journal journal;
	private static LibraryItem misteryItem;
	
	public static void main(String[] args){
		//new line to add space
		System.out.println();

		dvd = new DVD("My DVD","The publisher","345.432");
		dvd.watch();

		journal = new Journal("My Journal", "The publisher","123.321");
		journal.read();


		//mistery activities
		misteryItem = new DVD("My misteryItem", "THe publisher", "321.345");
		System.out.println(misteryItem.getItemType());

		misteryItem = new Journal("My misteryItem", "THe publisher", "321.345");
		System.out.println(misteryItem.getItemType());

		misteryItem = new LibraryItem("My misteryItem", "THe publisher", "321.345");
		System.out.println(misteryItem.getItemType());


		System.out.println("\n POLYMORPHISM!!! \n");



	}
}