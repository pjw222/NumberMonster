package Game2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Field field = new Field();
		Move move = new Move();
		
		int fieldSize ;
		int moveSelect;
		int monsterCount= 0;
//		int[] monster = new int[monsterCount];
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		fieldSize = sc.nextInt();
		move.player.setPosition(fieldSize);
		monsterCount = sc.nextInt();
//		move.player.setMonsters(monster);
		move.player.setMonsterCount(monsterCount);
		move.player.choiceMonsters();
		field.SetFiled(fieldSize, move.player);
		
//		System.out.println(field.player);
		System.out.println(move.player.getMonsterCount());
		System.out.println(move.player.getMonsters().length);
		while(true)
		{
			moveSelect = sc.nextInt();
			
			move.playerMove(field.getField(), moveSelect);
			field.print(fieldSize);	
				
		}
		
		
	}

}
