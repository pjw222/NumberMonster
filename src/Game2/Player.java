package Game2;

public class Player {
	private int hp;
	private int x;
	private int y;
	private int[] monsters;
	private int monsterCount;
	private int fieldSize;
	private int move;
	private int inCounter;
	private int playerPos;
	private int moveX;
	private int moveY;
	private int endCount;
	
	public void setPlayerHp(int hp)
	{
		this.hp =hp;		
	}
	public int getPlayerHp()
	{
		return hp;
	}
	public void setPlayer(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void setMove(int moveX, int moveY)
	{
		this.moveX = moveX;
		this.moveY = moveY;
	}
	public int getMoveX()
	{
		return moveX;
	}
	public int getMoveY()
	{
		return moveY;
	}
	public void setPosition(int fieldSize)
	{
		this.fieldSize= fieldSize;
	}
	public int getFiledSize()
	{
		return fieldSize;
	}
	public int getPlayerX()
	{
		return y;
	}
	public int getPlayerY()
	{
		return x;
	}
	public int getPlayerPos()
	{
		return playerPos;
	}
	public void setPlayerPos(int playerPos)
	{
		this.playerPos = playerPos;
	}
}
