package Game3;

public class Move  {

	public boolean playerMove(int[][] field,int move, Field field1, Player player)
	{

		int playerX=player.getPlayerX();
		int playerY=player.getPlayerY();
		int movePlayerX = playerX;
		int movePlayerY = playerY;

		switch(move)
		{
		case 8 : 

			if(playerX<=0)
			{
				System.out.println("밖을 벗어날수 없습니다.");
				System.out.println("다시 입력해주세요");
				return false;
			}
			else 
			{

				movePlayerX--;
				return true;
			}


		case 2 :

			if(playerX==field1.getFieldSize()-1)		
			{
				System.out.println("밖을 벗어날수 없습니다.");
				System.out.println("다시 입력해주세요");
				return false;
			}
			else
			{
				movePlayerX++;
				return true;
			}


		case 4 :

			if(playerY<=0)		
			{
				System.out.println("밖을 벗어날수 없습니다.");
				System.out.println("다시 입력해주세요");
				return false;
			}
			else
			{
				movePlayerY--;
				return true;
			}

		case 6:

			if(playerY==field1.getFieldSize()-1) 
			{
				System.out.println("밖을 벗어날수 없습니다.");
				System.out.println("다시 입력해주세요");
				return false;
			}
			else
			{
				movePlayerY++;
				return true;
			}
			Util.move(field, playerX, playerY, movePlayerX, movePlayerY); 
			player.setPlayer(movePlayerX, movePlayerY);

			return false;
		}
	}
	
}






