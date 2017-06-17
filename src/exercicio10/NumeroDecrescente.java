/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

/**
 *
 * @author alexa
 */
public class NumeroDecrescente {
    private final int numero;
 	
    public NumeroDecrescente(int numero){
 		this.numero = numero;
    }
 	
    public void printNumero(){
 	int descNum = numero + 1;
 	for(int j = numero; j >=0; j--){
 		descNum = descNum - 1;
 		System.out.println(descNum);
 		}
    }
 
}
