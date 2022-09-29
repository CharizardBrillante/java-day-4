
public enum Livello {
	OPERAIO(1),
	IMPIEGATO(1.2),
	QUADRO(1.5),
	DIRIGENTE(2.0);

	private double coefficienteStipendio;
	public double getCoefficienteStipendio() {
		return coefficienteStipendio;
	}
	private Livello(double coefficiente) {
		this.coefficienteStipendio = coefficiente;
	}
}