package Game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		NumberField numberfield = new NumberField();
		Player player = new Player();
		
		numberfield.setPlayer(player);
		
		Scanner sc = new Scanner(System.in);
		
		player.fieldSize = sc.nextInt();
		
		numberfield.SetFiled(player.fieldSize);
		
		System.out.println("2 : 하 / 8 : 상 / 4 : 좌 / 6 : 우 ");
		
		int Move = sc.nextInt();
		
		numberfield.playerMove(Move);
		
		
	}

}
