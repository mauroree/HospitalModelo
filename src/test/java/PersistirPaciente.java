
import br.edu.ifsul.modelo.Paciente;
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
public class PersistirPaciente {

    public static void main(String[] args) {

        EntityManagerFactory enf = Persistence.createEntityManagerFactory("HospitalModel_PU");
        EntityManager em = enf.createEntityManager();
        Paciente p = new Paciente();
        p.setAltura(1.70);
        p.setHistorico("Intolerãncia a gluten.");
        p.setNascimento(Calendar.getInstance());
        p.setNome("Marcos Alves");
        p.setSexo("Masculino");
        p.setPeso(79.00);
        p.setTelefone("(54) 9 99887755");
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        enf.close();

    }

}
