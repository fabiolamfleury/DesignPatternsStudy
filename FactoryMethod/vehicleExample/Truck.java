package vehicleExample;

public class Truck implements Vehicle{
	protected Truck() {
		
	}
	
	@Override
	public void design() {
		System.out.println("Design do caminh�o");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufaturar caminh�o");
	}

}
