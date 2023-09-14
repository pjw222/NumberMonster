package Game2;

import java.util.Random;
import java.util.Scanner;


public class Battle {
	private int myDice;
	private int monsterDice;
	private int count;
	
	public void battleStart(Player player, Monster monster)
	{
		
		player.setPlayerHp(20);
		monster.setMonsterHp(20);

		String start;
		count =1;
		System.out.println("야생의 숫자"+player.getPlayerPos()+"를 만났다");
		
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
				monster.setMonsterHp(monster.getMonsterHp()-myDice);
			}
			else if(myDice==monsterDice)
			{
				System.out.println("비겼습니다 다시 합니다.");
				
			}
			else if(myDice<monsterDice)
			{
				System.out.println("당신이 졋습니다.");
				player.setPlayerHp(player.getPlayerHp()-monsterDice);
			}
			System.out.println("현재 남은 당신의 HP : "+player.getPlayerHp());
			System.out.println("현재 남은 몬스터의 HP : "+monster.getMonsterHp());
			System.out.println("다음턴을 가고싶으면 엔터를 눌러주세요");
			count++;
			
				
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
