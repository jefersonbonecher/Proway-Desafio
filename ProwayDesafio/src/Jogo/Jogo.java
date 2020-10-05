
package Jogo;

import java.util.ArrayList;


/**
 Autor: Jeferson Bonecher
 */
public class Jogo {
   private ArrayList<Placar> placar ;// para agregar os objetos da clase placar 

   
   public Jogo() { // construtor padrao 
        this.placar = new ArrayList();
    }
   
   // metedo para adicionar os valores da clase placar 
public void addPlacar (Placar placar){
     if (placar != null){
            this.placar.add(placar);
        }
        else {
            throw new IllegalArgumentException("Placar inválido. Não pode ser nulo.");// tratamento de excesao 
        }
    }

//metodo para calcular o placar minimo da temporada. 
    public int temporadaMinima(){
        int minimo=Integer.MAX_VALUE;//pegar o maximo valor disponivel 
         for (Placar p: this.placar){  //percorer o ArryList placar
          if (minimo > p.getPlacar()){ // verificar valor da variavel minimo e maior que o valor do placar
               minimo=p.getPlacar(); //se a condicao acima estiver correta atribuir o valor do placar na variavel minimo  
           }   
       }
         
    return minimo; 
        
    }//metodo para calcular o placar maximo da temporada.
    public int temporadaMaxima(){
      int maximo=Integer.MIN_VALUE;//pegar o minimo valor disponivel 
       for (Placar p: this.placar){//percorer o ArryList placar
           if (maximo < p.getPlacar()){// verificar valor da variavel maximo e menor que o valor do placar
               maximo=p.getPlacar();//se a condicao acima estiver correta atribuir o valor do placar na variavel maximo 
           }   
       }
    return maximo;
    }
    //metodo para calcular se quebrou o recorde minimo da temporada.
    public int quebraRecordeMin(){
        int minimo=-1;
       int aux =Integer.MAX_VALUE;
       for (Placar p: this.placar){ //percorer o ArryList placar
          if (aux > p.getPlacar()){ // verificar valor da variavel aux e maior que o valor do placar
              minimo++;// acresenta +1 na variavel
            aux=p.getPlacar();//se a condicao acima estiver correta atribuir o valor do placar na variavel aux
          }        
    }
       return minimo;
    }
    //metodo para calcular se quebrou o recorde maximo da temporada.
    public int quebraRecordeMax(){
 int maximo=-1;
 int aux =Integer.MIN_VALUE;
       for (Placar p: this.placar){//percorer o ArryList placar
           if (aux < p.getPlacar()){// verificar valor da variavel aux e menor que o valor do placar
               maximo++;// acresenta +1 na variavel
               aux=p.getPlacar();//se a condicao acima estiver correta atribuir o valor do placar na variavel aux 
           }   
       }
    return maximo;
    }
    
    public String resultado(){// metodo para printar os resultados 
        int jogo=0;
   String str = ("Jogo | Placar | Mínimo da temporada | Máximo da temporada | Quebra recorde min. | Quebra recorde máx. \n" );   
                for (Placar p: this.placar){
             str +=((Integer.toString(jogo++))+"        "+ p.getPlacar() +"             "+ temporadaMinima() +"                "
                     + "    "+ temporadaMaxima() +"                    "+ quebraRecordeMin() +"                       "+ quebraRecordeMax()+ "\n"); 
                    
                    System.out.print(str);  
                }
  
   return str;
    }

    
            
}
