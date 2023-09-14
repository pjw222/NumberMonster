package Game2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Field field = new Field();
		Move move = new Move();
		Player player = new Player();
		int fieldSize;
		int moveSelect;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		fieldSize = sc.nextInt();
		field.SetFiled(fieldSize);
		moveSelect = sc.nextInt();
		field.moving(moveSelect);
		field.print(fieldSize);
		
		
	}

}
