package Game3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
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
		System.out.println("잡을수있는 마릿수는 "+field.getFieldSize()*field.getFieldSize()+" 마리 이하야!");
		player.setMonsterCount(field);
		player.setSize(field);

		field.SetField(fieldSize,player);
		System.out.println("8 : 상, 4 : 좌, 6 : 우, 2 : 하 이동할 방향키야!");
		while(true)
		{	

			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("숫자만 입력해주세요");
				System.out.println("8 : 상, 4 : 좌, 6 : 우, 2 : 하 이동할 방향키야!");
			}
			moveSelect = sc.nextInt();

			move.playerMove(field.getField(),moveSelect,field,player);
			hint.hint(move, field.getField(), player, field);
			field.print(fieldSize, player);
			if(battle.inCounter(battle.getInCounter()))
			{
				battle.battleStart(player, monster);
				battle.setInCounter(0);
				System.out.println("8 : 상, 4 : 좌, 6 : 우, 2 : 하 이동할 방향키야!");
				System.out.println("너가 지정한 몬스터는 : " +player.getTargetMonster());
				System.out.println("너가 현재 보유한 몬스터는 : "+player.getCatchMonster());

			}
			battle.setInCounter(battle.getInCounter()+10);

		}





	}

}
