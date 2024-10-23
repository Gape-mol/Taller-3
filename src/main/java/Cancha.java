import java.util.Date;
import java.util.ArrayList;

public class Cancha {
	private String superficie;
	private String ubicacion;
	private Partido partido;
	private ArrayList<Date> horariosReservados;

	public Cancha(String superficie, String ubicacion) {
		this.superficie = superficie;
		this.ubicacion = ubicacion;
		this.horariosReservados = new ArrayList<Date>();
	}

	//Esto en teoria hace que se pueda arrender una cancha a las 16:00 y la misma a las 16:01
	public boolean consultarCancha(Date horaReserva) {
        return !horariosReservados.contains(horaReserva);
	}

	public void reservarCancha(Date horaReserva) {
		if(horariosReservados.contains(horaReserva)) {
			System.out.println("La cancha ya se encuentra reservada para esa hora");
		} else {
			this.horariosReservados.add(horaReserva);
		}
	}

	//Registrar el equipo que se encuentra usando la cancha
	public void registrarUso(Partido partido) {
		this.partido = partido;
	}

	public Partido getPartido() {
		return this.partido;
	}

}