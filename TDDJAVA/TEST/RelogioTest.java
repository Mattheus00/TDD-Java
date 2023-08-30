package TDDJAVA.TEST;

import TDDJAVA.Relogio;
import org.testng.annotations.Before;
import org.testng.annotations.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelogioTest {
    private RelogioTest relogio;

    @BeforeAll
    public void setUp() {
        relogio = new RelogioTest();
    }

    @Test
    public void testAlterarHorario() {
        relogio.alterarHorario(12, 30, 45);
        assertEquals(12, relogio.getHoras());
        assertEquals(30, relogio.getMinutos());
        assertEquals(45, relogio.getSegundos());
    }

    @Test
    public void testReiniciarMeiaNoite() {
        relogio.alterarHorario(8, 15, 0);
        relogio.reiniciarMeiaNoite();
        assertEquals(0, relogio.getHoras());
        assertEquals(0, relogio.getMinutos());
        assertEquals(0, relogio.getSegundos());
    }

    @Test
    public void testMarcarIntervalo() {
        relogio.marcarIntervalo(10, 0, 0, 11, 0, 0);
        // Você pode adicionar asserções aqui para verificar o resultado esperado.
    }

    @Test
    public void testImprimirFormatoHorario24h() {
        relogio.alterarHorario(15, 45, 0);
        String formato24h = relogio.imprimirFormatoHorario(true);
        assertEquals("15:45:00", formato24h);
    }

    @Test
    public void testImprimirFormatoHorarioAMPM() {
        relogio.alterarHorario(8, 30, 0);
        String formatoAMPM = relogio.imprimirFormatoHorario(false);
        assertEquals("8:30:00 AM", formatoAMPM);
    }
}

