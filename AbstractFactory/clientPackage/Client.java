package clientPackage;

import vehicleFactory.Engine;
import vehicleFactory.Factory;
import vehicleFactory.Tyre;

public class Client {
	public static void main(String[] args) {
		Factory factory;
		try {
			factory = Factory.getFactory(Factory.CAR);
			
			Engine engine = factory.getEngine();
			engine.design();
			engine.manufacture();
			engine.test();
			
			Tyre tyre = factory.getTyre();
			tyre.design();
			tyre.manufacture();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
