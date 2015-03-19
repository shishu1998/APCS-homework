import java.io.*;
import java.util.*;
public class Driver{
    public static void main(String[] args) {
	int sum;
	long start;
	double diff;
	LList l = new LList();
	for (int i=0;i<10000;i++){
	    l.add(i);
	}
        ArrayList<Integer> al = new ArrayList<Integer>();
	for(int i = 0; i < 10000; i ++){
	    al.add(i);
	}
	LinkedList<Integer> a = new LinkedList<Integer>();
	for(int i = 0; i < 10000; i ++){
	    a.add(i);
	}
	start = System.currentTimeMillis();
	sum = 0;
	for(int i = 0;i < l.size(); i ++){
	    sum = sum + l.get(i);
	}
	System.out.println("" + sum);
	System.out.println(System.currentTimeMillis()-start);

	start = System.currentTimeMillis();
	sum = 0;
	for(int i = 0;i < al.size(); i ++){
	    sum = sum + l.get(i);
	}
	System.out.println("" + sum);
	System.out.println(System.currentTimeMillis()-start);

	start = System.currentTimeMillis();
	sum = 0;
	for(int i = 0;i < a.size(); i ++){
	    sum = sum + l.get(i);
	}
	System.out.println("" + sum);
	System.out.println(System.currentTimeMillis()-start);

	
    }
}
