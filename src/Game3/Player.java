package Game3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Player {
	private int hp;
	private int x;
	private int y;
	private Set<Integer> targetMonster = new HashSet<Integer>();
	private Set<Integer> catchMonster = new HashSet<Integer>();
	private int inCounter;
	private int playerPos;
	private int endCount;
	
	


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

//	public void choiceMonsters()
//	{
//		Scanner sc = new Scanner(System.in);
//		monsters = new int[monsterCount];
//		int size = fieldSize*fieldSize-1;
//		while(true)
//		{
//			System.out.println("지정할수 있는 숫자몬스터는"+size+"안에 범위 입니다.");
//			
//			for(int i = 0; i<monsters.length; i++)
//			{
//				System.out.println("지정할 숫자몬스터"+(i+1)+ " : " );
//				int num = sc.nextInt();
//				if(size < num || num <1)
//				{
//					i--;
//					System.out.println("범위를 넘어갑니다. 다시 입력해주세요");
//					continue;
//				}
//				for(int j = 0; j<monsters.length; j++)
//				{
//					if(num==monsters[j])
//					{
//						System.out.println("같은 숫자몬스터를 지정했습니다. 다시 지정해주세요");
//						i--;
//						continue;
//					}
//				}
//				monsters[i]=num;
//			}
//			
//			for(int i = 0; i<monsters.length; i++)
//			{
//				System.out.println("지정한 숫자 몬스터" +(i+1)+ " : "+monsters[i]);
//			}
//			break;
//		}
//	}

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
