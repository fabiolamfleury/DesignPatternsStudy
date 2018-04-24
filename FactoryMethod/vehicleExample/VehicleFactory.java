package vehicleExample;

public class VehicleFactory {
	public final static int TRUCK = 0;
	public final static int CAR = 1;
	public final static int MOTORCYCLE = 2;
	
	public Vehicle getVehicle(int type)  throws IllegalArgumentException{
		switch (type) {
		case TRUCK:
			return new Truck();
		case CAR:
			return new Car();
		case MOTORCYCLE:
			return new Motorcycle();
		default:
			throw new IllegalArgumentException("Vehicle type doesn't exist");
		}
	}
}
