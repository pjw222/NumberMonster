package Game3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Field field = new Field();
		Move move = new Move();
		Player player = new Player();
		Battle battle = new Battle();
		Monster monster = new Monster();
		Hint hint = new Hint();
		int fieldSize ;
		int moveSelect;

		System.out.println("넘버 몬스터 시작");
		Scanner sc = new Scanner(System.in);
		System.out.println("플레이 하고싶은 필드 범위를 지정해주세요");

		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("숫자만 입력해주세요");
			System.out.println("플레이 하고싶은 필드 범위를 지정해주세요");
		}
		fieldSize = sc.nextInt();
		field.setFieldSize(fieldSize);

		System.out.println("잡고싶은 몬스터 마릿수를 지정해주세요");

		player.setSize(field);

		field.SetField(fieldSize,player);
		System.out.println("8 : 상, 4 : 좌, 6 : 우, 2 : 하 이동할 방향키야!");
		while(true)
		{	
			moveSelect = sc.nextInt();

			move.playerMove(field.getField(),moveSelect,field,player);
			hint.hint(move, field.getField(), player, field);
			field.print(fieldSize, player);
			if(battle.inCounter(battle.getInCounter()))
			{
				battle.battleStart(player, monster);
				battle.setInCounter(0);
				System.out.println("8 : 상, 4 : 좌, 6 : 우, 2 : 하 이동할 방향키야!");
				System.out.println("너가 지정한 몬스터는 : "+player.getTargetMonster());

			}
			battle.setInCounter(battle.getInCounter()+10);
		}





	}

}
