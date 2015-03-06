public class selection{
    public int[] select(int[] L, int S, int E){
	int[] nu = new int[L.length];
	int SI = S;
	int EI = E;
	int pivot;
	for(int i = 0;i < SI; i ++){
	    nu[i] = L[i];
	}
	for(int i = EI + 1; i < L.length; i ++){
	    nu[i] = L[i];
	}
	pivot = L[SI];
	SI ++;
	int counter = SI;
	while(SI != EI){
	    if(L[counter] < pivot){
		nu[SI] = L[SI];
		SI ++;
	    }
	    else if(L[counter] > pivot){
		nu[EI] = L[EI];
		EI --;
	    }
	    counter ++;
	}
	nu[SI] = pivot;
	return nu;
	
    }
    
    public static void main(String[] args){
	selection a = new selection();
	int[] Arr = new int[10];
	Arr[0] = 5;
	Arr[1] = 4;
	Arr[2] = 9;
	Arr[3] = 3;
	Arr[4] = 8;
	Arr[5] = 7;
	Arr[6] = 2;
	Arr[7] = 6;
	Arr[8] = 1;
	Arr[9] = 10;
	int[] arr = a.select(Arr,0,9);
	for(int i = 0; i < arr.length ; i ++){
	    System.out.println(arr[i]);
	}
    }



}
