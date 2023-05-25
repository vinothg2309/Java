package basics;

public class StringTest {
	public static void main(String[] args){
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		String s1="kiruba";
		String s2= new String("kiruba");
		String s3 ="kiruba";
		String s4="a_B_C";
		System.out.println(s1.equals(s3)+" " + s2.equals(s3)+" " + s2.equals(s1));
		System.out.println((s1==s3)+" " + (s2==s3)+" " + (s2==s1));
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 5));
		System.out.println(s1.length());
		String[] strArr = s4.split("_");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("---------------Testing Stringbuilder-------------");
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("A").append("_b").append("_c");
		System.out.println(stringBuilder.toString());
		
		s2.intern();
		
		System.out.println("s2.intern() : "+(s1==s2));
		Object obj = "abc";
		Object obj1 = 1;
		
		if(obj instanceof Integer) {
			Integer i = (Integer) obj;
			System.out.println("obj instanceof String : "+ i);
		}
		else if(obj instanceof String) {
			String s = (String) obj;
			System.out.println("obj instanceof String : "+ s);
		}
		
		if(obj1 instanceof String) {
			String s = (String) obj1;
			System.out.println("obj instanceof String : "+ s);
		}
		else if(obj1 instanceof Integer) {
			Integer i = (Integer) obj1;
			System.out.println("obj instanceof Integer : "+ i);
		}
	}

}
