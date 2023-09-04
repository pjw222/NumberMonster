package Game;

import java.util.Random;
import java.util.Scanner;

public class Battle  {
	protected int myDice;
	protected int monsterDice;
	protected int count;
	public void Battle()
	{
		player.setPlayerHp(50);
		monster.setMonsterHp(50);
		player.hp =50;
		monster.hp =50;
		String start;
		count =1;
		System.out.println("야생의 숫자를 만났다.");
		while(true)
		{
			
			Scanner sc = new Scanner(System.in);
			Random random =new Random();
			System.out.println();
			start=sc.nextLine();
			System.out.println(count+"번째판입니다.");

			 myDice = random.nextInt(6)+random.nextInt(6)+2;
			 monsterDice = random.nextInt(6)+random.nextInt(6)+2;

			System.out.println("당신의 주사위의 합은 "+myDice+" 입니다");
			System.out.println("몬스터의 주사위의 합은 "+monsterDice+" 입니다");
			System.out.println("현재 당신의 HP : "+player.hp);
			System.out.println("현재 몬스터의 HP : "+monster.hp);

			if(myDice>monsterDice)
			{
				System.out.println("당신이 이겼습니다.");
				monster.hp-=myDice;		
			}
			else if(myDice==monsterDice)
			{
				System.out.println("비겼습니다 다시 합니다.");
				
			}
			else if(myDice<monsterDice)
			{
				System.out.println("당신이 졋습니다.");
				player.hp-= monsterDice;
			}
			System.out.println("현재 남은 당신의 HP : "+player.hp);
			System.out.println("현재 남은 몬스터의 HP : "+monster.hp);
			System.out.println("다음턴을 가고싶으면 엔터를 눌러주세요");
			count++;
			
			if(player.hp<=0)
			{
				System.out.println("패배했습니다.");
				break;
			}
			if(player.hp<=0)
			{
				System.out.println("승리했습니다.");
				break;
			}
		}
	}
	
}
