import java.util.Scanner;


public class StringCell extends Cell {

	private String starter;			// String used to initialize the Cell 
	private String value;			// Value of cell
	
	public StringCell()
	{
		// Used to create an empty StringCell for comparison
	}
	
	public StringCell(String initial, Scanner s) {
		starter = initial;
		value = s.next();
		System.out.println("Value of StringCell is: " + value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void printCell()
	{
		int fSpaces = 0, lSpaces = 0;
		
		// Handle the case where the string is > 12 chars
		
		fSpaces = (12 - (value.length() - 2))/2;
		lSpaces = 12 - (value.length() - 2) - fSpaces;
//		System.out.println("fSpaces:\t" + fSpaces + "\tlSpaces:\t" + lSpaces);
		
		for (int i=0; i<fSpaces; i++)	{
			System.out.print(" ");
		}
		System.out.print(value.substring(1, value.length()-1));
		for (int i=0; i<lSpaces; i++)	{
			System.out.print(" ");
		}
		System.out.print("|");
	}
	
	public String getValue()
	{
		return value;
	}

}