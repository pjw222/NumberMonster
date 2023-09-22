package Game3;

public class Hint {
	private int hintCount;


	public int getHintCount()
	{
		return hintCount;
	}
	public void setHintCount(int hintCount)
	{
		this.hintCount = hintCount;
	}
	public void hint(Move move, int[][] arr, Player player, Field field)
	{
		if(move.getMoveCount()>=10)
		{
			if(player.getPlayerX()-1>=0) {

				if(arr[player.getPlayerX()-1][player.getPlayerY()]==player.getTargetNext())
				{
					System.out.println("근처에 처음에 입력한 몬스터가있어!");
				}
			}
			if(player.getPlayerX()+1<=(field.getFieldSize()*field.getFieldSize()-1))
			{
				if(arr[player.getPlayerX()+1][player.getPlayerY()]==player.getTargetNext())
				{
					System.out.println("근처에 처음에 입력한 몬스터가있어!");
				}
			}
			if(player.getPlayerY()-1>=0) {

				if(arr[player.getPlayerX()][player.getPlayerY()-1]==player.getTargetNext())
				{
					System.out.println("근처에 처음에 입력한 몬스터가있어!");
				}
			}
			if(player.getPlayerY()+1<=(field.getFieldSize()*field.getFieldSize()-1))
			{
				if(arr[player.getPlayerX()][player.getPlayerY()+1]==player.getTargetNext())
				{
					System.out.println("근처에 처음에 입력한 몬스터가있어!");
				}
			}
		
			if(player.getTargetSize()>1)
			{
				if(player.getPlayerX()-1>=0) {

					if(arr[player.getPlayerX()-1][player.getPlayerY()]==player.getTargetLast())
					{
						System.out.println("근처에 마지막에 입력한 몬스터가있어!");
					}
				}
				if(player.getPlayerX()+1<=(field.getFieldSize()*field.getFieldSize()-1))
				{
					if(arr[player.getPlayerX()+1][player.getPlayerY()]==player.getTargetLast())
					{
						System.out.println("근처에 마지막에 입력한 몬스터가있어!");
					}
				}
				if(player.getPlayerY()-1>=0) {
					
					if(arr[player.getPlayerX()][player.getPlayerY()-1]==player.getTargetLast())
					{
						System.out.println("근처에 마지막에 입력한 몬스터가있어!");
					}
				}
				if(player.getPlayerY()+1<=(field.getFieldSize()*field.getFieldSize()-1))
				{
					if(arr[player.getPlayerX()][player.getPlayerY()+1]==player.getTargetLast())
					{
						System.out.println("근처에 마지막에 입력한 몬스터가있어!");
					}
				}
			}

		}
	}

}

