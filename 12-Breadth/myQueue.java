public class myQueue{
    Node front,back;
    

    public myQueue(){
	front = null;
	back = null;
    }
    
    public void enqueue(int xcor, int ycor){
	Node nu = new Node(xcor,ycor);
	if (empty()){
	    back = nu;
	    front = nu;
	} else {
	    back.setNext(nu);
	    back = nu;
	}
    }

    public Node dequeue(){
	if (empty()){
	    return null;
	}
	Node output = front;
	front = front.getNext();
	if (front==null){
	    back=null;
	}
	return output;
    }

    public boolean empty(){
	return front == null;
    }

    public Node head() {
        return front;
    }
}
