public class Driver{
    public static void main(String[] args){
	myStack<Integer> a = new myStack<Integer>();
	a.push(8);
	a.push(3);
	a.push(5);
	System.out.println(a);
	System.out.println(a.pop());
	System.out.println(a);
	System.out.println(a.empty());
	System.out.println(a.top());
    }
}
