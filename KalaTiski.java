package app;

import java.util.Scanner;
import data.kala;
public class Kalatiski1 {	
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kala [] taulu =new kala[3];
		for (int i=0;i<taulu.length;i++)
		{taulu[i]=new kala();
		lueTiedot(taulu[i]);
		}
		for(kala k:taulu) {
			tulosta(k);
		}
	}

	private static void tulosta(kala k) {
		// TODO Auto-generated method stub
		
	}

	private static void lueTiedot(kala kala) {
		// TODO Auto-generated method stub
		while (true) {
		System.out.println("Kalan ID- numero?");
		String s=sc.nextLine();
		int i=Integer.parseInt(s);
		boolean ok=kala.setId(i);
		if (ok==true) {
			break;
		} else {
			System.out.println("Kokonaisluku, kiitos!");
		 }
		}
		while (true) {
		System.out.println("Kalan laji?");
		String s=sc.nextLine();
		boolean ok=kala.setLaji(s);
		if (ok==true) {
			break;
		} else {
			System.out.println("Vähintään kolme merkkiä, kiitos!");
		 }
		}
		while (true) {
		System.out.println("Kalan pituus?");
		String s=sc.nextLine();
		boolean ok=kala.setPituus(s);
		if (ok==true) {
			break;
		} else {
			System.out.println("Yli nollan (>0) tai alle 10 m, kiitos!");
		 }
		}
		while (true) {
			System.out.println("Kalan paino?");
			String s=sc.nextLine();
			boolean ok=kala.setPaino(s);
			if (ok==true) {
				break;
			} else {
				System.out.println("Yli nollan (>0), kiitos!");
			 }
			}
		
	}
	}
