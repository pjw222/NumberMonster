package Game2;

import java.util.Random;
import java.util.Scanner;


public class Battle {
	private int myDice;
	private int monsterDice;
	private int count;

	public void battleStart(Player player, Monster monster)
	{
		player.setPlayerHp(50);
		monster.setMonsterHp(50);

		String start;
		count =1;
		System.out.println("야생의 숫자 "+player.getPlayerPos()+"(을)를 만났다");

		while(true)
		{

			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			System.out.println();
			start = sc.nextLine();
			System.out.println(count+"번째판입니다.");

			myDice = random.nextInt(6)+random.nextInt(6)+2;
			monsterDice = random.nextInt(6)+random.nextInt(6)+2;

			if(myDice>monsterDice)
			{
				System.out.println("당신이 이겼습니다.");
				System.out.println(myDice+" 만큼 데미지를 줍니다.");
				monster.setMonsterHp(monster.getMonsterHp()-myDice);

			}
			else if(myDice==monsterDice)
			{
				System.out.println("비겼습니다 다시 합니다.");

			}
			else if(myDice<monsterDice)
			{
				System.out.println("당신이 졋습니다.");
				System.out.println(monsterDice+" 만큼 피해를 입습니다.");
				player.setPlayerHp(player.getPlayerHp()-monsterDice);
				

			}
			System.out.println("현재 남은 당신의 HP : "+player.getPlayerHp());
			System.out.println("현재 남은 몬스터의 HP : "+monster.getMonsterHp());
			System.out.println("다음턴을 가고싶으면 엔터를 눌러주세요");
			count++;

			if(player.getPlayerHp()<=0) //패배
			{
				System.out.println("패배했습니다.");
				break;
			}
			else if(monster.getMonsterHp()<=0)
			{
				System.out.println("승리 했습니다."); //승리
				int[] catchMonster = player.getMonsters();
				for(int i=0;i<player.getMonsterCount();i++)
				{
					if(player.getPlayerPos()==catchMonster[i])
					{
						player.setEndCount(player.getEndCount()+1);
						System.out.println("현재 잡은 지정 숫자몬스터 :"+catchMonster[i]);
					}
					else if(player.getPlayerPos()!=catchMonster[i])
					{	
						System.out.println("잡아야하는 몬스터는 "+catchMonster[i]+" 입니다");						

					}
				}
				System.out.println(player.getMonsterCount());
				System.out.println("현재 잡은 지정 숫자몬스터 마릿수:"+player.getEndCount());
				if(player.getEndCount()==player.getMonsterCount()) //종료조건
				{
					System.out.println("다잡았습니다.");
					System.exit(1);
					break;
				}
				break;
			}


		}

	}
	public boolean inCounter(int inCounter)
	{
		int k =(int)(Math.random()*100)+1;
		if(k<inCounter)
		{
			return true;
		}
		return false;
	}


}
