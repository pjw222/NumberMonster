package Game;

import java.util.Scanner;
public class NumberField {
	protected int[][] field;
	protected int a;
	protected int start;
	protected int move;
	protected int check;
	public static void main(String [] args)
	{

		Scanner sc = new Scanner(System.in);	
		int a=0;
		int move=0;
		int i1 = 0;
		int i2 = 0;
		int j1 = 0;
		int j2 = 0;
		System.out.println();
		a = sc.nextInt();

		int[][] field = new int[a][a];
		for(int i = 0; i<a;i++)
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
		
			System.out.println();
			move = sc.nextInt();
			
			switch(move)
			{
			case 8 : 
			
				if(i1==0)continue;
				else 
				{
					i2--;				
				}
				break;
			
			case 2 :
			
				if(i1==a-1)continue;
				else
				{
					i2++;
				}
				break;
			
			case 4 :
			
				if(j1==0)continue;
				else
				{
					j2--;
				}
			
			case 6:
			
				if(j1==a-1)continue;
				else
				{
					j2++;
				}
			
			}
			field[i1][j1] = field[i2][j2];
			field[i2][j2] = a*a;
		

			for(int i = 0;i<field.length;i++)
			{
				for(int j=0;j<field[i].length;j++)
				{					
					System.out.printf("#\t");	
				}	
				if(a%a==0)
				{
					System.out.print("\n\n");			
				}
			}
		
		}


	}
}
