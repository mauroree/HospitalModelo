package br.edu.ifsul.util;

import br.edu.ifsul.modelo.Consulta;
import br.edu.ifsul.modelo.Especialidade;
import br.edu.ifsul.modelo.Exame;
import br.edu.ifsul.modelo.Medico;
import br.edu.ifsul.modelo.Paciente;
import br.edu.ifsul.modelo.Receituario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Mauro
 */
public class FabricaDados {

    public static List<Medico> carregaMedicos() {

        List<Medico> lista = new ArrayList<>();
        Medico m = new Medico();
        m.setId(1);
        m.setNome("Dr. Luciano");
        m.setCrm("12345678");
        m.setSexo("Masculino");
        m.setTelefone("((54)99776655");
        m.setHistorico("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur cursus sollicitudin felis "
                + "acfacilisis. Nunc feugiat elementum vulputate. Etiam est augue, maximus eu ultricies ut, "
                + "elementum et lacus. Aliquam sit amet iaculis dolor. Nullam quis egestas nulla, nec malesuada nisi. "
                + "Aliquam eget erat pharetra, scelerisque eros vitae, tincidunt nisl. Ut gravida leo id mi elementum efficitur. "
                + "Quisque feugiat velit et tincidunt sollicitudin. Integer ut est tristique, scelerisque nulla et, faucibus velit..");
        m.setPeso(79.00);
        m.setAltura(1.70);
        m.setNascimento(Calendar.getInstance());
        Especialidade e = new Especialidade();
        e.setDescricao("Pediatra");
        m.setEspecialidade(e);
        lista.add(m);
        return lista;
    }

    public static List<Paciente> carregaPacientes() {
        List<Paciente> lista = new ArrayList<>();
        Paciente p = new Paciente();
        p.setId(2);
        p.setNome("Marcos");
        p.setSexo("Masculino");
        p.setTelefone("((54)99776655");
        p.setHistorico("Possui intolerância a lactose e glúten.");
        p.setPeso(80.00);
        p.setAltura(1.70);
        p.setNascimento(Calendar.getInstance());
        lista.add(p);
        return lista;
    }

    public static List<Consulta> carregaConsultas() {

        List<Consulta> lista = new ArrayList<>();
        Consulta c = new Consulta();
        c.setId(1);
        c.setData(Calendar.getInstance());
        c.setHora(Calendar.getInstance());
        c.setPreConsulta("Dores.");
        c.setPosConsulta("Remédios receitados.");
        c.setMedico(carregaMedicos().get(0));
        c.setPaciente(carregaPacientes().get(0));

        Exame e1 = new Exame();
        e1.setId(1);
        e1.setNome("Hemograma");
        e1.setDescricao("Exame de sangue");
        Exame e2 = new Exame();
        e2.setId(2);
        e2.setNome("Exame de urina");
        e2.setDescricao("Exame de urina");
        c.adicionarExame(e1);
        c.adicionarExame(e2);

        Receituario r1 = new Receituario();
        r1.setId(1);
        r1.setPosologia("12 em 12h");
        r1.setValidade(Calendar.getInstance());
        Receituario r2 = new Receituario();
        r2.setId(2);
        r2.setPosologia("10 em 10h");
        r2.setValidade(Calendar.getInstance());
        c.adicionarReceituario(r1);
        c.adicionarReceituario(r2);

        lista.add(c);
        return lista;
    }

}
