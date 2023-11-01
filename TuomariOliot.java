package TuomariOliot;

import Tuomari.Tuomari;

public class TuomariOliot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Setterit.
		
		Tuomari judge1= new Tuomari(0, null, null);
		judge1.setId(1);
		judge1.setNimi("Nils Holgersson");
		judge1.setMaa("Ruotsi");
		tulosta (judge1);
		
	//Annetaan arvot.	
		Tuomari judge2=new Tuomari (2, "Maija Mehiläinen", "Suomi");
		print (judge2);
	}


	private static void print(Tuomari judge2) {
		// TODO Auto-generated method stub
		System.out.println(judge2);
	}


	private static void tulosta(Tuomari judge1) {
		// TODO Auto-generated method stub
		System.out.println("\nID: " + judge1.getId());
		System.out.println("Nimi: " + judge1.getNimi());
		System.out.println("Maa: " + judge1.getMaa());
	}
}
