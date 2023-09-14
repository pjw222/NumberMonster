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
	
	
	public void setMove(int move)
	{
		this.move = move;
	}
	public int getMove()
	{
		return move;
	}
	public void setInCounter(int inCounter)
	{
		this.inCounter = inCounter;
	}
	public int getInCounter()
	{
		return inCounter;
	}
	public void setEndCount(int endCount)
	{
		this.endCount = endCount;
	}
	public int getEndCount()
	{
		return endCount;
	}
	public void setMonsters(int[] monsters, int monsterCount)
	{
		this.monsters = monsters;
		this.monsterCount = monsterCount;
	}
	public int[] getMonsters()
	{
		return monsters;
	}
	public int getMonsterCounter()
	{
		return monsterCount;
	}
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
	public void setMoving(int moveX, int moveY)
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
	public int getFieldSize()
	{
		return fieldSize;
	}
	public int getPlayerX()
	{
		return x;
	}
	public int getPlayerY()
	{
		return y;
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
