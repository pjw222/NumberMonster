package Game;

import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=0;
		int e=0;
		int f=0;
		a=sc.nextInt();



		int[][] ab= new int[a][a];
		for(int i = 0; i<a; i++)
		{		
			for(int j = 0; j<a;j++)
			{
				ab[i][j]=i*a+j;
			}

		}
		for(int i = 0; i<a;i++)
		{		
			for(int j = 0; j<a;j++)
			{	
				int c=(int)(Math.random()*a);
				int d=(int)(Math.random()*a);
				int temp = ab[i][j];
				ab[i][j] = ab[c][d];
				ab[c][d] = temp;			
			}
		}
		for(int i = 0; i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(ab[i][j]==0)
				{
					System.out.printf("#\t");
					e=i;
					f=j;
				}
				else {

					System.out.printf(ab[i][j]+"\t");
				}

			}

			if(a%a==0)
			{
				System.out.print("\n\n");			
			}
		}
		ab[e][f]=ab[3][3];
		ab[3][3]=0;
		for(int i = 0; i<a;i++)
		{
			for(int j=0;j<a;j++)
			{

				System.out.printf(ab[i][j]+"\t");


			}

			if(a%a==0)
			{
				System.out.print("\n\n");			
			}
		}
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
	}


}
