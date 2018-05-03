package model;
/* O google maps possui um sistema que, ao solicitar o melhor caminho(que é um trecho),
* ele precisa adicionar todos os objetos de uma mesma hierarquia e tratá-los uniformemente,
* ou seja, ele precisa adicionar ruas, avenidas, rodovias(que também são trechos) em um
* caminho e construir a rota
 * 
 * Visto que há uma hierarquia que deve ser tratada de maneira uniforme, implementa-se um Composite
 * 
 * */
public abstract class Trecho {
	protected int tamanho;
	protected String nome;
}
