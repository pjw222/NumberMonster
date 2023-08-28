package Game;

import java.util.Scanner;

public class NumberField {
	protected int a;
	protected int[][] field;
	protected int start;
	protected int move;
	protected int check;
	protected int i1;
	protected int i2;
	protected int j1;
	protected int j2;
	protected int tmp;

	class Field
	{



		field = new int[a][a];
		for(int i = 0; i<a; i++)
		{		
			for(int j = 0; j<a;j++)
			{
				field[i][j]=i*a+j+1;
			}

		}
		for(int i = 0; i<a;i++)
		{		
			for(int j = 0; j<a;j++)
			{	
				int c=(int)(Math.random()*a);
				int d=(int)(Math.random()*a);
				int temp = field[i][j];
				field[i][j] = field[c][d];
				field[c][d] = temp;			
			}
		}
		for(int i = 0; i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.printf("#\t");
				if(field[i][j]==a*a)
				{
					System.out.printf("Player"+"   ");
				}
			}

			if(a%a==0)
			{
				System.out.print("\n\n");			
			}
		}

		
	
		while(true)
		{
			for(int i=0;i<field.length;i++)
			{
				for(int j=0;j<field[i].length;j++)
				{
					if(field[i][j]==a*a) 
					{									
						i1 = i;
						i2 = i;
						j1 = j;
						j2 = j;
					}
				}
				
			}
		
			System.out.println("상(8)하(2)좌(4)우(6) 를 입력해주세요");
			move = sc.nextInt();
			
			switch(move)
			{
			case 8 : 
			
				if(i1==0)
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					continue;
				}
				else 
				{
					
					i2--;				
				}
				break;
			
			case 2 :
			
				if(i1==a-1)		
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					continue;
				}
				else
				{
					i2++;
				}
				break;
			
			case 4 :
			
				if(j1==0)		
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					continue;
				}
				else
				{
					j2--;
				}
				break;			
			case 6:
			
				if(j1==a-1) 
				{
					System.out.println("밖을 벗어날수 없습니다.");
					System.out.println("다시 입력해주세요");
					continue;
				}
				else
				{
					j2++;
				}
				break;	
			}
			
			field[i1][j1] = field[i2][j2];
			field[i2][j2] = a*a;
		

			for(int i = 0;i<field.length;i++)
			{
				for(int j=0;j<field[i].length;j++)
				{					
					System.out.printf("#\t");
					if(field[i][j]==a*a)
					{
						System.out.printf("Player"+"   ");
					}
				}
				
				if(a%a==0)
				{
					System.out.print("\n\n");			
				}
			}
		
		}

	}
	}
}