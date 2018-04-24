package mainTests;

import emissorExample.Emissor;
import emissorExample.EmissorFactory;
import vehicleExample.Vehicle;
import vehicleExample.VehicleFactory;

public class MainClient {
	public static void main(String[] args) {
		/*Emissor Example */
		EmissorFactory emissorFactory = new EmissorFactory();
		
		// caso tentasse usar o construtor EmissorEmail não conseguiria pois ele não é visível!		
		Emissor emissorEmail = emissorFactory.create(EmissorFactory.EMAIL);		
		emissorEmail.envia("TOPSter");
		
		Emissor emissorSMS = emissorFactory.create(EmissorFactory.SMS);		
		emissorSMS.envia("TOPSter SMS");
		
		Emissor emissorJMS = emissorFactory.create(EmissorFactory.JMS);		
		emissorJMS.envia("TOPSter JMS");
		
		
		/*Vehicle Example */
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle car = vehicleFactory.getVehicle(VehicleFactory.CAR);
		car.design();
		car.manufacture();
	}
}
