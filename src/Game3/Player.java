package Game3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Player {
	private int hp;
	private int x;
	private int y;
	private Set<Integer> targetMonster = new LinkedHashSet<Integer>();
	private Set<Integer> catchMonster = new HashSet<Integer>();

	private int playerPos;


	public void setTargetMonster()
	{	
		Scanner sc = new Scanner(System.in);
		int targetMonster = sc.nextInt();

		this.targetMonster.add(targetMonster);
	}
	public Set<Integer> getTargetMonster()
	{
		return targetMonster;
	}
	public void setSize()
	{
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int size = sc.nextInt();
		while(targetMonster.size()!=size)
		{
			System.out.println(count +" 번째 몬스터");
			int checkSize = targetMonster.size();
			setTargetMonster();
			if(targetMonster.size()!=checkSize) {

				count++;
			}
			else if(targetMonster.size()==checkSize)
			{
				System.out.println("동일한 몬스터를 입력했습니다 다시입력해주세요");
			}

		}	
		System.out.println("내가 잡아야하는 몬스터 : "+targetMonster);
	}
	public void setCatchMonster(Set<Integer> catchMonster)
	{
		this.catchMonster = catchMonster;
		
	}
	public Set<Integer> getCatchMonster()
	{
		return catchMonster;
	}

	public int getCatchSize()
	{
		return catchMonster.size();
	}
	public int getTargetSize()
	{
		return targetMonster.size();
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
