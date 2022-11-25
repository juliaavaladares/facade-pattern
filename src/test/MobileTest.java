package test;

import org.junit.jupiter.api.Test;

import main.Mobile;

import static org.junit.jupiter.api.Assertions.*;


public class MobileTest {

    @Test
    void deveRetornarMobileComMelhorPreco() {
        Mobile mobile = new Mobile();

        float melhorPrecoMobile = mobile.melhorPreco();
        
        assertEquals(1500, melhorPrecoMobile);
    }
    
}
