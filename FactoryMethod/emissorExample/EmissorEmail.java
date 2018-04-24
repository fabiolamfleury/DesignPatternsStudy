package emissorExample;
public class EmissorEmail implements Emissor{
	protected EmissorEmail() {
		
	}
	
	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por email: \n" + mensagem);
	}
}
