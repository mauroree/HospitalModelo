
import br.edu.ifsul.modelo.Permissao;
import br.edu.ifsul.modelo.Usuario;
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
public class PersistirPermissoes {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HospitalModel_PU");
        EntityManager em = emf.createEntityManager();
        Usuario u = em.find(Usuario.class, "mauro");
        Permissao p1 = em.find(Permissao.class, "ADMINISTRADOR");
        u.getPermissoes().add(p1);
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
