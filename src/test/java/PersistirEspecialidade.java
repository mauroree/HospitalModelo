
import br.edu.ifsul.modelo.Especialidade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mauro
 */
public class PersistirEspecialidade {

    public static void main(String[] args) {
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("HospitalModel_PU");
        EntityManager em = enf.createEntityManager();
        Especialidade e = new Especialidade();
        e.setDescricao("PEDIATRA");
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
        enf.close();
    }
}
