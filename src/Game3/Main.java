package Game3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Field field = new Field();
		Move move = new Move();
		Player player = new Player();
		Battle battle = new Battle();
		Monster monster = new Monster();
		int fieldSize ;
		int moveSelect;

		System.out.println("넘버 몬스터 시작");
		Scanner sc = new Scanner(System.in);
		System.out.println("플레이 하고싶은 필드 범위를 지정해주세요");
		fieldSize = sc.nextInt();
		field.setFieldSize(fieldSize);
		System.out.println("잡고싶은 몬스터 마릿수를 지정해주세요");
		player.setSize();
		
		field.SetField(fieldSize,player);

		while(true)
		{
			moveSelect = sc.nextInt();
			move.playerMove(field.getField(),moveSelect,field,player);
			if(battle.inCounter(battle.getInCounter()))
			{
			   	battle.battleStart(player, monster);
			   	battle.setInCounter(0);
			}
			battle.setInCounter(battle.getInCounter()+10);
			field.print(fieldSize, player);
	
		}
		
		
	}

}
