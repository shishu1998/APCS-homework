import java.io.*;
import java.util.*;

public class knights{
    private boolean done = false;
    private int me = 1;
    private int visited = 1;
    private int[][] board;

    public String toString(){
	String s = "";
	for(int i = 0;i < board.length; i ++){
	    for(int b = 0; b < board[0].length; b ++){
	        s = s + String.format("%d",(board[i][b])) + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }
    public void create(){
	board = new int[9][9];
        for(int i = 0; i < board[0].length; i ++){
	    board[0][i] = -1;
	    board[1][i] = -1;
	    board[board.length - 2][i] = -1;
	    board[board.length - 1][i] = -1;
	}
	for(int i = 1; i < board[0].length - 1; i ++){
	    board[i][0] = -1;
	    board[i][1] = -1;
	    board[i][board.length - 2] = -1;
	    board[i][board.length - 1] = -1;
	    
	}
	

    }
    
    public boolean check(){
	for(int i = 0; i < board.length; i ++){
	    for(int b = 0;b <board[0].length; b ++){
		if(board[i][b] != me  || board[i][b] != visited ){
		    return false;
		}
	    }
	}
	return true;
    }
    
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    
    public void tour(int x, int y){
	if(!(board[x][y] == 0) || done){
	    return;
	}
	if(check()){
	    done = true;
	    System.out.println(this);
	}
	//delay(100);
	System.out.println(this);
	board[x][y] = me;
        tour(x + 1, y + 2);
        tour(x - 1, y + 2);
        tour(x + 1, y - 2);
        tour(x - 1, y - 2);
        tour(x + 2, y + 1);
	tour(x + 2, y - 1);
	tour(x - 2, y + 1);
	tour(x - 2, y - 1);
	if(!done){
	    board[x][y] = visited;
	    visited ++;
	}
    }
    
    public static void main(String[] args){
	knights a  = new knights();
	a.create();
	System.out.println(a);
	a.tour(2,2);
	System.out.println(a);
	
    }



}
