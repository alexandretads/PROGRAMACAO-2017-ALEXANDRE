/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

/**
 *
 * @author alexa
 */
public class programa {
 
    public static void main(String[] args) {
    int x = 0, impar=0, i;
    float par = 0;
    
    for(i=0; i<30; i++){
        if(i%2==0){
	if(i>2){
	par = par*i;
	}
        else{
	par = i;
	}
        }
        else{
        impar = impar+i;
        }
    }
        System.out.println("A soma dos números ímpares é: "+ impar);
        System.out.println("A Multiplicação dos números pares é: "+ par);
    }    
}
