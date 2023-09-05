package Game;

import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		NumberField numberfield = new NumberField();
		Player player = new Player();
		Battle battle = new Battle();
		NumberMonster monster = new NumberMonster();
//		player.setPlayerHp(50);
//		monster.setMonsterHp(25);
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자판의 크기를 지정해주세요");
		player.fieldSize = sc.nextInt();
		
		System.out.println("잡고싶은 마릿수룰 입력하세요.");		
		player.monsterCount = sc.nextInt();
	
		player.setMonsters(player.monsters, player.monsterCount);

		numberfield.SetFiled(player.fieldSize);
		player.setPlayer(player.fieldSize-1, player.fieldSize-1);
//		System.out.println(player.getPlayerX());
//		System.out.println(player.getPlayerY());
		//battle.Battle(50, 50);
		System.out.println("2 : 하 / 8 : 상 / 4 : 좌 / 6 : 우 ");
		while(true)
		{			
			int playerMove = sc.nextInt();
			numberfield.monsterCount=player.monsterCount;
			numberfield.monsters=player.monsters;
			numberfield.endCount=player.endCount;
			numberfield.playerPos=player.playerPos;
			numberfield.playerMove(playerMove);
	
			
//			System.out.println(battle.endCount);
//			System.out.println(player.monsterCount);
			
			
			numberfield.print();
		}
		
	}

}
