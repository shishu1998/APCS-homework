public class myQueue2<E>{
    private Object[] arr;
    private int size;
    
    public myQueue2(){
	size = 0;
	arr = new Object[100];
    }
    
    public boolean empty(){
	return size == 0;
    }
    
    public void grow(){
	Object[] temp = new Object[arr.length + 100];
	for (int i = 0; i < arr.length; i++){
	    temp[i] = arr[i];
	}
	arr = temp;
    }
    public void adjust(){
	for(int i = 1; i < size; i ++){
	    arr[i -1] = arr[i];
	}
	size --;
    }

    public String toString(){
	String result = "";
	for(int i = 0; i < size; i ++){
	    result = result + arr[i] + "--->";
	}
	return result;
    }
    
    public void enqueue(E data){
	if(size > arr.length - 1){
	    grow();
	}
	arr[size] = data;
	size ++;
    }

    public Object dequeue(){
	if(empty()){
	    return null;
	}
	Object result = arr[0];
	adjust();
	return result;
    }

    public Object head(){
	return arr[0];
    }
    


}
