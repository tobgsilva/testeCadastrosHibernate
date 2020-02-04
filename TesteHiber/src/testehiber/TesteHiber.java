/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testehiber;

import dominio.ContatoDAO;

/**
 *
 * @author lab1
 */
public class TesteHiber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ContatoDAO.incluir(10, "Dez", "1010-1010", "dez@uol.com.br");
       //ContatoDAO.editar(3, "Tobias","666-666","divo@gmail.com");
        ContatoDAO.excluir(10);
    }
    
}
