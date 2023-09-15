package Game2;

public class Move  {
	protected Player player=new Player();
	protected Monster monster = new Monster();
	protected Battle battle = new Battle();
	
	
	public static void move
	(int[][] arr, int idx1X, int idx1Y, int idx2X, int idx2Y) 
	{
		int temp = arr[idx1X][idx1Y];
		arr[idx1X][idx1Y] = arr[idx2X][idx2Y];		
		arr[idx2X][idx2Y] = temp;

	}

	public void playerMove(int[][] field,int move)
	{
		int moveX = player.getMoveX();
		int moveY = player.getMoveY();
		moveX = player.getPlayerX();
		moveY = player.getPlayerY();
		
		switch(move)
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

				moveX--;

			}
			break;

		case 2 :

			if(player.getPlayerX()==player.getFieldSize()-1)		
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

			if(moveY==0)		
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

			if(player.getPlayerY()==player.getFieldSize()-1) 
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
		
		player.setPlayerPos(field[moveX][moveY]);
		if(battle.inCounter(player.getInCounter()))
		{
			battle.battleStart(player, monster);
			player.setInCounter(0);
		}
		Move.move(field, player.getPlayerX(), player.getPlayerY(), moveX, moveY);
		
		player.setInCounter(player.getInCounter()+10);
		
		player.setPlayer(moveX, moveY);			
	}







}
