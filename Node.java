/**
 * @author Chen Shen
 * @version 1.0
 */



public class Node 
{
	
	private int x;
	private int y;
	private Node parent;
	
	private int fValue;
	// Exact cost of the path from starting point to any Node n
	private int gValue;
	// Heuristic estimated cost from Node n to the goal
	private int hValue;
	
	public Node ()
	{
		this.x = 0;
		this.y = 0;
		this.parent = null;
		this.gValue = 1;
		this.hValue = 0;
		this.fValue = gValue + hValue;
	}
	
	public Node (int x, int y)
	{
		this();
		
		this.x = x;
		this.y = y;
		
	}
	
	public Node (Node node) 
	{
		this (node.x, node.y);
		parent = new Node (node.parent);
		hValue = parent.hValue;
		fValue = gValue + hValue;
	}

	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public Node getParent()
	{
		return parent;
	}
	
	public int calculateManhDist (Node goal)
	{
		int dx = Math.abs (goal.x - this.x);
		int dy = Math.abs (goal.y - this.y);
		
		return fValue * (dx + dy);
	}

	public String toString()
	{
		StringBuilder str = new StringBuilder ("Node Information: \n");
		str.append ("Location: (" + this.x);
		str.append ("," + this.y);
		str.append (")   gValue: " + gValue);
		str.append ("   hValue: " + hValue);
		str.append ("   fValue: " + fValue);
		return str.toString();
	}
}
