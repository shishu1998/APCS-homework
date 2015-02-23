import java.io.*;
import java.util.*;
public class Lake{
    Random r = new random();
    private int[][] lake;
    private int[] initial;
    public void makelake(int row, int column, int Elevation, int dig){
	for(int i = 0; i < row; i ++){
	    int[] initial = new int[column];
	    for(int b = 0; b < column ; b ++){
		initial[b] = r.nextInt(dig) + 1;
	    }
	    int[i] = initial;
	}
    }
}
