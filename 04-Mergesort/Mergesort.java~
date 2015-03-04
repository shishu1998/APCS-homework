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

    public static void main(String[] args){
	Mergesort a = new Mergesort();
	ArrayList<Integer> blah = new ArrayList<Integer>();
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
	
	
    }


}
