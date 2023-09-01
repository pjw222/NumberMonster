package Game;

public class Move {
	public static void move
	(int[][] arr, int idx1X, int idx1Y, int idx2X, int idx2Y) 
	{
		int temp = arr[idx1X][idx1Y];
		arr[idx1X][idx1Y] = arr[idx2X][idx2Y];
		arr[idx2X][idx2Y] = temp;
	}

}
