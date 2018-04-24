package vehicleExample;

public class Truck implements Vehicle{
	protected Truck() {
		
	}
	
	@Override
	public void design() {
		System.out.println("Design do caminhão");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufaturar caminhão");
	}

}
