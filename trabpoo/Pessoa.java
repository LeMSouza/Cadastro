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

public class Pessoa {
    private int id;
    private Date datacadastro;
    private String fone;
    private String email;

    public Pessoa(int id, Date datacadastro, String fone, String email) {
        this.id = id;
        this.datacadastro = datacadastro;
        this.fone = fone;
        this.email = email;
    }
    
    public void display(){
        
    }
 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", datacadastro=" + datacadastro + ", fone=" + fone + ", email=" + email + '}';
    }
    
    
    
    
}
