
package Jogo;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 Autor: Jeferson Bonecher
 */
public class PlacarTest {
    private Placar n;
    
    public PlacarTest() {       
    }  
    
    @Before
    public void setUp() {
        n= new Placar(1000);
    }   

    @Test
    public void testSetPlacar() {
        assertEquals( 1000 , n.getPlacar());      
    }
    
}
