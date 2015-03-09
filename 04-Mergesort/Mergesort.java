import java.io.*;
import java.util.*;
public class Mergesort{
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	int juan = 0;
	int too = 0;
	ArrayList<Integer> nu = new ArrayList<Integer>();
	while(juan < a.size() || too < b.size()){
	    if(juan >= a.size() && too < b.size()){
		nu.add(b.get(too));
		too ++;
	    }
	    else if(too >= b.size() && juan < a.size()){
		nu.add(a.get(juan));
		juan ++;
	    }
	    else if (a.get(juan) < b.get(too)){
		nu.add(a.get(juan));
		juan ++;
	    }
	    else{
		nu.add(b.get(too));
		too ++;
	    }
	}
	return nu;

    }
    public ArrayList<Integer> mergesort(ArrayList<Integer> a){
	ArrayList<Integer> front = new ArrayList<Integer>();
	ArrayList<Integer> back = new ArrayList<Integer>();
	if(a.size() == 1){
	    return a;
	}
	else{
	    front = toarraylist(a.subList(0,a.size()/2));
	    back = toarraylist(a.subList(a.size()/2, a.size()));
	    return merge(mergesort(front),mergesort(back));
	}

    }

    public ArrayList<Integer> toarraylist(List a){
	ArrayList<Integer> output = new ArrayList<Integer>();
	for(int i = 0; i < a.size() ; i ++){
	    output.add((Integer)a.get(i));
	}
	return output;
    }
    
    public int[] Mergesort(int[] a ){
	if(a.length  == 1){
	    return a;
	}
	else{
	    int[] front = new int[a.length / 2];
	    for(int i = 0; i < front.length ; i ++){
		front[i] = a[i];
	    }
	    int[] back = new int[a.length - front.length];
	    for(int i = 0; i < a.length - front.length; i ++){
		back[i] = a[front.length + i];
	    }
	    return Merge(Mergesort(front),Mergesort(back));
	}
    }

    public int[] Merge(int[] a, int [] b){
	int[] result = new int[a.length + b.length];
	int one = 0;
	int two = 0;
	while(one < a.length && two < b.length){
	    if(a[one] < b[two]){
		result[one + two] = a[one];
		one ++;
	    }
	    else{
		result[one + two] = b[two];
		two ++;
	    }
	    
	}
	while(one < a.length){
	    result[one + two] = a[one];
	    one ++;
	}
	while(two < b.length){
	    result[one + two] = b[two];
	    two ++;
	}
	return result;

    }
    
    public String convert(int[] a){
	String result = "";
	for(int i = 0; i < a.length; i ++){
	    result += a[i] + " ";
	}
	return result;
    }

    public static void main(String[] args){
	Mergesort a = new Mergesort();
	/*ArrayList<Integer> blah = new ArrayList<Integer>();
	ArrayList<Integer> meh = new ArrayList<Integer>();
	blah.add(6);
	blah.add(7);
	blah.add(5);
	System.out.println(blah);
	blah = a.mergesort(blah);
	System.out.println(blah);
	meh.add(1);
	meh.add(2);
	meh.add(3);
	meh.add(4);
	meh.add(5);
	meh.add(6);
	System.out.println(a.merge(blah,meh));
	*/
	int[] ah = new int[10000000];
	Random r = new Random();
	for(int i = 0; i < ah.length; i ++){
	    ah[i] = r.nextInt(10);
	}
	//System.out.println(a.convert(ah));
	//System.out.println(a.convert(a.Mergesort(ah)));
	
	
    }


}
