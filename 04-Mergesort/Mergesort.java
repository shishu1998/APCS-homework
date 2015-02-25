public class Mergesort{
    
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	int juan = 0;
	int too = 0;
	ArrayList<Integer> nu = new ArrayList<Integer>();
	while(juan < a.size() || too < b.size()){
	    if(juan > a.size()){
		nu.add(b.get(too));
		too ++;
	    }
	    else if(too > b.size()){
		nu.add(a.get(juan));
		juan ++;
	    }
	    else if (a.get(juan) < b.get(too)){
		nu.add(a.get(juan));
	    }
	    else{
		nu.add(b.get(too));
	    }
	}

    }

    public static void main(String[] args){
	Mergesort a = new Mergesort;
	ArrayList<Integer> blah = new ArrayList<Integer>();
	ArrayList<Integer> meh = new ArrayList<Integer>();
    }


}
