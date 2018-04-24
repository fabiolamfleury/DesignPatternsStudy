package emissorExample;
public class EmissorJMS implements Emissor{
	protected EmissorJMS() {
		
	}
	
	@Override
	public void envia(String mensagem) {
		System.out.println("Envia mensagem via JMS: \n" + mensagem);
	}
}
