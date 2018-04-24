package emissorExample;

public class Client {
	public static void main(String[] args) {
		EmissorFactory emissorFactory = new EmissorFactory();
		
		Emissor emissorEmail = emissorFactory.create(EmissorFactory.EMAIL);		
		emissorEmail.envia("TOPSter");
		
		Emissor emissorSMS = emissorFactory.create(EmissorFactory.SMS);		
		emissorSMS.envia("TOPSter SMS");
		
		Emissor emissorJMS = emissorFactory.create(EmissorFactory.JMS);		
		emissorJMS.envia("TOPSter JMS");
	}
}
