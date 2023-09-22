package Game3;

public class Move  {
	private int moveCount;
	
	public int getMoveCount()
	{
		return moveCount;
	}
	public void setMoveCount(int moveCount)
	{
		this.moveCount = moveCount;
	}

	public boolean playerMove(int[][] field1,int move, Field field, Player player)
	{

		int playerX=player.getPlayerX();
		int playerY=player.getPlayerY();
		int movePlayerX = playerX;
		int movePlayerY = playerY;

		switch(move)
		{
		case 8 : 
				movePlayerX--;
			break;
		case 2 :
				movePlayerX++;
			break;
		case 4 :
				movePlayerY--;
			break;
		case 6:
				movePlayerY++;
			break;
		}
		if(check(field1,movePlayerX,movePlayerY))return false;
		player.setPlayerPos(field1[movePlayerX][movePlayerY]);
		player.setPlayer(movePlayerX, movePlayerY);
		
		moveCount++;
		
		return true;
	}
	
	public boolean check(int[][] field,int playerX, int playerY)
	{
		if(playerX<0||playerX>field[0].length-1||playerY < 0||playerY >field.length-1)
		{
			System.out.println("범위를 벗어났습니다");
			System.out.println("다시 입력해주세요");
			return true;
		}
		
		return false;
	}
}






