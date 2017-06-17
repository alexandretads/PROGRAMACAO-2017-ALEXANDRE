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
public class Matriz {
    public void imprimirMatriz(int[][] matriz){
        for (int[] matrizUm : matriz) {
            for (int b = 0; b < matrizUm.length; b++) {
                System.out.println("|" + matrizUm[b] + "|");
            }
        }
    }
 	public int[][] multiplicarMatrizes(int[][] matrizUm, int[][] matrizDois, int qtda, int qtdb){
 		int[][] resultado = new int[qtda][qtdb];
 		for (int i = 0; i < matrizUm.length; i++ ){
 			for (int j = 0; j < matrizUm.length; j++){
 				resultado[i][j] = (matrizUm[i][j] * matrizDois[i][j]);
 			}
 		}
 		return resultado;
 	} 
}
