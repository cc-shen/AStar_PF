/**
 * 
 * @author Charles
 *
 */

import java.util.*;

public class A_Star_PF {
	
	// Global constants
	public static final int START_ROW = 0;
	public static final int START_COL = 0;
	
	public static final int EXIT_ROW = 100;
	public static final int EXIT_COL = 100;
	
	
	private LinkedList<Node> path;
	
	private PriorityQueue<Node> open;
	
	private Set<Node> closed;
	
	private Node[][] grid; 
	
	public A_Star_PF ()
	{
		setObstacles();
	}
	
	private ArrayList<Node> setObstacles()
	{
		return null;
	}
	
	private LinkedList<Node> findPath(ArrayList <Node> obstacles)
	{
		open = new PriorityQueue<Node>();
		open.add(new Node (START_ROW, START_COL));
		closed = new HashSet<Node>();
		
		while(!open.isEmpty())
		{
			Node current = open.poll();
			closed.add(current);
			
			if (open.peek().sameLocation(EXIT_ROW, EXIT_COL))
			{
				path = new LinkedList<Node>();
				return path;
			}
			
			// Process its neighbors
			for (int i = -1; i <= 1; i += 2)
			{
				
			}
			
		}
		  
		return null;
	}
}
