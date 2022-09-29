
public class GestioneDipendenti {
	
	public static void main(String[] args) {
		//Istanzio 4 dipendenti
		Dipendente dip1 = new Dipendente(1, Dipartimento.PRODUZIONE);
		Dipendente dip2 = new Dipendente(2, Dipartimento.PRODUZIONE);
		Dipendente dip3 = new Dipendente(3, 35, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente dip4 = new Dipendente(4, 40, Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		//promuovo un operaio e un impiegato		
		dip1.promuovi();
		dip3.promuovi();
		
		//stampo lo stato di tutti i dipendenti
		System.out.println("-------------- DIPENDENTE 1 ----------------");
		dip1.stampaDipendenti();
		System.out.println("-------------- DIPENDENTE 2 ----------------");
		dip2.stampaDipendenti();
		System.out.println("-------------- DIPENDENTE 3 ----------------");
		dip3.stampaDipendenti();
		System.out.println("-------------- DIPENDENTE 4 ----------------");
		dip4.stampaDipendenti();
		
		//calcolo la somma di tutti gli stipendi comprendendo per ciascuno 5 ore di straordinario
		double totStipendi = Dipendente.calcolaPaga(dip1, 5) + 
				Dipendente.calcolaPaga(dip2, 5) + 
				Dipendente.calcolaPaga(dip3, 5) + 
				Dipendente.calcolaPaga(dip4, 5);
		System.out.println("---------------- TOTALE STIPENDI ---------------");
		System.out.println("Il totale degli stipendi ammonta a: " +
				totStipendi + "€");
			
	
		}
}
