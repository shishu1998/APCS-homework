public class Tree{
    private Node r;
    public Tree(){
	this(null);
    }
    
    public Tree(Node root){
	r = root;
    }

    public Node getRoot(){
	return r;
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

    public int maxValue(Node t){
	int max = t.getData();
	if(t.getRight() == null){
	    return max;
	}
	return maxValue(t.getRight());
    }

    public int height(Node t){    
	if (t==null){
	    return 0;
	}
	else {
	    int heightleft = 1+height(t.getLeft());
	    int heightright = 1+height(t.getRight());
	    if (heightleft > heightright){
		return heightleft;
	    }
	    else {
		return heightright;
	    }
	}
    }

    public int longest(Node t){
	if(t == null){
	    return 0;
	}
	else{
	    Node left = t.getLeft();
	    Node Right = t.getRight();
	    int longest = 0;
	    while(left != null){
		if(height(left.getLeft()) > height(left.getRight())){
		    left = left.getLeft();
		}
		else{
		    left = left.getRight();
		}
		longest ++;
	    }
	    while(Right != null){
		if(height(Right.getLeft()) > height(Right.getRight())){
		    Right = Right.getLeft();
		}
		else{
		    Right = Right.getRight();
		}
		longest ++;
	    }
	    return longest + 1;
	}
    }

    public void splitDupes(Node t){
	if(t.getRight() != null && t.getRight().getData() == t.getData()){
	    Node temp = t.getRight();
	    t.setRight(new Node(t.getData() + 1));
	    t.getRight().setLeft(temp);
	}
	else if(t.getLeft() != null && t.getLeft().getData() == t.getData()){
	    Node temp = t.getLeft();
	    t.setLeft(new Node(t.getData() - 1));
	    t.getLeft().setRight(temp);
	}
    }
}
