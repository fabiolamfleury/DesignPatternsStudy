package vehicleFactory;

public class TruckFactory extends Factory{
	protected TruckFactory() {
		
	}

	@Override
	public Engine getEngine() {
		return new TruckEngine();
	}

	@Override
	public Tyre getTyre() {
		return new TruckTyre();
	}
}
