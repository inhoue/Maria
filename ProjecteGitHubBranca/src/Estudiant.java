//subclase de perosna que conté les dades del estudiants amb els seus getters i setters.
public class Estudiant extends Persona {
	private String curs;
	private String matricula;

	/**
	 * Constructor d'estudiant
	 */
	public Estudiant() {
		super();
	}

	/**
	 * Metode que retorna el curs
	 */
	public String getCurs() {
		return curs;
	}

	/**
	 * Metode que retorna la matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Metode per introduir el curs
	 */
	public void setCurs(String curs) {
		this.curs = curs;
	}

	/**
	 * Metode per introduir la matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// mètode per imprimir les dades de estudiant.
	public String toString() {
		return "Nom: " + this.getNom() + "\n" + "Llinatges: "
				+ this.getLlinatges() + "\n" + "Edat: " + this.getEdat() + "\n"
				+ "Telèfon: " + this.getTelefon() + "\n" + "Crus: " + this.curs
				+ "\n" + "Matrícula: " + this.matricula + "\n"
				+ "--------------------------------------- \n";
	}
}
