public class myQueue<E>{
    Node<E> front,back;
    

    public myQueue(){
	front = new Node<E>();
	back = new Node<E>();
	front.setNext(back);
    }

    public String toString(){
	String result = "";
	Node<E> temp = front.getNext();
	while(temp != back){
	    temp = temp.getNext();
	    result = result + temp.getData() + "--->";
	}
	return result;
    }
    
    public void enqueue(E data){
        Node<E> temp = new Node<E>(data);
	back.setNext(temp);
	back = temp;
    }

    public E dequeue(){
	E result = front.getNext().getNext().getData();
	front.setNext(front.getNext().getNext());
	return result;
    }

    public boolean empty(){
	return front.getNext().getData() == null;
    }

    public E head() {
        return front.getNext().getData();
    }
}
