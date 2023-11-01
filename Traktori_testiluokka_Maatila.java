package app;
import java.util.Scanner;
import data.Traktori;
public class Maatila{
	

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Traktori [] taulu =new Traktori[3];
		for (int i=0;i<taulu.length;i++)
		{taulu[i]=new Traktori();
		lueTiedot(taulu[i]);
		}
		for(Traktori t:taulu) {
			tulosta(t);
		}
		}
	
	
	private static void tulosta(Traktori t) {
		// TODO Auto-generated method stub
	}
	private static void lueTiedot(Traktori traktori) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Traktorin ID- numero?");
			String s=sc.nextLine();
			int i=Integer.parseInt(s);
			boolean ok=traktori.setId(i);
			if (ok==true) {
				break;
			} else {
				System.out.println("Kokonaisluku, kiitos!");
			 }
			}
			while (true) {
			System.out.println("Traktorin merkki?");
			String s=sc.nextLine();
			boolean ok=traktori.setMerkki(s);
			if (ok==true) {
				break;
			} else {
				System.out.println("Vähintään viisi merkkiä, kiitos!");
			 }
			}
			while (true) {
			System.out.println("Traktorin malli?");
			String s=sc.nextLine();
			boolean ok=traktori.setMalli(s);
			if (ok==true) {
				break;
			} else {
				System.out.println("Vähintään viisi merkkiä, kiitos!");
			 }
			}
			while (true) {
				System.out.println("Traktorin tehot?");
				String s=sc.nextLine();
				boolean ok=traktori.setTeho(s);
				if (ok==true) {
					break;
				} else {
					System.out.println("Yli 30 tai alle 250, kiitos!");
				 }
				}
	}
}

