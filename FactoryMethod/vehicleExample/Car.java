package vehicleExample;

public class Car implements Vehicle{
	//construtor fica inacess�vel para o cliente
	protected Car() {
		
	}
	
	@Override
	public void design() {
		System.out.println("Design do carro");
		
	}

	@Override
	public void manufacture() {
		System.out.println("Manufaturar carro");
		
	}

}
