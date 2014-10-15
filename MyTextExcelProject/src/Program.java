import java.util.*;

public class Program
{
	static Spreadsheet sheet;
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to TextExcel!");
		
		System.out.println("Creating Spreadsheet");
		sheet = new Spreadsheet (10,7);
		
		System.out.println("Opening Console for Input...");
		Scanner console = new Scanner(System.in);
		
		processCommands(console, false);

	}
	
	public static void processCommands(Scanner s, Boolean isFile)
	{
		Boolean quit = false;
		String str;
		String cellId;
		Scanner line;
		
		while (!quit)
		{
			if (!isFile)  System.out.print("Enter a command:  ");
			str = s.nextLine();
			line = new Scanner(str);
			switch (cellId = line.next().toLowerCase()) {
				case "print": 
					sheet.printSheet();
					break;
				case "exit":
					System.out.println("\nFarewell!");
					quit = true;
					break;
				default: 
					if (str.matches("([a-g]|[A-G]){1}(1[0]|[1-9])(.)*")) {
						if (line.hasNext())	{
							if (line.next().equals("="))	{
								System.out.println("Will need to update cell");
								sheet.updateCellInSheet(cellId, str, line);
							}
							else	{
								System.out.println("WTF2");
							}
						}
						else	{
							System.out.println("Need to print out cell contents");
							sheet.printCellInSheet(cellId, str, line);
						}

					}
					else	{
					System.out.println("Command not supported");
					}
					break;
			}
		}
		
	}
	
	
}
