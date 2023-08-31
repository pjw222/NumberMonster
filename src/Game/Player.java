package Game;

public class Player {
	protected int hp;
	protected int playerX;
	protected int playerY;
	protected int[] monster;
	protected int monsterCount;
	protected int fieldSize;
	protected int playerMove;
	protected int xa;
	protected int xb;
	protected int ya;
	protected int yb;

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
		while(true) {
			for(int i=0;i<field.length;i++)
			{
				for(int j=0;j<field[i].length;j++)
				{
					if(field[i][j]==0) 
					{	
						xa=i;
						xb=i;
						ya=j;
						yb=j;
					}
				}
				
			}
			switch(playerMove)
			{
			case 8:
				if(xa==0)
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					continue;
				}
				else 
				{
					xb--;				
				}
				break;
			case 2 :

				if(xa==fieldSize-1)		
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					continue;
				}
				else
				{
					xb++;
				}
				break;

			case 4 :
				if(ya==0)		
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					continue;
				}
				else
				{
					yb--;
				}
				break;			
			case 6:

				if(ya==fieldSize-1) 
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					continue;
				}
				else
				{
					yb++;
				}
				break;	
			}
			field[xa][ya] = field[xb][yb];
			field[xb][yb] = 0;

		}
	}


}
