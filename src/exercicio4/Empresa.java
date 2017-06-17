/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author alexandre
 */
public class Empresa {
    public Empresa[] arrayColaboradores; 	
 	
    public void mostrarColaboradores(){
 	if (arrayColaboradores != null){
             for (Empresa arrayColaboradore : arrayColaboradores) {
                 System.out.println(arrayColaboradore.toString());
             }
            } 		
 	}
 	public void quantidade(int quantidade){
 		arrayColaboradores = new Empresa[quantidade];
 		
 	}
 	public void adicionaColaborador(int posicao, Empresa colaborador){
 		arrayColaboradores[posicao] = colaborador;
 	}

    void setNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCargo(String cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 	
}
