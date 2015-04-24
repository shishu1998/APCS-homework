public class Tree{
    private Node root;
    public Tree(Node root){
	this.root = root;
    }

    public Node Search(int i){
	Node t = root;
	while(t != null){
	    if(t.getData() == i){
		return t;
	    }
	    if(i > t.getData()){
		t = t.getRight();
	    }
	    else{
		t = t.getLeft();
	    }
	}
	return null;
    }

    public void insert(Node i){
	Node Piggy = new Node();
	Node t = root;
	int data = i.getData();
	Piggy.setLeft(t);
	Piggy.setRight(t);
	boolean Right = false;
	while(t != null){
	    if(data < Piggy.getLeft().getData()){
		t = t.getLeft();
		Piggy = Piggy.getLeft();
		Right = false;
	    }
	    if(data > Piggy.getRight().getData()){
		t = t.getRight();
		Piggy = Piggy.getRight();
		Right = true;
	    }
	    
	}
	if(Right = true){
	    Piggy.setRight(i);
	}
	else{
	    Piggy.setLeft(i);
	}
    }

    public String toString(){
	Node t = root;
	String output = "";
	while(t != null){
	    output = output + t.getData() + " ";
	    t = t.getLeft();
	}
	return output;
    }
    
}
