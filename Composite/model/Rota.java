package model;

import java.util.ArrayList;
import java.util.List;

public class Rota extends Trecho{
	private List<Trecho> trechos = new ArrayList<Trecho>();

	List<Trecho> getTrechos() {
		return trechos;
	}

	public void setTrechos(Trecho trecho) {
		this.trechos.add(trecho);
	}
}
