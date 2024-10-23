import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Deportista> integrantes;
	private ArrayList<Partido> partidos;
	private Deporte deporte;
	private Entrenador entrenador;

	public Equipo(String nombre, Deporte deporte) {
		this.nombre = nombre;
		this.deporte = deporte;
		this.integrantes = new ArrayList<Deportista>();
		this.partidos = new ArrayList<Partido>();
	}

	public void agregarDeportista(Deportista deportista) {
		if (this.integrantes.contains(deportista)) {
			System.out.println("El deportista ya se encuentra registrado en el equipo");
		} else {
			this.integrantes.add(deportista);
		}
	}

	public void agregarEntrenador(Entrenador entrenador) {
		if (this.entrenador != null) {
			System.out.println("El equipo ya tiene un entrenador asignado");
		} else {
			this.entrenador = entrenador;
		}
	}

	public void agregarPartido(Partido partido) {
		if (this.partidos.contains(partido)) {
			System.out.println("El partido ya se encuentra registrado en el equipo");
		} else {
			this.partidos.add(partido);
		}
	}

	public void verPartidos() {
		for (Partido partido : this.partidos) {
			System.out.println(partido);
		}
	}
	public Deporte getDeporte() {
		return this.deporte;
	}

}