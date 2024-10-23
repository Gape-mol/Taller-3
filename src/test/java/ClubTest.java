import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClubTest {
    @Test
    void agregarDeportista() {
        Club club = new Club("Club Deportivo");
        Deporte deporte = new Deporte("Futbol");
        Deportista deportista = new Deportista("Juan", "Perez", "a@a.com", deporte);
        club.registrarDeportista(deportista);
        assertEquals(deportista, club.getDeportista(deportista));
    }

    @Test
    void agregarEntrenador() {
        Club club = new Club("Club Deportivo");
        Deporte deporte = new Deporte("Futbol");
        Equipo equipo = new Equipo("Equipo", deporte);
        Entrenador entrenador = new Entrenador("Juan", "Perez", "b@b.com", 50, deporte);
        club.asignarEntrenador(equipo, entrenador);
        assertEquals(entrenador, club.getEntrenador(entrenador));
    }

    @Test
    void agregarDeportistaRepetido() {
        Club club = new Club("Club Deportivo");
        Deporte deporte = new Deporte("Futbol");
        Deportista deportista = new Deportista("Juan", "Perez", "a@a.com", deporte);
        club.registrarDeportista(deportista);
        club.registrarDeportista(deportista);
        assertEquals(1, club.getDeportistasList().size());
    }

    @Test
    void agregarEntrenadorRepetido() {
        Club club = new Club("Club Deportivo");
        Deporte deporte = new Deporte("Futbol");
        Equipo equipo = new Equipo("Equipo", deporte);
        Entrenador entrenador = new Entrenador("Juan", "Perez", "b@b.com", 50 ,deporte);
        club.asignarEntrenador(equipo, entrenador);
        club.asignarEntrenador(equipo, entrenador);
        assertEquals(1, club.getEntrenadoresList().size());
    }

    @Test
    void agregarEquipo() {
        Club club = new Club("Club Deportivo");
        Deporte deporte = new Deporte("Futbol");
        Equipo equipo = new Equipo("Equipo", deporte);
        club.crearEquipo(equipo);
        assertEquals(equipo, club.getEquipo(equipo));
    }

    @Test
    void agregarEquipoRepetido() {
        Club club = new Club("Club Deportivo");
        Deporte deporte = new Deporte("Futbol");
        Equipo equipo = new Equipo("Equipo", deporte);
        club.crearEquipo(equipo);
        club.crearEquipo(equipo);
        assertEquals(1, club.getEquiposList().size());
    }

    @Test
    void asignarEntrenador() {
        Club club = new Club("Club Deportivo");
        Deporte deporte = new Deporte("Futbol");
        Equipo equipo = new Equipo("Equipo", deporte);
        Entrenador entrenador = new Entrenador("Juan", "Perez", "b@b.com", 50, deporte);
        club.asignarEntrenador(equipo, entrenador);
        assertEquals(entrenador, equipo.getEntrenador());
    }

    @Test
    void asignarJugadores() {
        Club club = new Club("Club Deportivo");
        Deporte deporte = new Deporte("Futbol");
        Deportista deportista = new Deportista("Juan", "Perez", "a@a.com", deporte);
        Equipo equipo = new Equipo("Equipo", deporte);
        club.registrarDeportista(deportista);
        club.asignarDeportista(equipo, deportista);
        assertEquals(deportista, equipo.getIntegrantes(deportista));
    }
}