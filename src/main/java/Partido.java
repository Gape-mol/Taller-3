public class Partido {
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int puntosLocal;
	private int puntosVisitante;
	private Cancha cancha;

	public Partido(Equipo equipoLocal, Equipo equipoVisitante, int puntosLocal, int puntosVisitante, Cancha cancha) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.puntosLocal = puntosLocal;
		this.puntosVisitante = puntosVisitante;
		this.cancha = cancha;

		equipoLocal.agregarPartido(this);
		equipoVisitante.agregarPartido(this);
	}
}