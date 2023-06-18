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
        
public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;
    private Date dataNascimento;

    public PessoaFisica(int id, Date datacadastro, String fone, String email,
            String nome, String cpf, Date dataNascimento) {
        super(id, datacadastro, fone, email);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + super.toString() + "nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + '}';
    }
    
    
    
}
