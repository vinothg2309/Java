                          package basics;

public class SwitchTest {

	public static void main(String[] args) {
		
			String s = getValue(1);
			System.out.println(s);
			String s1 = getValue(2);
			System.out.println(s1);
			String s2 = getValue(10);
			System.out.println(s2);
			
			Integer i= directionEnum(DirectionEnum.NORTH);
			System.out.println(i);
			i= directionEnum(DirectionEnum.SOUTH);
			System.out.println(i);
			i= directionEnum(DirectionEnum.EAST);
			System.out.println(i);
			i= directionEnum(DirectionEnum.WEST);
			System.out.println(i);
	
			String s4 = getAlphabet(0);
			System.out.println(s4);
			s4 = getAlphabet(1);
			System.out.println(s4);
			s4 = getAlphabet(5);
			System.out.println(s4);
	
	
	}
	public static String getValue(int i)
	{
		String s= "";
		switch(i)
		{
			case 0:
				s="A";
				break;
			case 1:
				s="B";
				//System.out.println("B");
				break;
			case 2:
				s="C";
				//System.out.println("C");
				break;
			default:
				s="D";
				//System.out.println("D");
		
		}
		return s;
		
	}
	public static int directionEnum(DirectionEnum de)
	{
		switch(de)
		{
		case NORTH:
			return 0;
		case SOUTH:
			return 1;
		case EAST:
			return 2;
		case WEST:
			return 3;
		default:
			return 10;

		}
	}
	public static String getAlphabet(int y) {
		if (y==0)
		{
			return "z";
		}
		else if(y==1)
		{
			return "Y";
		}
		else
			return "x";
	}
}
