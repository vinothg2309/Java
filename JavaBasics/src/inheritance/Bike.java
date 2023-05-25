package inheritance;

public class Bike implements VehicleInterface{

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("smoooth brake");
	}

	@Override
	public void signal() {
		// TODO Auto-generated method stub
		System.out.println("smooth signal");
	}

}
