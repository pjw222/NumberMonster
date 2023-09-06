package Game2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Field field = new Field();		
		int fieldSize;
		Scanner sc = new Scanner(System.in);
		fieldSize = sc.nextInt();
		
		field.SetFiled(fieldSize);
	}

}
