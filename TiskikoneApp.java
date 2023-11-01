package app;
import java.util.Scanner;
import data.WashingMachine;

public class ReadingMachines {
	

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WashingMachine WM=lueTiskikone();
		print (WM);
	}
	private static void print(WashingMachine wM) {
		// TODO Auto-generated method stub
		
	}
	private static WashingMachine lueTiskikone() {
		// TODO Auto-generated method stub
		WashingMachine kone1= new WashingMachine();
		System.out.println("Mikä on tiskikoneen ID- numero?");
		String s=sc.nextLine();
		int i=Integer.parseInt(s);
		kone1.setId(i);
		
		System.out.println("Mikä on tiskikoneen merkki?");
		s=sc.nextLine();
		kone1.setMerkki(s);
		
		System.out.println("Mikä on tiskikoneen malli?");
		s=sc.nextLine();
		kone1.setMalli(s);
		
		System.out.println("Mikä on tiskikoneen pesuohjelma?");
		s=sc.nextLine();
		kone1.setPesuohjelma(s);
		
		WashingMachine kone2= new WashingMachine();
		System.out.println("Mikä on tiskikoneen ID- numero?");
		s=sc.nextLine();
		int i2=Integer.parseInt(s);
		kone2.setId(i2);
		
		System.out.println("Mikä on tiskikoneen merkki?");
		s=sc.nextLine();
		kone2.setMerkki(s);
		
		System.out.println("Mikä on tiskikoneen malli?");
		s=sc.nextLine();
		kone2.setMalli(s);
		
		System.out.println("Mikä on tiskikoneen pesuohjelma?");
		s=sc.nextLine();
		kone2.setPesuohjelma(s);
		return kone1;
		
	}

}
