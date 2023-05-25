package basics;

public class DirectionEnumTest {
	public static void main(String[] args)
	{
		for(DirectionEnum directionEnum:DirectionEnum.values())
		{
			System.out.println(directionEnum +"  "+ directionEnum.getValue());
		}
	}
	

}
