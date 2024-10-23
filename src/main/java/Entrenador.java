public class Entrenador {
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private int yearsOfExperience;
	private Deporte deporte;
	private Equipo equipo;

	public Entrenador(String nombre, String apellido, String correoElectronico, int yearsOfExperience, Deporte deporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
		this.yearsOfExperience = yearsOfExperience;
		this.deporte = deporte;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public Deporte getDeporte() {
		return this.deporte;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
}