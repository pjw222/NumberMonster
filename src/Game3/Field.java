package Game3;


public class Field  {
	private int[][] field;
	private int fieldSize;
	public int getFieldSize()
	{
		return fieldSize;
	}
	public int[][] getField()
	{
		return field;
	}
	public void setFieldSize(int fieldSize)
	{
		this.fieldSize = fieldSize;
	}
	public void SetField(int fieldSize, Player player)
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

//		field[player.getPlayerX()][player.getPlayerY()]=field[fieldSize-1][fieldSize-1];
//		field[fieldSize-1][fieldSize-1]=0;
		player.setPlayer(fieldSize-1,fieldSize-1);
		print(fieldSize,player);
	

	}
	public void Shuffle()
	{
		for(int i = 0; i<field.length;i++)
		{		
			for(int j = 0; j<field.length;j++)
			{	
				int c=(int)(Math.random()*field.length);
				int d=(int)(Math.random()*field.length);
				Util.move(field, c, d, i, j);		
			}
		}
	}
	public void print(int fieldSize, Player player)
	{
		for(int i = 0; i <fieldSize; i++)
		{
			for(int j = 0; j<fieldSize; j++)
			{
				if(field[i][j]==field[player.getPlayerX()][player.getPlayerY()])
				{					
					System.out.print("Player\t");
				}
				else
				{
					System.out.print(field[i][j]+"\t");
				}

			}
			if(fieldSize%fieldSize==0)
			{
				System.out.print("\n\n");

			}
		}
	}
}
