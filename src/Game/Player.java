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
	protected int inCounter;
	protected int playerPos;
	protected int moveX;
	protected int moveY;
	protected int endCount;

	

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
	public int getPlayerPos()
	{
		return playerPos;
	}
	public void setPlayerPos(int playerPos)
	{
		this.playerPos = playerPos;
	}

	public void setMonsters(int[] monsters, int monsterCount)
	{
		Scanner sc = new Scanner(System.in);
		monsters = new int[monsterCount];
		int size = fieldSize*fieldSize;
		while(true)
		{		
			System.out.println("지정할수 있는 숫자몬스터는"+(size-1)+"안에 범위 입니다.");
			
			for(int i = 0; i<monsters.length;i++)
			{	
				
				System.out.println("지정할 숫자몬스터"+(i+1)+":");
				int num =sc.nextInt();				
				if(size-1 < num || num<1) {
					i--;
					System.out.println("범위를 넘어갑니다. 다시입력해주세요");
					continue;
				}
				for(int j = 0; j<monsters.length;j++)
				{
					if(num==monsters[j])
					{
						System.out.println("같은 숫자입니다 다시입력해주세요");
						i--;
						continue;
					}
				}
				monsters[i]=num;
	
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

		  moveX = playerX;
		  moveY = playerY;
		  

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




