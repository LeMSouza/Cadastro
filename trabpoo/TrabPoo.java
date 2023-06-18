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

public class TrabPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        PessoaFisica pf[] = new PessoaFisica[2];
        pf[0] = new PessoaFisica (1, new Date(29,03,21), "(48)99990000", "pessoafisica1@hotmail.com", "Jurema", "659.569.647-67", new Date(1998,01,19));
        pf[1] = new PessoaFisica (2, new Date(30,03,21), "(47)99887777", "pessoafisica2@hotmail.com", "Janete", "521.448.638-89", new Date(1995,12,28));
        
        System.out.println(pf[0].toString());
        System.out.println(pf[1].toString());
        
        Funcionario f[] = new Funcionario[2];
        f[0] = new Funcionario (1, new Date(29,03,21), "(48)99990000", "pessoafisica1@hotmail.com", "Jurema", "659.569.647-67", new Date(1998,01,19), new Date(2018,02,20), new Date(2019,05,15), "Auxiliar");
        f[1] = new Funcionario (2, new Date(30,03,21), "(47)99887777", "pessoafisica2@hotmail.com", "Janete", "521.448.638-89", new Date(1995,12,28), new Date(2020,01,12), new Date(2021,11,18), "Assistente");
        
        System.out.println(f[0].toString());
        System.out.println(f[1].toString());
        
        Cliente c[] = new Cliente[2];
        c[0] = new Cliente (1, new Date(29,03,21), "(48)99990000", "pessoafisica1@hotmail.com", "Jurema", "659.569.647-67", new Date(1998,01,19), "Rua Pernambuco Nº 14", (float) 600.30);
        c[1] = new Cliente (2, new Date(30,03,21), "(47)99887777", "pessoafisica2@hotmail.com", "Janete", "521.448.638-89", new Date(1995,12,28), "Rua Brasil Nº 10", (float) 500.50);
        
        System.out.println(c[0].toString());
        System.out.println(c[1].toString());
        
        PessoaJuridica pj[] = new PessoaJuridica[2];
        pj [0] = new PessoaJuridica (1, new Date (12,01,21), "(48)995634635", "pessoajuridica@gmail.com", "15.560.193/0001-25", "123456");
        pj [1] = new PessoaJuridica (2, new Date (12,10,20), "(47)995634635", "pessoajuridica@gmail.com", "12.620.193/0001-25", "123456");
        
        System.out.println(pj[0].toString());
        System.out.println(pj[1].toString());
        
        Fornecedor forn[] = new Fornecedor[2];
        
        forn[0] = new Fornecedor (4, new Date (15,02,21), "(45) 1234569874", "fornecedor1@gmail.com", "15.698.652/0002-13", "567894", "Forncedor Belo" );
        forn[1] = new Fornecedor (5, new Date (15,11,20), "(42) 5468569874", "fornecedor2@gmail.com", "15.623.654/0003-13", "612594", "Fornecedor Feijão" );
        
        

        
        
        
       
        
        
        
    }
    
}
