package basics;

public enum DirectionEnum {

	NORTH(5),SOUTH(10),EAST(15),WEST(20);

	private int value;  

	private DirectionEnum(int i) {
		this.value = i;
	}
	
	public int getValue()
	{
		return this.value;
	}
}

