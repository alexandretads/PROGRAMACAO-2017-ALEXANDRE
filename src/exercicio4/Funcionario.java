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
public class Funcionario {
        
    private String nome;
    private String cargo;
    private Empresa superior;
    public String getNome() {
 		return nome;
    }
 
    public void setNome(String nome) {
 	this.nome = nome;
    }
 
    public String getCargo() {
 	return cargo;
    }
 
    public void setCargo(String cargo) {
 	this.cargo = cargo;
    }
 
    @Override
    public String toString() {
 
    	return "Funcionario: " + this.nome + ", Cargo: " + this.cargo;
    }
}
