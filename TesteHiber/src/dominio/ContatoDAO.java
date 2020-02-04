/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author lab1
 */
public class ContatoDAO {
    
    public static void incluir(int id, String nome,String telefone, String email){
        Contato c = new Contato(id, nome, telefone, email);
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(c);
        s.getTransaction().commit();    
}
    public static void editar( int id, String nome, String telefone, String email){
        Contato c = new Contato(id, nome,telefone, email);
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.update(c);
        s.getTransaction().commit();
    }     
    public static void excluir(int id) {
        Contato c = new Contato();
        c.setId(id);
        c.setNome("Tobias");
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.delete(c);
        s.getTransaction().commit();
    }
    public static String listar(){
        String retorno = "";
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Contato> lista = s.createQuery("From Contato").list();
        
        for (Contato c : lista) {
            retorno = retorno + "Nome: " + c.getNome() + "\n";
        }
        s.getTransaction().commit();
        return retorno;
        }
 
    
}
    