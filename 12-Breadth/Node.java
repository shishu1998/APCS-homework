public class Node<E>{
    private int x;
    private int y;
    private Node next;
    public Node(int xcor, int ycor){
	x = xcor;
	y = ycor;
	next = null;
    }
    public int getX(){
	return x;
    }
    public int getY(){
	return y;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    public String toString(){
	return ""+ x + y;
    }
}
