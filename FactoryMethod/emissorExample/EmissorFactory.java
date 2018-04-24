package emissorExample;

public class EmissorFactory {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	
	public Emissor create(int tipoDeEmissor) throws IllegalArgumentException {
		switch (tipoDeEmissor) {
		case SMS:
			return new EmissorSMS();
		case EMAIL:
			return new EmissorEmail();
		case JMS:
			return new EmissorJMS();
		default:
			throw new IllegalArgumentException (" Tipo de emissor não suportado ");
		}
	}
}
