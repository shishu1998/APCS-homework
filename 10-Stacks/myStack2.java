public class myStack2<E>{
    private Object[] Arr;
    private int lastindex;
    public myStack2(){
	Arr = new Object[1];
	lastindex = -1;
    }
    
    public void grow(){
	Object[] temp = new Object[Arr.length + 100];
	for(int i = 0; i < Arr.length; i ++){
	    temp[i] = Arr[i];
	}
	Arr = temp;
    }

    public String toString(){
	String output = "";
	for(int i = 0; i <= lastindex; i ++){
	    output = output + Arr[i] + "<---";
	}
	return output;
    }
    public void push(Object data){
	if(lastindex >= Arr.length - 1){
	    grow();
	}
	lastindex ++;
	for(int i = lastindex;i > 0; i --){
	    Arr[i] = Arr[i-1];
	}
	Arr[0] = data;
    }
    
    public Object pop(){
	if(lastindex < 0){
	    Arr[0] = null;
	    lastindex ++;
	}
	Object result = Arr[0];
	for(int i = 0; i < lastindex; i ++){
	    Arr[i] = Arr[i+1];
	}
	lastindex --;
	return result;
    }
    

}
