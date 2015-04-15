
public class Node {
    private int x,y;
    private Node prev;
    private int priority;
		
    public Node(int x, int y){
	this.x = x;
	this.y = y;
	priority = 26 -x + 18- y; 
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










