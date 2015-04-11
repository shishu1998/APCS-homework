import java.io.*;
import java.util.*;

public class Maze 
{
    private myQueue frontier;
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public Maze() 
    {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {
						
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
				
    }
    
    public boolean inBounds(int a, int b){
	return (a >-1 && a < maxX) && (b >-1 && b < maxY);
    }
    
    public boolean isPath(int a, int b){
	return board[a][b]==path || board[a][b] ==exit;
    }
		
    public String toString()
    {
	String s = "[2J\n";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    
    public void solve(int x, int y){
	frontier = new myQueue();
        frontier.enqueue(x,y);
	while(!frontier.empty()){
	    Node tmp = frontier.dequeue();
	    int xcor = tmp.getX(); 
	    int ycor = tmp.getY();
	    if (board[xcor][ycor] == exit){
		System.out.println(this);
		System.exit(0);
	    } 
	    board[xcor][ycor] = me;
	    if (isPath(xcor, ycor+1)&& inBounds(xcor,ycor+1)){
		frontier.enqueue(xcor, ycor+1);
	    }
	    if (isPath(xcor+1, ycor)&& inBounds(xcor+1,ycor)){
		frontier.enqueue(xcor+1, ycor);
	    }
	    if (isPath(xcor, ycor-1)&& inBounds(xcor,ycor-1)){
		frontier.enqueue(xcor, ycor-1);
	    }
	    if (isPath(xcor-1, ycor)&& inBounds(xcor-1,ycor)){
		frontier.enqueue(xcor-1, ycor);
	    }
	    System.out.println(this);
	    delay(50);	 

	}
    }

    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
    }
}
