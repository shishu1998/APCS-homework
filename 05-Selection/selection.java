public class selection{
    public int select(int[] A,int k, int s, int e){
	int pivot = A[k];
	int low = s;
	int high = e;
	int temp;
	
	A[k] = A[e];
	A[e] = pivot;
	
	while(low < high){
	    if(A[low] < pivot){
		low ++;
	    }
	    else{
		temp = A[low];
		A[low] = A[high];
		A[high] = temp;
		high --;
	    }
	}
	
	A[e] = A[high];
	A[high] = pivot;
	
	if(low == k){
	    return A[low - 1];
	}
	else if(k > 1){
	    return select(A,k,low,e);
	}
	else{
	    return select(A,k,s,low);
	}
    }
    
    public static void main(String[] args){
	int[] arr = {8,9,4,5,3,2,1,6,7};
	selection s = new selection();
        System.out.println(s.select(arr,3,0,arr.length - 1));
    }



}
