
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
        u.setNomeUsuario("maurore");
        u.setNome("Mauro"); 
        u.setSenha("12345");
        u.setEmail("maurojr@gmail.com");
        u.setAtivo(true);
        u.setDataCadastro(Calendar.getInstance());
        
        Usuario u1 = new Usuario();
        u1.setNomeUsuario("user");
        u1.setNome("Usuario");
        u1.setSenha("user123");
        u1.setEmail("user@user.com");
        u1.setAtivo(true);
        u1.setDataCadastro(Calendar.getInstance());
        em.getTransaction().begin();
        em.persist(u);
        em.persist(u1);
        em.getTransaction().commit();
        em.close();
        enf.close();
    }
}
