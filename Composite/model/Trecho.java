package model;
/* O google maps possui um sistema que, ao solicitar o melhor caminho(que � um trecho),
* ele precisa adicionar todos os objetos de uma mesma hierarquia e trat�-los uniformemente,
* ou seja, ele precisa adicionar ruas, avenidas, rodovias(que tamb�m s�o trechos) em um
* caminho e construir a rota
 * 
 * Visto que h� uma hierarquia que deve ser tratada de maneira uniforme, implementa-se um Composite
 * 
 * */
public abstract class Trecho {
	protected int tamanho;
	protected String nome;
}
