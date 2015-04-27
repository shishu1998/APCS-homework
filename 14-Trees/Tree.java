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

    public Node rSearch(Node t,int i){
	if(t == null || t.getData() == i){
	    return t;
	}
	else if(t.getData() < i){
	    return rSearch(t.getRight(),i);
	}
	else{
	    return rSearch(t.getLeft(),i);
	}

    }

    public void insert(int i){
	Node n = new Node(i);
	Node t2=null;
	Node t = root;
	if (root==null){
	    root=n;
	    return;
	}
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }


    public String traverse(Node t){
	String result = "";
	result = result + t.getData() + " ";
	if(t.getLeft() != null && t.getRight() != null){
	    return result + traverse(t.getRight()) + traverse(t.getLeft());
	}
	else if(t.getRight() != null){
	    return result + traverse(t.getRight());
	}
	else if(t.getLeft() != null){
	    return result + traverse(t.getLeft());
	}
	else{
	    return result;
	}
    }
    
    public String toString(){
        return traverse(root);
    }
    
}
