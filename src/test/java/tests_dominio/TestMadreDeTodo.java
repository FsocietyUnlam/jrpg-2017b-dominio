package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.Personaje;


public class TestMadreDeTodo {

    
    @Test
    public void testSetNombre() {
        Personaje p1 = new Humano("Ben Affleck",new Asesino(),2);
        p1.setNombre("I'm Batman");
        Assert.assertEquals("I'm Batman", p1.getNombre());
    }

}
