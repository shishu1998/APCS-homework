public class Driver{
    public static void main(String[] args){
	myQueue<Integer> a = new myQueue<Integer>();
	System.out.println(a.empty());
	a.enqueue(10);
	a.enqueue(9);
	a.enqueue(5);
	a.enqueue(8);
	a.enqueue(7);
	System.out.println(a.dequeue());
	System.out.println(a);
	System.out.println(a.dequeue());
	System.out.println(a);
	
    }
}
