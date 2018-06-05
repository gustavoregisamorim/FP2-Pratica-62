
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica62 {
    public static void main(String[] args) {
        
        Time time = new Time();
        
        time.addJogador("Goleiro", new Jogador(1, "João"));
        time.addJogador("Atacante", new Jogador(3, "José"));
        time.addJogador("Lateral", new Jogador(4, "Pedro"));
        time.addJogador("Zagueiro", new Jogador(1, "Lucas"));
        time.addJogador("MeioCampo", new Jogador(5, "Gustavo"));
         
        JogadorComparator jo = new JogadorComparator(true,true,false);
        
        List<Jogador> listOrd = time.ordena(jo);
        
        for(Jogador j: listOrd){
            System.out.println(j.toString());
        }
        
        int pos = Collections.binarySearch(listOrd, new Jogador(1));
        
        System.out.println("\n"+listOrd.get(pos));
    }
}
