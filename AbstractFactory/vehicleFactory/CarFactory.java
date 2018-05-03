package vehicleFactory;

class CarFactory extends Factory{
	protected CarFactory() {
		
	}

	@Override
	public Engine getEngine() {
		return new CarEngine();
	}

	@Override
	public Tyre getTyre() {
		return new CarTyre();
	}
}
