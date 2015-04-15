import java.util.*;
public class Node {
    private int x,y;
    private Node prev;
    private int priority;
    //private double priority;
		
    public Node(int x, int y){
	this.x = x;
	this.y = y;
	priority = 26 -x + 18- y; 
	//priority = Math.sqrt((26-x) *(26-x) + (18-y) * (18-y));
    }

    public Node getPrev() {
	return prev;
    }
    
    public int getPri(){
	return priority;
    }
    
    public void setPrev(Node n){
	prev = n;
    }
		
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }
		
}










