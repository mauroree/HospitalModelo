
import br.edu.ifsul.modelo.Especialidade;
import br.edu.ifsul.modelo.Medico;
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
public class PersistirMedico {

    public static void main(String[] args) {

        EntityManagerFactory enf = Persistence.createEntityManagerFactory("HospitalModel_PU");
        EntityManager em = enf.createEntityManager();
        Medico m = new Medico();
        m.setAltura(1.70);
        m.setCrm("99009900");
        Especialidade e = new Especialidade();
        e.setDescricao("PEDIATRA");
        m.setEspecialidade(e);
        m.setHistorico("Formado em medicina pela universidade tal.");
        m.setNascimento(Calendar.getInstance());
        m.setNome("Claúdio Silva Sauro");
        m.setSexo("Masculino");
        m.setPeso(79.00);
        m.setTelefone("(54) 9 99887766");
        em.getTransaction().begin();
        em.persist(m);
        em.getTransaction().commit();
        em.close();
        enf.close();

    }

}
