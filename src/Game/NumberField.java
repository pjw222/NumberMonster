package Game;

public class NumberField  extends Battle{
	protected int[][] field;




	public void SetFiled(int fieldSize)
	{
		field = new int[fieldSize][fieldSize];
		for(int i = 0; i<fieldSize; i++)
		{
			for(int j = 0; j<fieldSize; j++)
			{
				field[i][j] = i*fieldSize+j;
			}
		}
		setPosition(fieldSize);
		
		Shuffle();

		for(int i = 0; i<fieldSize; i++)
		{
			for(int j = 0; j<fieldSize; j++)
			{
				moveX=i;
				moveY=j;
				if(field[i][j]==0)
				{
					playerX=i;
					playerY=j;
				}
			}
		}
	
		
		field[playerX][playerY]=field[fieldSize-1][fieldSize-1];
		field[fieldSize-1][fieldSize-1]=0;
		setPlayer(fieldSize-1,fieldSize-1);

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
					System.out.print(field[i][j]+"\t");
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
		for(int i = 0; i<fieldSize;i++)
		{		
			for(int j = 0; j<fieldSize;j++)
			{	
				int c=(int)(Math.random()*fieldSize);
				int d=(int)(Math.random()*fieldSize);
				int temp = field[i][j];
				field[i][j] = field[c][d];
				field[c][d] = temp;			
			}
		}
	}
	public void playerMove(int playerMove)
	{
		super.playerMove(field, playerMove);
	}

	public void print()
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