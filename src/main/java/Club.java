import java.util.ArrayList;

public class Club {
	private String nombre;
	private ArrayList<Deportista> deportistas;
	private ArrayList<Entrenador> entrenadores;
	private ArrayList<Equipo> equipos;

	public Club(String nombre) {
		this.nombre = nombre;
	}

	public void registrarDeportista(Deportista deportista) {
		if (deportistas.contains(deportista)){
			System.out.println("El deportista ya se encuentra registrado en el club");
		} else {
			deportistas.add(deportista);
		}
	}

	public void registrarEntrenador(String Nombre, String Apellido, String CorreoElectronico, int yearsOfExperience , Deporte deporte, Equipo equipo) {
		Entrenador entrenador = new Entrenador(Nombre, Apellido, CorreoElectronico, yearsOfExperience ,deporte);
		if (entrenadores.contains(entrenador)){
			System.out.println("El entrenador ya se encuentra registrado en el club");
		} else {
			entrenadores.add(entrenador);
		}
	}

	public void crearEquipo(String nombre, Deporte deporte) {
		Equipo equipo = new Equipo(nombre, deporte);
		if (equipos.contains(equipo)){
			System.out.println("El equipo ya se encuentra registrado en el club");
		} else {
			equipos.add(equipo);
		}
	}

	public void asignarDeportista(Equipo equipo, Deportista deportista) {
		//Revisar si el deportista esta en el equipo, para evitar duplicados
		if (deportista.getEquipo().equals(equipo)){
			System.out.println("El deportista ya se encuentra registrado en el equipo");
		} else {
			//Caso contrario, revisar si el deporte coincide entre el equipo y el jugador
			if (deportista.getDeporte().equals(equipo.getDeporte())){
				//Si el deporte coincide, revisar si ya esta en un equipo
				if (deportista.getEquipo() != null){
					System.out.println("El deportista ya se encuentra registrado en otro equipo");
				} else {
					deportista.setEquipo(equipo);
				}
			} else {
				System.out.println("El deportista no practica el deporte del equipo");
			}
		}
	}

	public void asignarEntrenador(Equipo equipo, Entrenador entrenador) {
		if (entrenador.getEquipo().equals(equipo)){
			System.out.println("El entrenador ya se encuentra asignado en el equipo");
		} else {
			if (entrenador.getDeporte().equals(equipo.getDeporte())){
				if (entrenador.getEquipo() != null){
					System.out.println("El entrenador ya se encuentra asignado en otro equipo");
				} else {
					entrenador.setEquipo(equipo);
				}
			} else {
				System.out.println("El entrenador no se especializa en el deporte del equipo");
			}
		}
	}

	public void registrarPartido(Equipo equipo, Equipo equipoRival, int puntos, int puntosRival, Cancha cancha) {
		Partido partido = new Partido(equipo, equipoRival, puntos, puntosRival, cancha);
	}

	public void consultarPartidos(Equipo equipo) {
		equipo.verPartidos();
	}

	public Deportista getDeportista(Deportista deportista) {
		for (Deportista deportistas : this.deportistas) {
			if (deportistas.equals(deportista)){
				return deportista;
			}
		}
		return null;
	}

	public void getDeportistas() {
		for (Deportista deportista : this.deportistas) {
			System.out.println(deportista);
		}
	}

	public ArrayList<Deportista> getDeportistasList() {
		return this.deportistas;
	}

	public Entrenador getEntrenador(Entrenador entrenador) {
		for (Entrenador entrenadores : this.entrenadores) {
			if (entrenadores.equals(entrenador)){
				return entrenador;
			}
		}
		return null;
	}
	public ArrayList<Entrenador> getEntrenadoresList() {
		return this.entrenadores;
	}
}
