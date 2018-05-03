package model;
/*	A Adapter usa indireção(GRASP) , isto é, serve como mediador entre duas classes, a nova 
 * implementação e a antiga
 */
public class Adapter extends Carrinho{
	CarrinhoMelhor novoCarrinho = new CarrinhoMelhor();
	
	@Override
	public void finalizarCompra() {
		novoCarrinho.novoFinalizarCompra();
	}
	
	@Override
	public void addProduto() {
		novoCarrinho.novoAddProduto();
	}
	
	@Override
	public void removeProduto() {
		novoCarrinho.novoRemoverProduto();
	}
}
