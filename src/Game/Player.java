package Game;

public class Player {
	protected int hp;
	protected int playerX;
	protected int playerY;
	protected int[] monster;
	protected int monsterCount;
	protected int fieldSize;
	protected int playerMove;
	
	
	
	public void setPlayerHp(int hp)
	{
		this.hp =hp;		
	}
	public int getPlayerHp()
	{
		return hp;
	}
	public void setPlayer(int playerX, int playerY)
	{
		this.playerX = playerX;
		this.playerY = playerY;
	}	
	public void setPosition(int fieldSize)
	{
		this.fieldSize= fieldSize;
	}
	public int getFiledSize()
	{
		return fieldSize;
	}
	public int getPlayerX()
	{
		return playerX;
	}
	public int getPlayerY()
	{
		return playerY;
	}
	public void playerMove(int[][] field,int playerMove)
	{

		int moveX = playerX;
		int moveY = playerY;
//		while(true)
//		{


			switch(playerMove)
			{
			case 8 : 

				if(playerX==0)
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					//continue;
				}
				else 
				{

					moveX--;
					
				}
				break;

			case 2 :

				if(playerX==fieldSize-1)		
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					//continue;
				}
				else
				{
					moveX++;
				}
				break;

			case 4 :

				if(playerY==0)		
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					//continue;
				}
				else
				{
					moveY--;					
				}
				break;			
			case 6:

				if(playerY==fieldSize-1) 
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					//continue;
				}
				else
				{
					moveY++;
				}
				break;	
			}
			

			Move.move(field, playerX, playerY, moveX, moveY);
			setPlayer(moveX, moveY);
			
		//}


	}

}




