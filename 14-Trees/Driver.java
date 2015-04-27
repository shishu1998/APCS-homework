public class Driver{
    public static void main(String[] args){
	Node rt = new Node(20);
	Tree tree = new Tree(rt);
	tree.insert(15);
	tree.insert(19);
	tree.insert(10);
	tree.insert(11);
	tree.insert(12);
	tree.insert(17);
	tree.insert(18);
	System.out.println(tree);
    }
}
