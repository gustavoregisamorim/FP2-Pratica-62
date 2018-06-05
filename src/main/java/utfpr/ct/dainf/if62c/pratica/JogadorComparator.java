/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author Gustavo
 */
public class JogadorComparator implements Comparator<Jogador>{
    
    private boolean ordNum;
    private boolean numAsc;
    private boolean nameAsc;
    
    public JogadorComparator(){
        this(true,true,true);
    }
    
    public JogadorComparator(boolean ordNum, boolean numAsc, boolean nameAsc){
        
        this.nameAsc = nameAsc;
        this.numAsc = numAsc;
        this.ordNum = ordNum;
    }

    @Override
    public int compare(Jogador o1, Jogador o2) {
        
        if(this.ordNum){    //ordenar por numero
            if(o1.numero == o2.numero){
                if(this.nameAsc){
                    return o1.nome.compareTo(o2.nome);
                }
                
                return -(o1.nome.compareTo(o2.nome));
            }
            
            if(this.numAsc){
                return o1.compareTo(o2);
            }
            
            return -(o1.compareTo(o2));
        }
        else{               //ordenar por nome
            if(o1.nome.equals(o2.nome)){
                if(this.numAsc){
                    return o1.compareTo(o2);
                }
                
                return -(o1.compareTo(o2));
            }
            
            if(this.nameAsc){
                return o1.nome.compareTo(o2.nome);
            }
            
            return -(o1.nome.compareTo(o2.nome));
        }
    }
}
