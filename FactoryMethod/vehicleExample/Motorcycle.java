package vehicleExample;

public class Motorcycle implements Vehicle{
	protected Motorcycle() {
		
	}
	@Override
	public void design() {
		System.out.println("Design da moto");
		
	}

	@Override
	public void manufacture() {
		System.out.println("Manufaturar moto");
		
	}

}
