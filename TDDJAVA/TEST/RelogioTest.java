package TDDJAVA.TEST;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RelogioTest {
    private RelogioTest relogio;

    @BeforeEach
    public void setUp() {
        relogio = new RelogioTest();
    }

    @Test
    public void testAlterarHorarioValido() {
        relogio.alterarHorario(10, 30, 45);
        assertEquals("10:30:45", getHorarioFormatado(relogio));
    }

    @Test
    public void testAlterarHorarioInvalido() {
        relogio.alterarHorario(25, 70, 80);
        assertEquals("00:00:00", getHorarioFormatado(relogio));
    }

    @Test
    public void testReiniciarMeiaNoite() {
        relogio.alterarHorario(12, 45, 30);
        relogio.reiniciarMeiaNoite();
        assertEquals("00:00:00", getHorarioFormatado(relogio));
    }

    private void reiniciarMeiaNoite() {
        
    }

    @Test
    public void testMarcarIntervaloValido() {
        relogio.alterarHorario(9, 30, 0);
        relogio.marcarIntervalo(9, 30, 0, 10, 15, 30);
        assertEquals("01:45:30", getHorarioFormatado(relogio));
    }

    @Test
    public void testMarcarIntervaloInvalido() {
        relogio.alterarHorario(8, 45, 15);
        relogio.marcarIntervalo(8, 45, 15, 9, 75, 80);
        assertEquals("08:45:15", getHorarioFormatado(relogio));
    }

    private void marcarIntervalo(int i, int i1, int i2, int i3, int i4, int i5) {

    }

    @Test
    public void testImprimirHorario() {
        relogio.alterarHorario(18, 20, 55);
        assertEquals("18:20:55", getHorarioFormatado(relogio));
    }

    @Test
    public void testImprimirFormatoHorario24h() {
        relogio.alterarHorario(14, 30, 10);
        assertEquals("14:30:10", relogio.imprimirFormatoHorario(true));
    }

    private String imprimirFormatoHorario(boolean b) {
        return null;
    }

    @Test
    public void testImprimirFormatoHorarioAMPM() {
        relogio.alterarHorario(8, 15, 40);
        assertEquals("08:15:40 AM", relogio.imprimirFormatoHorario(false));
    }

    private void alterarHorario(int i, int i1, int i2) {
        
    }

    private String getHorarioFormatado(RelogioTest relogio) {
        return String.format("%02d:%02d:%02d", relogio.getHoras(), relogio.getMinutos(), relogio.getSegundos());
    }

    private Object getHoras() {
        return null;
    }

    private Object getMinutos() {
        return null;
    }

    private Object getSegundos() {
        return null;
    }
}
