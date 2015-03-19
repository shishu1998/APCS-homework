public class LList{
    private Node l=null;
    private Node dum;
    private int len = 0;

    public void add(int s){
	dum = new Node(0);
        Node temp = new Node(s);
	temp.setNext(l);
	l = temp;
	dum.setNext(l);
	len ++;
    }
    public int size(){
	return len;
    }
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp= dum.getNext(); tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    public int get(int n){
	Node temp = dum;
	for(int i = 0;i < n + 1; i ++){
	    temp = temp.getNext();
	}
	return temp.getData();	
    }

    public boolean remove(int val){
	Node temp = dum.getNext();
	for(int i = 0; i < len; i ++){
	    if(temp.getNext().getData() != val){
		temp = temp.getNext();
	    }
	    else{
		temp.setNext(temp.getNext().getNext());
		return true;
	    }
	    
	}
	return false;
    }
    
    public void insert(int index, int s){
	Node a = new Node(s);
	Node before = dum;
	for(int i = 0; i < index;i ++){
	    before = before.getNext();
	}
	Node after = dum;
	for(int i = 0; i < index + 1; i ++){
	    after = after.getNext();
	}
	a.setNext(after);
	before.setNext(a);
	len++;
	
    }
}
