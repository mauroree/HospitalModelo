
import br.edu.ifsul.modelo.Permissao;
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
public class PersistirPermissao {

    public static void main(String[] args) {

        EntityManagerFactory enf = Persistence.createEntityManagerFactory("HospitalModel_PU");
        EntityManager em = enf.createEntityManager();
        Permissao p = new Permissao();
        p.setDescricao("administrador");
        p.setNome("ADMINISTRADOR");
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        enf.close();

    }

}
