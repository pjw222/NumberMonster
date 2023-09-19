package Game3;

import java.util.Random;
import java.util.Scanner;


public class Battle {
	private int myDice;
	private int monsterDice;
	private int count;
	private int inCounter;
	
	public void setInCounter(int inCounter)
	{
		this.inCounter = inCounter;
	}
	public int getInCounter()
	{
		return inCounter;
	}
	public void battleStart(Player player, Monster monster)
	{
		player.setPlayerHp(50);
		monster.setMonsterHp(5);

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
				if(player.getTargetMonster().contains(player.getPlayerPos()))
				{
					System.out.println("신난다 지정한 몬스터 : "+player.getPlayerPos()+"(을)를 잡았어!");
				  player.getCatchMonster().add(player.getPlayerPos());	
				  if(player.getTargetSize()==player.getCatchSize())
					{
						System.out.println("다 잡았어!");
						System.out.println("게임종료!");
						System.exit(1);
					}
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
