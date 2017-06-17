/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

/**
 *
 * @author alexandre
 */
public class Endereco {
        
    private String cep;
    private String rua;
	
    public String getCep() {
 	return cep;
    }
    public void setCep(String cep) {
 	this.cep = cep;
    }
 	
    public String getRua() {
 	return rua;
    }
    public void setRua(String rua) {
 	this.rua = rua;
    }
 	 	
    public void FormaCep(int cep){
 	String stringCep = cep + "";
 	String PrimeiraSeparacao;
        PrimeiraSeparacao = stringCep.substring(0,5);
        String UltimaSeparacao;
        UltimaSeparacao = stringCep.substring(5, 8);
 	this.cep = PrimeiraSeparacao + "-" + UltimaSeparacao;
    }
}
