/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author alexa
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor;
        autor = new Autor
        ("Alexandre Reis", "alemaidana07@gmail.com", "Masculino");
 
 	Livro livro;
        livro = new Livro("Livro ", autor, 10.00, 1);
 	System.out.println("\n");
 	System.out.println(livro.getAutor().toString());
 	}
  }