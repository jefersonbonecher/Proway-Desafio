package Jogo;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 Autor: Jeferson Bonecher
 */
public class JogoTest {
      Jogo jogo = new Jogo();;
    
    public JogoTest() {
    }
    
    @Before
    public void setUp() {
   Placar p= new Placar(10);
   Placar p1= new Placar(14);
   Placar p2= new Placar(45);
   Placar p3= new Placar(8);
   Placar p4= new Placar(2);
    
   
   jogo.addPlacar(p);
   jogo.addPlacar(p1);
   jogo.addPlacar(p2);
   jogo.addPlacar(p3);
   jogo.addPlacar(p4);

    }
    @Test
    public void testTemporadaMinima() {
        assertEquals(2, jogo.temporadaMinima());
    
    }

    @Test
    public void testTemporadaMaxima() {
        assertEquals(45, jogo.temporadaMaxima());
   
    }

    @Test
    public void testQuebraRecordeMin() {
        assertEquals(2, jogo.quebraRecordeMin());
    }

    @Test
    public void testQuebraRecordeMax() {
      assertEquals(2, jogo.quebraRecordeMax());
    }
    
}
