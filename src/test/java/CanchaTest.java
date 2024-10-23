import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CanchaTest {

    @Test
    void consultarCancha() {
        Cancha cancha = new Cancha("Cesped", "RA-1001");
        Date horaReserva = new Date();
        // La cancha deberia estar disponible
        assertTrue(cancha.consultarCancha(horaReserva));
    }

    @Test
    void reservarCancha() {
        Cancha cancha = new Cancha("Cesped", "RA-1001");
        Date horaReserva = new Date();
        cancha.reservarCancha(horaReserva);
        // La cancha deberia estar ocupada
        assertFalse(cancha.consultarCancha(horaReserva));
    }

    @Test
    void registrarUso() {
        Cancha cancha = new Cancha("Cesped", "RA-1001");
        Deporte deporte = new Deporte("Futbol");
        Equipo equipoLocal = new Equipo("Equipo Local", deporte);
        Equipo equipoVisitante = new Equipo("Equipo Visitante", deporte);
        Partido partido = new Partido(equipoLocal, equipoVisitante, 0, 0, cancha);
        cancha.registrarUso(partido);
        // La cancha deberia estar en uso por el partido
        assertEquals(partido, cancha.getPartido());
    }

}