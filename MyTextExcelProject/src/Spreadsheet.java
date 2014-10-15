import java.util.Scanner;

public class Spreadsheet
{
	Cell[][] spreadSheet;
	int rows, columns;
	
	public Spreadsheet(int numRows, int numCols)	{
		rows = numRows;
		columns = numCols;
		spreadSheet = new Cell[rows][columns];
	}
	
	public static void main (String[] args)	{
		System.out.println("In class Spreadsheet");
		System.out.println("Exiting class Spreadsheet");
	}
	
	public void printSheet ()	{
		System.out.println();
		printSheetHeader();
		printSheetBody();
	}
	
	public void printCellInSheet(String cellID, String str, Scanner s)
	{
		int col;
		Integer row;
		
//		System.out.println("cellID:\t" + cellID + "\nstr:\t" + str);
		col = cellID.charAt(0) - 'a';
		row = Integer.valueOf(cellID.substring(1)) - 1;
//		System.out.println("col:\t" + col + "\trow:\t" + row);
		if (spreadSheet[row][col] == null)	{
			System.out.println(cellID.toUpperCase() + " = <empty>");
		}
		else	{
			StringCell tempSCell = (StringCell)spreadSheet[row][col];
			System.out.println(cellID.toUpperCase() + " = " + tempSCell.getValue());
		}
	}
	
	public void updateCellInSheet(String cellID, String str, Scanner s)
	{
		int col;
		Integer row;
		
		col = cellID.charAt(0) - 'a';
		row = Integer.valueOf(cellID.substring(1)) - 1;
		
		if (s.hasNext())
		{
			System.out.println("Adding string " + str + " to spreadSheet[" + row + "][" + col + "]");
			spreadSheet[row][col] = new StringCell(str, s);
		}
	}
	
	private void printRowBorder()	{
		for (int i=0; i<columns+1; i++)
		{
			Cell.printCellBorder();
		}
		System.out.println();
	}
	
	private void printSheetHeader()	{
		char c = 'A';
		Cell node = new Cell();
		
		node.printCell();	
		for (int i=0; i<columns; i++)
		{
			node.printCell(c++);
		}
		System.out.println();
		printRowBorder();
	}
	
	private void printSheetBody()	{	
		
		Cell tempCell = new Cell();
		StringCell tempSCell = new StringCell();
		
		for (int i=0; i<rows; i++)
		{
			tempCell.printCell(i+1);
			for (int j=0; j<columns; j++)
			{
				if (spreadSheet[i][j] == null)
				{
					tempCell.printCell();
				}
				else if (spreadSheet[i][j].getClass().getName().equals(tempSCell.getClass().getName())) 	// check if it's a StringCell
				{
//					System.out.println("Class comparison worked");
					tempSCell = (StringCell) (spreadSheet[i][j]);
					tempSCell.printCell();
				}
				else	{
					System.out.println("WTF");
				}
				
			}
			System.out.println();
			printRowBorder();
		}
	}
	
}
