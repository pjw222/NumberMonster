package Game;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	protected int myDice;
	protected int monsterDice;
	public static void main(String[]args)
	{
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			Random random =new Random();
			System.out.println("야생의 숫자를 만났다.");

			int myDice = random.nextInt(6)+random.nextInt(6)+2;
			int monsterDice = random.nextInt(6)+random.nextInt(6)+2;

			System.out.println("당신의 주사위의 합은 "+myDice+" 입니다");
			System.out.println("몬스터의 주사위의 합은 "+monsterDice+" 입니다");

			if(myDice>monsterDice)
			{
				System.out.println("당신이 이겼습니다.");
				break;
			}
			else if(myDice==monsterDice)
			{
				System.out.println("비겼습니다 다시 합니다.");
				continue;
			}
			else 
			{
				System.out.println("당신이 졋습니다.");
				break;
			}
		}
	}
	
}
