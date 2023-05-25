package exceptions;


public class HandlingException  {

	public static void main(String[] args)throws InvalidAgeException {
		// TODO Auto-generated method stub


		try { 
			int i[] = new int[6]; 
			int j = i[10]; 
			System.out.println("Final");
		}
		catch (ArithmeticException ae) 
		{
			System.out.println(ae.getMessage()); 
		} 
		catch (ArrayIndexOutOfBoundsException arryexep) 
		{ 
			System.out.println(arryexep.getMessage());
			//arryexep.printStackTrace();

		} catch(Exception e) {

			System.out.println("parent exception occurs");
		} 
		finally {

			System.out.println("finally block is always executed"); 
		}




	}

}
