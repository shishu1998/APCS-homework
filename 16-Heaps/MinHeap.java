public class MinHeap{
    private Node r;
    
    public MinHeap(){
	this(null);
    }
    
    public MinHeap(Node root){
	r = root;
    }
    
    public Node findmin(){
	return r;
    }

    public void Pushdown(Node root){
	Node temp;
	if(root.hasLeft() && root.hasRight()){
	    if(root.getData() < root.getRight().getData() && root.getData() < root.getLeft().getdata()){
	    }
	    else{
		if(root.getLeft().getData() < root.getRight().getData()){
		    temp = root;
		    temp.setRight(root.getRight());
		    root = root.getLeft();
		    temp.setLeft(root);
		    Pushdown(root.getLeft());
		}
	    }
	}
    }

    public void removemin(){
	Node temp = r;
	Node piggy;
	while(temp.getRight() != null){
	    piggy = temp;
	    temp = temp.getRight();
	}
	piggy.setRight(null);
	r = temp;
    }
    
    public void insert(int i){
	
    }
    
    public String traverse(Node t){
	if(t == null){
	    return "";
	} else {
	    return traverse(t.getLeft())+t.getData()+", "+traverse(t.getRight());
	}
    }
    
    public String toString(){
	return traverse(r);
    }
    
}
