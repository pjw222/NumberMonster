package Game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		NumberField numberfield = new NumberField();
		Player player = new Player();
		Battle battle = new Battle();
		NumberMonster monster = new NumberMonster();
		player.setPlayerHp(50);
		monster.setMonsterHp(50);
				
		Scanner sc = new Scanner(System.in);
		
		player.fieldSize = sc.nextInt();
		
		numberfield.SetFiled(player.fieldSize);
		player.setPlayer(player.fieldSize-1, player.fieldSize-1);
//		System.out.println(player.getPlayerX());
//		System.out.println(player.getPlayerY());
		battle.Battle();
		System.out.println("2 : 하 / 8 : 상 / 4 : 좌 / 6 : 우 ");
		while(true)
		{			
			int playerMove = sc.nextInt();
			
			numberfield.playerMove(playerMove);
			
			
			numberfield.print();
		}
		
	}

}
