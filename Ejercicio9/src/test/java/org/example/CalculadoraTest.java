package org.example;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    static Calculadora c;

    @BeforeAll
    static void crear_objeto(){
         c = new Calculadora();
    }

    @Test
    void sumar() {
    }

    @Test
    void restar() {
    }

    @Test
    void multiplicar() {
        assertAll(() -> assertEquals(240, c.multiplicar(80, 3)),
                () -> assertNotEquals(605, c.multiplicar(c.restar(90, 50), 15)),
                () -> assertNotEquals(2700, c.multiplicar(c.sumar(70, 40), 25)));
    }

    @Test
    void dividir() {
        assertEquals(110, c.dividir(c.sumar(150, 180), 3));
    }
}