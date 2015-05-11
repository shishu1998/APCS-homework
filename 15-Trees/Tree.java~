public class Tree{
    private Node r;
    public Tree(){
	this(null);
    }
    public Tree(Node root){
	r = root;
    }

    public Node Search(int i){
	Node t = r;
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
	Node t = r;
	if (r==null){
	    r=n;
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
