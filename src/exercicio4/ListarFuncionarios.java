/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class ListarFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
 	Empresa empresa = new Empresa();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com o número de funcionarios: ");
            int total = sc.nextInt();
            empresa.quantidade(total);
            
            for(int i = 0; i< total; i++ ){
                Empresa novoFuncionario = new Empresa();
                
                System.out.println("Nome: ");
                String nome = sc.next();
                novoFuncionario.setNome(nome);
                
                System.out.println("Cargo: ");
                String cargo = sc.next();
                novoFuncionario.setCargo(cargo);
                
                empresa.adicionaColaborador(i, novoFuncionario);
                
            }
            empresa.mostrarColaboradores();
        }
    }
}
