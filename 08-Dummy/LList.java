public class LList{
    private Node l=null;
    private Node dum;
    private int len = 0;

    public void add(String s){
	dum = new Node("");
        Node temp = new Node(s);
	temp.setNext(l);
	l = temp;
	dum.setNext(l);
	len ++;
    }
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp= dum ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    public Node get(int n){
	Node temp = dum;
	for(int i = 0;i < n + 1; i ++){
	    temp = temp.getNext();
	}
	return temp;	
    }

    public void remove(int index){
	Node front = get(index - 1);
	Node back = get(index +1);
	front.setNext(back);
    }
    
    public void insert(int index, String s){
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
	
    }
}
