/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Gustavo
 */
public class Time {
    
    private HashMap<String, Jogador> jogadores;
    
    public Time(){
        this.jogadores = new HashMap<>();
    }
    
    public HashMap<String, Jogador> getJogadores(){
        return jogadores;
    }
    
    public void addJogador(String string, Jogador jog){
        
        this.jogadores.put(string, jog);
    }
    
    public List<Jogador> ordena(JogadorComparator jogador){

        Set<String> entradas = this.getJogadores().keySet();
        List<Jogador> array = new ArrayList<>();
        
        for(String entrada: entradas){
           array.add(this.getJogadores().get(entrada));   
        }
        
        array.sort(jogador);

        return array;   
    }
}
