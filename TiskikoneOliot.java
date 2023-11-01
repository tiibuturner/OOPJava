package konehet;

import java.util.Scanner;
import koneet.Tiskikone;

public class TiskikoneOliot {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiskikone tk=lueTiskikone();
		Tiskikone tk1=lueTiskikone();
		tulosta(tk);
		tulosta(tk1);
		
		//Tehtävä 1
		//kone.setId(1);
		//kone.setMerkki("UPO");
		//kone.setMalli("D621DW");
		//kone.setPesuohjelma("Tehopesu");
		//tulosta(kone);
		
		//Tiskikone kone2= new Tiskikone();
		//kone2.setId(2);
		//kone2.setMerkki("Bosch");
		//kone2.setMalli("SMU4HVW72S");
		//kone2.setPesuohjelma("ECO-pesu");
		//tulosta(kone2);
		
	}
	private static void tulosta(Tiskikone tk) {
		// TODO Auto-generated method stub
		
	}
	// Tehtävä 1
	//private static void tulosta(Tiskikone kone) {
		// TODO Auto-generated method stub
		//System.out.println("\nID: " + kone.getId());
		//System.out.println("Merkki: " + kone.getMerkki());
		//System.out.println("Malli: " + kone.getMalli());
		//System.out.println("Pesuohjelma: " + kone.getPesuohjelma());
	
	private static Tiskikone lueTiskikone()
	{
		Tiskikone x= new Tiskikone();
		System.out.println("Mikä on tiskikoneen ID- numero?");
		String s=sc.nextLine();
		int i=Integer.parseInt(s);
		x.setId(i);
		
		System.out.println("Mikä on tiskikoneen merkki?");
		s=sc.nextLine();
		x.setMerkki(s);
		
		System.out.println("Mikä on tiskikoneen malli?");
		s=sc.nextLine();
		x.setMalli(s);
		
		System.out.println("Mikä on tiskikoneen pesuohjelma?");
		s=sc.nextLine();
		x.setPesuohjelma(s);
		
		Tiskikone kone2= new Tiskikone();
		System.out.println("Mikä on tiskikoneen ID- numero?");
		s=sc.nextLine();
		int i1=Integer.parseInt(s);
		kone2.setId(i1);
		
		System.out.println("Mikä on tiskikoneen merkki?");
		s=sc.nextLine();
		kone2.setMerkki(s);
		
		System.out.println("Mikä on tiskikoneen malli?");
		s=sc.nextLine();
		kone2.setMalli(s);
		
		System.out.println("Mikä on tiskikoneen pesuohjelma?");
		s=sc.nextLine();
		kone2.setPesuohjelma(s);
		return x;
	}
	}



