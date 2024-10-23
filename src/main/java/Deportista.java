import java.util.ArrayList;

public class Deportista {
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private Deporte deporte;
	private Equipo equipo;

	public Deportista(String nombre, String apellido, String correoElectronico, Deporte deporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
		this.deporte = deporte;
		this.equipo = null;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	//Getters
	public Equipo getEquipo() {
		return this.equipo;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public Deporte getDeporte() {
		return this.deporte;
	}
}