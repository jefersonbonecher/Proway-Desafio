/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        
    
   Placar p= new Placar(10);
   Placar p1= new Placar(14);
   Placar p2= new Placar(45);
   Placar p3= new Placar(8);
   Placar p4= new Placar(2);
  
 Jogo j = new Jogo();
   j.addPlacar(p);
   j.addPlacar(p1);
   j.addPlacar(p2);
   j.addPlacar(p3);
   j.addPlacar(p4);
   
  
   j.resultado();
   
   
}
}
