import java.io.*;
import java.util.*;
public class Lake{
    Random r = new random();
    private int[][] lake;
    private int[] dig;
    public void makelake(int row, int column, int Elevation, int dig){
	for(int i = 0; i < row; i ++){
	    int[] dig = new int[column];
	    for(int b = 0; b < column ; b ++){
		dig[b] = r.nextInt(5000) + 1;
	    }
	    int[i] = dig;
	}
    }
}