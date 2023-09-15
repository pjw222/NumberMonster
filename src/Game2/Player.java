package Game2;

import java.util.Scanner;

public class Player {
	private int hp;
	private int x;
	private int y;
	private int[] monsters;
	private int monsterCount;
	private int fieldSize;
	private int move;
	private int inCounter;
	private int playerPos;
	private int moveX;
	private int moveY;
	private int endCount;
	
	
	public void setMove(int move)
	{
		this.move = move;
	}
	public int getMove()
	{
		return move;
	}
	public void setInCounter(int inCounter)
	{
		this.inCounter = inCounter;
	}
	public int getInCounter()
	{
		return inCounter;
	}
	public void setEndCount(int endCount)
	{
		this.endCount = endCount;
	}
	public int getEndCount()
	{
		return endCount;
	}
	public void setMonsters(int[] monsters)
	{
		this.monsters = monsters;
	}
	public void setMonsterCount(int monsterCount)
	{
		this.monsterCount=monsterCount;
	}
	public void choiceMonsters()
	{
		Scanner sc = new Scanner(System.in);
//		monsterCount = getMonsterCount();
//		monsters = getMonsters();
		monsters = new int[monsterCount];
		int size = fieldSize*fieldSize-1;
		while(true)
		{
			System.out.println("지정할수 있는 숫자몬스터는"+size+"안에 범위 입니다.");
			
			for(int i = 0; i<monsters.length; i++)
			{
				System.out.println("지정할 숫자몬스터"+(i+1)+ " : " );
				int num = sc.nextInt();
				if(size < num || num <1)
				{
					i--;
					System.out.println("범위를 넘어갑니다. 다시 입력해주세요");
					continue;
				}
				for(int j = 0; j<monsters.length; j++)
				{
					if(num==monsters[j])
					{
						System.out.println("같은 숫자몬스터를 지정했습니다. 다시 지정해주세요");
						i--;
						continue;
					}
				}
				monsters[i]=num;
			}
			
			for(int i = 0; i<monsters.length; i++)
			{
				System.out.println("지정한 숫자 몬스터" +(i+1)+ " : "+monsters[i]);
			}
			break;
		}
	}
	public int[] getMonsters()
	{
		return monsters;
	}
	public int getMonsterCount()
	{
		return monsterCount;
	}
	public void setPlayerHp(int hp)
	{
		this.hp =hp;		
	}
	public int getPlayerHp()
	{
		return hp;
	}
	public void setPlayer(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void setMoving(int moveX, int moveY)
	{
		this.moveX = moveX;
		this.moveY = moveY;
	}
	public int getMoveX()
	{
		return moveX;
	}
	public int getMoveY()
	{
		return moveY;
	}
	public void setPosition(int fieldSize)
	{
		this.fieldSize= fieldSize;
	}
	public int getFieldSize()
	{
		return fieldSize;
	}
	public int getPlayerX()
	{
		return x;
	}
	public int getPlayerY()
	{
		return y;
	}
	public int getPlayerPos()
	{
		return playerPos;
	}
	public void setPlayerPos(int playerPos)
	{
		this.playerPos = playerPos;
	}
}
