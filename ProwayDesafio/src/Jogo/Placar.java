/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

/**
 Autor: Jeferson Bonecher
 */
public class Placar {
    //variavel inicial placar para guardar o valor informado
    private int placar;

    
    //construtor chmado toda vez que a classe e chamada
    public Placar(int placar) {
        this.setPlacar(placar);
    }

//pegar valor que esta armazenado na variavel placar
    public int getPlacar() {
        return placar;
    }
//atribuir valor da variavel placar 
    public void setPlacar(int placar) {
        //lancar excesao caso nao compra as regras 
        if (placar <0 || placar >1001){
          throw new IllegalArgumentException("Valor inválido o valor precisa estar entre 0 a 1000");
        }
        this.placar = placar;
    }
    
}
