
public class test {

	public static void main(String[] args) {
		System.out.println(new Node(2,3));
		
		Node [][] grid = new Node [5][10];
		
		for (int row = 0; row < grid.length; row++)
		{
			for (int column = 0; column < grid[row].length; column++)
			{
				grid[row][column] = new Node (column, row);
			}
		}
		
		//System.out.println (grid);
		}
	}
}
