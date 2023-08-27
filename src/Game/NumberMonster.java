package Game;

public class NumberMonster
{
	public void NumberField(String[] args)
	{
	
		int a = 3;
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
				System.out.println(field[i][j]);
			}
		}
		
	}

}
