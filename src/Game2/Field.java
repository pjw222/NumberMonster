package Game2;


public class Field  {
	private int[][] field;
	public int[][] getField()
	{
		return field;
	}
	public void SetFiled(int fieldSize, Player player)
	{
		
		
		
		field = new int[fieldSize][fieldSize];
		for(int i = 0; i<fieldSize; i++)
		{
			for(int j = 0; j<fieldSize; j++)
			{
				field[i][j] = i*fieldSize+j;
			}
		}		
		

		Shuffle();

		for(int i = 0; i<fieldSize; i++)
		{
			for(int j = 0; j<fieldSize; j++)
			{
				
				if(field[i][j]==0)
				{
					player.setPlayer(i,j);
				}
			}
		}
//		int checkX = player.getPlayerX();
//		int checkY = player.getPlayerY();
		field[player.getPlayerX()][player.getPlayerY()]=field[fieldSize-1][fieldSize-1];
		field[fieldSize-1][fieldSize-1]=0;
		player.setPlayer(fieldSize-1,fieldSize-1);

		for(int i = 0; i <fieldSize; i++)
		{
			for(int j = 0; j<fieldSize; j++)
			{
				if(field[i][j]==0)
				{					
					System.out.print("Player\t");
				}
				else
				{
					System.out.print("#"+"\t");
				}

			}
			if(fieldSize%fieldSize==0)
			{
				System.out.print("\n\n");

			}
		}


	}
	public void Shuffle()
	{
		
		
		for(int i = 0; i<field.length;i++)
		{		
			for(int j = 0; j<field.length;j++)
			{	
				int c=(int)(Math.random()*field.length);
				int d=(int)(Math.random()*field.length);
				int temp = field[i][j];
				field[i][j] = field[c][d];
				field[c][d] = temp;			
			}
		}
	}
//	public void moving(int select)
//	{
//		super.playerMove(field, select);
//	}
	public void print(int fieldSize)
	{
		for(int i = 0; i <fieldSize; i++)
		{
			for(int j = 0; j<fieldSize; j++)
			{
				if(field[i][j]==0)
				{					
					System.out.print("Player\t");
				}
				else
				{
					System.out.print("#"+"\t");
				}

			}
			if(fieldSize%fieldSize==0)
			{
				System.out.print("\n\n");

			}
		}
	}
}
