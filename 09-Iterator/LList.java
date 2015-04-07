import java.io.*;
import java.util.*;

public class LList<E> implements Iterable<E>{
    private Node<E> l;
		
    public LList(){
	l = new Node<E>();
    }

    public Iterator<E> iterator(){
	LLit<E> i = new LLit<E>(l.getNext());
	return i;
    }
		
		
    public void add(E s){
	Node<E> tmp = new Node<E>(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
    }
    public void remove(){
	Iterator<E> temp = iterator();
	Iterator<E> tmp = iterator();
        int i = 0;
	while(temp.hasNext()){
	    i ++;
	    temp.remove();
	}
	i --;
	
	for(int f = i; f > 0; f --){
	    tmp.remove();
	}
	temp.next() = null;
	iterator().remove();
    }
    
		
    public String toString(){
	String s = "";
	Node<E> tmp;;
	for (tmp=l.getNext() ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
}
