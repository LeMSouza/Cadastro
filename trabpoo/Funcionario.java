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

public class Funcionario extends PessoaFisica {
    private Date dataAdmissão;
    private Date datademissão;
    private String cargo;

    public Funcionario(int id, Date datacadastro, String fone, String email,
            String nome, String cpf, Date dataNascimento,
            Date dataAdmissão, Date datademissão, String cargo) {
        super(id, datacadastro, fone, email, nome, cpf, dataNascimento);
        
        this.dataAdmissão = dataAdmissão;
        this.datademissão = datademissão;
        this.cargo = cargo;
     
    }

    public Date getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(Date dataAdmissão) {
        this.dataAdmissão = dataAdmissão;
    }

    public Date getDatademissão() {
        return datademissão;
    }

    public void setDatademissão(Date datademissão) {
        this.datademissão = datademissão;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" + super.toString() + "dataAdmiss\u00e3o=" + dataAdmissão + ", datademiss\u00e3o=" + datademissão + ", cargo=" + cargo + '}';
    }
    
    
    
    
    
}
