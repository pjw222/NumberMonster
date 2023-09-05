package Game;


import java.util.Random;
import java.util.Scanner;

public class Battle extends Player {
	protected int myDice;
	protected int monsterDice;
	protected int count;
	protected int endCount;
	public void Battle(int playerHp, int monsterHp)
	{

		NumberField fields = new NumberField();
		setPlayerHp(playerHp);
		setMonsterHp(monsterHp);
	    
		
		String start;
		count =1;
		endCount =0;
		System.out.println("야생의 숫자"+playerPos+"를 만났다.");
		System.out.println(monsterCount);
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
			System.out.println("현재 당신의 HP : "+playerHp);
			System.out.println("현재 몬스터의 HP : "+monsterHp);

			if(myDice>monsterDice)
			{
				System.out.println("당신이 이겼습니다.");
				monsterHp-=myDice;		
			}
			else if(myDice==monsterDice)
			{
				System.out.println("비겼습니다 다시 합니다.");
				
			}
			else if(myDice<monsterDice)
			{
				System.out.println("당신이 졋습니다.");
				playerHp-= monsterDice;
			}
			System.out.println("현재 남은 당신의 HP : "+playerHp);
			System.out.println("현재 남은 몬스터의 HP : "+monsterHp);
			System.out.println("다음턴을 가고싶으면 엔터를 눌러주세요");
			count++;
			
			if(playerHp<=0)
			{
				System.out.println("패배했습니다.");
				break;
			}
			if(monsterHp<=0)
			{
				System.out.println("승리했습니다.");
				
				for(int i=0;i<monsterCount;i++)
				{

					if(playerPos==monsters[i])
					{
						endCount++;
						System.out.println("현재 잡은 지정 숫자몬스터 :"+monsters[i]);
					}	
				}
				
				System.out.println("현재 잡은 지정 숫자몬스터 수:"+endCount);
				if(endCount==monsterCount)
				{
					System.out.println("다잡음요");
					System.exit(1);
//					break;
				}
				break;
			}
		}
	}

}