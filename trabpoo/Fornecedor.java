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
public class Fornecedor extends PessoaJuridica {
    private String razaoSocial;

    public Fornecedor(int id, Date datacadastro, String fone, String email,
            String cnpj, String IncEst, String razaoSocial) {
        super(id, datacadastro, fone, email, cnpj, IncEst);
        this.razaoSocial = razaoSocial;
    }
    
    

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + super.toString() + "razaoSocial=" + razaoSocial + '}';
    }
    
    
    
}
