package Game;

public class NumberField  extends Player{
	protected int[][] field;
	protected Player player;

	public void setPlayer(Player player) {
		this.player = player;
	}

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
		player.setPosition(fieldSize);
		Shuffle();

		for(int i = 0; i<fieldSize; i++)
		{
			for(int j = 0; j<fieldSize; j++)
			{
				if(field[i][j]==0)
				{
					player.playerX=i;
					player.playerY=j;
				}
			}
		}
		field[player.playerX][player.playerY]=field[fieldSize-1][fieldSize-1];
		field[fieldSize-1][fieldSize-1]=0;

		for(int i = 0; i <fieldSize; i++)
		{
			for(int j = 0; j<player.fieldSize; j++)
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
			if(player.fieldSize%player.fieldSize==0)
			{
				System.out.print("\n\n");
			}
		}
		

	}
	public void Shuffle()
	{
		for(int i = 0; i<player.fieldSize;i++)
		{		
			for(int j = 0; j<player.fieldSize;j++)
			{	
				int c=(int)(Math.random()*player.fieldSize);
				int d=(int)(Math.random()*player.fieldSize);
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
	 
}