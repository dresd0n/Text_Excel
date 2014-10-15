public class Cell
{
	public static final int CELL_WIDTH = 12;
	
	public static void main (String[] args)
	{
		System.out.println("In class Cell");
	}
	
	public static void printCellBorder()
	{
		for (int i=0; i<CELL_WIDTH; i++)
			System.out.print("-");
		System.out.print("+");
	}
	
	public void printCell()
	{
		for (int i=0; i<CELL_WIDTH; i++)
			System.out.print(" ");
		System.out.print("|");
	}
	
	public void printCell(char c)
	{
		System.out.print("     " + c + "      |");
	}
	
	public void printCell(int i)
	{
		System.out.printf("     %-2d     |", i);
	}
}
