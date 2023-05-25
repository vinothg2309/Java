package inheritance;

public class InheritanceTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car= new Car();
		car.brake();
		car.signal();
		Vehicle bus=new Bus();
		bus.signal();
		
		VehicleInterface lorry = new Lorry();
		lorry.brake();
		lorry.signal();
		
		}

}
