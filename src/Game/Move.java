package Game;

public class Move extends Player{
	protected Player player;
	
	public static void move
	(int[][] arr, int idx1X, int idx1Y, int idx2X, int idx2Y) 
	{
		int temp = arr[idx1X][idx1Y];
		arr[idx1X][idx1Y] = arr[idx2X][idx2Y];		
		arr[idx2X][idx2Y] = temp;

	}
	public void playerMove(int[][] field,int playerMove)
	{

		  player.moveX = player.getPlayerX();
		  player.moveY = player.getPlayerY();
		  

			switch(playerMove)
			{
			case 8 : 

				if(player.getPlayerX()==0)
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					//continue;
				}
				else 
				{

					player.moveX--;
					
				}
				break;

			case 2 :

				if(player.getPlayerX()==player.fieldSize-1)		
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					//continue;
				}
				else
				{
					player.moveX++;
				}
				break;

			case 4 :

				if(player.getPlayerY()==0)		
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					//continue;
				}
				else
				{
					player.moveY--;					
				}
				break;			
			case 6:

				if(player.getPlayerY()==player.fieldSize-1) 
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					//continue;
				}
				else
				{
					player.moveY++;
				}
				break;	
			}
			 
			if(BattleScene.inCounter(inCounter))
			{
				playerPos=field[moveX][moveY];
				Battle battle = new Battle();
				battle.monsterCount=monsterCount;
				battle.monsters=monsters;				
				battle.playerPos=playerPos;
				battle.endCount=endCount;
				for(int i=0;i<monsters.length;i++)
				{
					System.out.println(monsters[i]);
				}
				battle.Battle(50, 5);
				inCounter=0;
			}
			
			 Move.move(field, playerX, playerY, moveX, moveY);
						
			inCounter+=10;			
			setPlayer(moveX, moveY);			
	}


}
