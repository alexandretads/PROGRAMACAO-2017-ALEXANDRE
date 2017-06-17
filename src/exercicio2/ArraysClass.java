/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author alexa
 */
public class ArraysClass {
    int[] inteiros;
    
    public int[] getInt() {
        return inteiros;
    }
    public void setInt(int[] inteiros) {
        this.inteiros = inteiros;
    }
        
    public void numeros(int num1, int num2) {
        inteiros[num1] = num2;
    }        
    public void contador(int contador) {
 		inteiros = new int[contador];
    } 	
    public int soma() {
 	int total = 0;
 	for (int j = 0; j < inteiros.length; j++) {
 	total = total + inteiros[j];
        }   
 	return total;
    } 
}
