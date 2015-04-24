public class Driver{
    public static void main(String[] args){
	Node rt = new Node(20);
	Tree tree = new Tree(rt);
	tree.insert(new Node(15));
	tree.insert(new Node(10));
	System.out.println(tree);
    }
}
