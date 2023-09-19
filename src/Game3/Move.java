package Game3;

public class Move  {

	public boolean playerMove(int[][] field1,int move, Field field, Player player)
	{

		int playerX=player.getPlayerX();
		int playerY=player.getPlayerY();
		int movePlayerX = playerX;
		int movePlayerY = playerY;

		switch(move)
		{
		case 8 : 

			if(playerX==0)
			{
				System.out.println("밖을 벗어날수 없습니다.");
				System.out.println("다시 입력해주세요");
				
			}
			else 
			{

				movePlayerX--;
				
			}
			break;

		case 2 :

			if(playerX==field.getFieldSize()-1)		
			{
				System.out.println("밖을 벗어날수 없습니다.");
				System.out.println("다시 입력해주세요");
				
			}
			else
			{
				movePlayerX++;
				
			}

			break;
		case 4 :

			if(playerY==0)		
			{
				System.out.println("밖을 벗어날수 없습니다.");
				System.out.println("다시 입력해주세요");
				
			}
			else
			{
				movePlayerY--;
				
			}
			break;
		case 6:

			if(playerY==field.getFieldSize()-1) 
			{
				System.out.println("밖을 벗어날수 없습니다.");
				System.out.println("다시 입력해주세요");
				
			}
			else
			{
				movePlayerY++;
			
			}
			break;
		}
		player.setPlayerPos(field1[movePlayerX][movePlayerY]);
		player.setPlayer(movePlayerX, movePlayerY);
		return true;

	}

}






