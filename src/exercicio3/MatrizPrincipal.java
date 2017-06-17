/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author alexandre
 */
public class MatrizPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Matriz matrizes = new Matriz();
 		
 	int[][] matrizUm = new int[2][2];
 	matrizUm[0][0] = 1;
 	matrizUm[1][1] = 2;
 	matrizUm[0][1] = 3;
 	matrizUm[1][0] = 4;
       
 		
 	int[][] matrizDois = new int [2][2];
 	matrizUm[0][0] = 1;
 	matrizUm[1][0] = 2;
 	matrizUm[0][1] = 3;
 	matrizUm[1][1] = 4;
        
        System.out.println("Matriz Um");
 	matrizes.imprimirMatriz(matrizUm);        
        System.out.println("\n");
 		
 	System.out.println("Matriz Dois");
 	matrizes.imprimirMatriz(matrizDois); 
        System.out.println("\n");
 		
 	int[][] multiplicacao = new int [2][2];
 	System.out.println("O resultado é: ");
 	multiplicacao = matrizes.multiplicarMatrizes (matrizUm, matrizDois, 2, 2);
 	matrizes.imprimirMatriz(multiplicacao);
 		
 	
 	}
 
 }