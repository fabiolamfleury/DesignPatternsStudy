package client;

import model.Adapter;
import model.Carrinho;

public class Cliente {

	public static void main(String[] args) {
		Carrinho carrinho = new Adapter();
		
		carrinho.addProduto();
		carrinho.removeProduto();
		carrinho.finalizarCompra();
	}

}
