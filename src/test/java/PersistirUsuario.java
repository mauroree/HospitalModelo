
import br.edu.ifsul.modelo.Usuario;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mauro
 */
public class PersistirUsuario {

    public static void main(String[] args) {

        EntityManagerFactory enf = Persistence.createEntityManagerFactory("HospitalModel_PU");
        EntityManager em = enf.createEntityManager();
        Usuario u = new Usuario();
        u.setNomeUsuario("mrxjrAdmin");
        u.setNome("Mauro"); 
        u.setSenha("123456987");
        u.setEmail("maurojr@gmail.com");
        u.setAtivo(true);
        u.setDataCadastro(Calendar.getInstance());
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.close();
        enf.close();
    }
}
