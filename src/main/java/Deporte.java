import java.util.ArrayList;

public class Deporte {
	private String nombre;
	private ArrayList<Equipo> equipos;

	public Deporte(String nombre) {
		this.nombre = nombre;
		this.equipos = new ArrayList<Equipo>();
	}

	public void agregarEquipo(Equipo equipo) {
		if (this.equipos.contains(equipo)) {
			System.out.println("El equipo ya se encuentra registrado en el deporte");
		} else {
			this.equipos.add(equipo);
		}
	}

	public void getEquipos() {
		for (Equipo equipo : this.equipos) {
			System.out.println(equipo);
		}
	}
}