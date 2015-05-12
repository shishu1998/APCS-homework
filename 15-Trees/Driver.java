public class Driver{
    public static void main(String[] args){
	Tree a = new Tree();
	for(int i = 0; i < 10; i ++){
	    a.insert(i);
	}
	System.out.println(a);
	System.out.println(a.maxValue(a.getRoot()));
	a.getRoot().setLeft(new Node(1));
	System.out.println(a);
	a.splitDupes(a.getRoot());
	System.out.println(a);
	System.out.println(a.height(a.getRoot()));
	System.out.println(a.longest(a.getRoot()));
    }
}
