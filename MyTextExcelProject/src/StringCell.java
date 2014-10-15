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
		String noQuotes = value.substring(1, (value.length() - 1));
		
		// Handle the case where the string is > CELL_WIDTH chars
		if (noQuotes.length() > CELL_WIDTH)
		{
			// Print out only the first 11 characters and append with ">"
			System.out.print(noQuotes.substring(0,11) + ">");
		}
		else
		{
			fSpaces = (CELL_WIDTH - noQuotes.length())/2;
			lSpaces = CELL_WIDTH - noQuotes.length() - fSpaces;
//			System.out.println("fSpaces:\t" + fSpaces + "\tlSpaces:\t" + lSpaces);
		
			for (int i=0; i<fSpaces; i++)	{
				System.out.print(" ");
			}
			System.out.print(noQuotes);
			for (int i=0; i<lSpaces; i++)	{
				System.out.print(" ");
			}
		}
		System.out.print("|");
	}
	
	public String getValue()
	{
		return value;
	}

}
