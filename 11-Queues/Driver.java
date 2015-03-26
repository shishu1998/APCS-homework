public class Driver{
    public static void main(String[] args){
	/*myQueue<Integer> a = new myQueue<Integer>();
	System.out.println(a.empty());
	a.enqueue(10);
	a.enqueue(9);
	a.enqueue(5);
	a.enqueue(8);
	a.enqueue(7);
	System.out.println(a.dequeue());
	System.out.println(a);
	System.out.println(a.dequeue());
	System.out.println(a);*/
	myQueue2<Integer> b = new myQueue2<Integer>();
	System.out.println(b.empty());
	b.enqueue(10);
	b.enqueue(9);
	b.enqueue(5);
	b.enqueue(8);
	b.enqueue(7);
	System.out.println(b);
	System.out.println(b.dequeue());
	System.out.println(b.dequeue());
	System.out.println(b.dequeue());
	System.out.println(b.dequeue());
	System.out.println(b.dequeue());
	System.out.println(b.dequeue());
	System.out.println(b.dequeue());
	System.out.println(b);
	System.out.println(b.head());
	
    }
}
