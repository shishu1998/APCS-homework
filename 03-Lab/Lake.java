import java.io.*;
import java.util.*;
public class Lake{
    Random r = new Random();
    private int[][] lake;
    private int N;
    private int diff;
    
    public void makelake(int row, int column, int Elevation, int dig){
	lake = new int[row + 2][column + 2];
	for(int i = 1; i < row + 1; i ++){
	    for(int b = 1; b < column + 1 ; b ++){
		lake[i][b] = r.nextInt(Elevation) + 1;
	    }
	}
	N = dig;
	for(int i = 0; i < lake[0].length; i ++){
	    lake[0][i] = -1;
	    lake[lake.length - 1][i] = -1;	    
	}
	for(int i = 0; i < lake.length; i ++){
	    lake[i][0] = -1;
	    lake[i][lake[0].length -1] = -1;
	}
    }
    
    public String toString(){
	String s = "";
	for(int i = 0; i < lake.length; i ++){
	    for(int b = 0;  b < lake[0].length; b ++){
		s = s + lake[b][i] + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void dig(int row, int column, int down){
	int n;
	diff = lake[row][column] - down;
	for(int i = -1; i < 1; i ++){
	    for(int b = -1; b < 1; b ++){
		n = lake[row + i][column + b];
		if(n != -1 && n > diff){
		    lake[row + i][column + b] = diff;
		}
	    }
	}
    }
    
    public static void main(String[] args){
	Lake a = new Lake();
	a.makelake(5,5,100,5);
	System.out.println(a);
	a.dig(3,3,5);
	System.out.println(a);
    }
}
