/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author alexa
 */
public class PaisPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
		Pais franca = new Pais("França", "Paris", 673.801);
		Pais belgica = new Pais("Belgica", "Bruxelas", 30.510);
		Pais espanha = new Pais("Espanha", "Madrid", 505.954);
		Pais portugal = new Pais("Portugal", "Lisboa", 92.212);
		
		System.out.println("\n");
		System.out.println(franca.equals(franca));
		System.out.println(franca.equals(belgica));
		System.out.println(espanha.equals(espanha));
		
		franca.setFronteiras(belgica, espanha);
		belgica.setFronteiras(franca);
		espanha.setFronteiras(franca, portugal);
		portugal.setFronteiras(espanha);
		
		System.out.println("\n");
		imprimeFronteira(franca.getFronteiras());
		imprimeFronteira(belgica.getFronteiras());
		imprimeFronteira(espanha.getFronteiras());
		imprimeFronteira(portugal.getFronteiras());
		
		System.out.println("\n");
		imprimeFronteira(belgica.vizinhosEmComum(espanha));
	}	
	
	private static void imprimeFronteira(Pais[] paises) {
		for(Pais pais : paises) {
			System.out.print(pais.getNome() + " ");
		}
		System.out.println();
	}
}