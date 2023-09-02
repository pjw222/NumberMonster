package Game;

import java.util.Scanner;


public class Player extends NumberMonster {
	protected int hp;
	protected int playerX;
	protected int playerY;
	protected int[] monsters;
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
	public void setMonsters(int[] monsters, int monsterCount)
	{
		Scanner sc = new Scanner(System.in);
		monsters = new int[monsterCount];

		while(true)
		{		
			for(int i = 0; i<monsters.length;i++)
			{
				if(fieldSize*fieldSize-1>=monsters[i]&&monsters[i]>0)
				{
					System.out.println("다시 입력해주세요");
					continue;
				}
				else {
					System.out.println("지정할수 있는 숫자몬스터는"+fieldSize*fieldSize+"안에 범위 입니다.");
					System.out.println("지정할 숫자몬스터"+(i+1)+":");
					monsters[i]=sc.nextInt();
				}
			}
			for(int i= 0; i<monsters.length;i++)
			{					
				System.out.println("지정한 숫자몬스터" +(i+1)+": "+monsters[i]);							
			}
			break;
		}

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




