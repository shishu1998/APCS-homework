public class knights{
    private int moves = 0;
    private int[][] board;
    private int[][] test;

    public String toString(){
	tour(test);
	for(int i = 0;i < board.length; i ++){
	    for(int b = 0; b < board[0].length; b ++){
		System.out.println(board[i][b]);
	    }
	}
    }
    public void tour(int[][] input){
	int[][] board = new int[input.length + 4][input[0].length + 4];
        for(int i = 0; i < board[0].length; i ++){
	    board[0][i] = -1;
	    board[1][i] = -1;
	    board[board.length - 2][i] = -1;
	    board[board.length - 1][i] = -1;
	}
	

    }



}
