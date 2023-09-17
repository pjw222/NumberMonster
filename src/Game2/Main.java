package Game2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Field field = new Field();
		Move move = new Move();
		
		int fieldSize ;
		int moveSelect;
		int monsterCount= 0;

		System.out.println("넘버 몬스터 시작");
		Scanner sc = new Scanner(System.in);
		System.out.println("플레이 하고싶은 필드 범위를 지정해주세요");
		fieldSize = sc.nextInt();
		move.player.setPosition(fieldSize);
		System.out.println("잡고싶은 몬스터 마릿수를 지정해주세요");
		monsterCount = sc.nextInt();
		move.player.setMonsterCount(monsterCount);
		move.player.choiceMonsters();
		field.SetFiled(fieldSize, move.player);
		

		while(true)
		{
			moveSelect = sc.nextInt();
			
			move.playerMove(field.getField(), moveSelect);
			field.print(fieldSize);	
				
		}
		
		
	}

}
