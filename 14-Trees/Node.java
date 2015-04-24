public class Node{
    private Node left, right;
    private int data;

    public Node(){
	left = null;
	right = null;
	data = 0;
    }

    public Node(int data){
	this.data = data;
    }

    public Node(Node a, Node b, int i){
	left = a;
	right = b;
	data = i;
    }

    public void setLeft(Node n){
	left = n;
    }
    public void setRight(Node n){
	left = n;
    }
    public void setData(int i){
	data = i;
    }

    public Node getLeft(){
	return left;
    }
    public Node getRight(){
	return right;
    }
    public int getData(){
	return data;
    }
}
