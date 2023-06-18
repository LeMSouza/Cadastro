/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabpoo;

/**
 *
 * @author Letícia Souza
 */
import java.util.Date;
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String IncEst;

    public PessoaJuridica(int id, Date datacadastro, String fone, String email,
            String cnpj, String IncEst) {
        super(id, datacadastro, fone, email);
        this.cnpj = cnpj;
        this.IncEst = IncEst;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncEst() {
        return IncEst;
    }

    public void setIncEst(String IncEst) {
        this.IncEst = IncEst;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + super.toString() + "cnpj=" + cnpj + ", IncEst=" + IncEst + '}';
    }
    
    
    
}
