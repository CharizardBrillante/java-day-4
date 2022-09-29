
public class Dipendente {
	
	private static double stipendioBase = 1000;
	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	//----------------------------------- CONSTRUCTORS -------------------------------
	public Dipendente(int matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = Dipendente.stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;		
	}
	
	public Dipendente(int matricola, double iOS, Livello livello, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.importoOrarioStraordinario = iOS;
		this.livello = livello;
		this.dipartimento = dipartimento;
		this.stipendio = Dipendente.stipendioBase * this.livello.getCoefficienteStipendio();
	}
	
	//------------------------------------ GETTER ------------------------------------
	public double getStipendioBase() {
		return stipendioBase;
	}
	public int getMatricola() {
		return matricola;
	}
	public double getStipendio() {
		return stipendio;
	}
	public double getIOS() {
		return importoOrarioStraordinario;
	}
	public Livello getLivello() {
		return livello;
	}
	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	
	//----------------------------------- SETTER --------------------------------------
	public void setIOS(double newIOS) {
		importoOrarioStraordinario = newIOS;
	}
	public void setDipartimento(Dipartimento newDepartment) {
		dipartimento = newDepartment;
	}
	
	//----------------------------------- METHODS ------------------------------------
	public void stampaDipendenti() {
		System.out.println(
				"Matricola: " + this.matricola + "\n" +
				"Stipendio: " + this.stipendio + "\n" + 
				"Importo Orario Straordinario: " + this.importoOrarioStraordinario + "\n" + 
				"Livello: " + this.livello + "\n" + 
				"Dipartimento: " + this.dipartimento);
	}
	
	public Livello promuovi() {
		switch(this.livello) {
			case OPERAIO:
				this.livello = Livello.IMPIEGATO;
				this.stipendio = stipendioBase * this.livello.getCoefficienteStipendio();
				return this.livello;
			case IMPIEGATO:
				this.livello = Livello.QUADRO;
				this.stipendio = stipendioBase * this.livello.getCoefficienteStipendio();
				return this.livello;
			case QUADRO:
				this.livello = Livello.DIRIGENTE;
				this.stipendio = stipendioBase * this.livello.getCoefficienteStipendio();
				return this.livello;
			case DIRIGENTE:
				System.out.println("Non puoi promuovere un dirigente, pirla!");
				return this.livello;
			default:
				return this.livello;
		}
	}
	
	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.stipendio;
	}
	
	public static double calcolaPaga(Dipendente dipendente, int straordinari) {
		return dipendente.stipendio + dipendente.importoOrarioStraordinario * straordinari;
	}
	
}
