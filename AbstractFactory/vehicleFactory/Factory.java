package vehicleFactory;

public abstract class Factory {
	private static Factory carFactory = null;
	private static Factory truckFactory = null;
	
	public static final int CAR = 0;
	public static final int TRUCK = 1;
	public abstract Engine getEngine();
	public abstract Tyre getTyre();
	
	public static Factory getFactory(int vehicleType) throws IllegalArgumentException{
		Factory factory = null;
		switch (vehicleType) {
		case CAR:
			if (carFactory == null) {
				carFactory = new CarFactory();
			}
			factory = carFactory;
		case TRUCK:
			if (truckFactory == null) {
				truckFactory = new TruckFactory();
			}
			factory = truckFactory;
		default:
			throw new IllegalArgumentException();
		}
		return factory;
	}
}
