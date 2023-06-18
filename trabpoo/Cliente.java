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

public class Cliente extends PessoaFisica {
    private String endereço;
    private float limiteCredito;

    public Cliente(int id, Date datacadastro, String fone, String email,
            String nome, String cpf, Date dataNascimento,
            String endereço, float limiteCredito) {
        super(id, datacadastro, fone, email, nome, cpf, dataNascimento);
        
        this.endereço = endereço;
        this.limiteCredito = limiteCredito;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() + "endere\u00e7o=" + endereço + ", limiteCredito=" + limiteCredito + '}';
    }
    
    
    
}
