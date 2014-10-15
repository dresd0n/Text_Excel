public class Cell
{
	public static void main (String[] args)
	{
		System.out.println("In class Cell");
	}
	
	public static void printCellBorder()
	{
		System.out.print("------------+");
	}
	
	public void printCell()
	{
		System.out.print("            |");
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
