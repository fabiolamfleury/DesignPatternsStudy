package emissorExample;
public class EmissorSMS implements Emissor{
	protected EmissorSMS() {
		
	}
	
	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem via sms: \n" + mensagem);
	}
}
