package Game;

public class BattleScene  {
	public static boolean inCounter(int inCounter)
	{
		int k =(int)(Math.random()*100)+1;
		if(k<inCounter)
		{
			return true;
		}
		return false;
	}

}
