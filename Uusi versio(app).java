package app;

import data.WashingMachine;
public class Machines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tehtävä 1
		  WashingMachine kone1 = new WashingMachine();
		  kone1.setId(1);
		  kone1.setMerkki("UPO");
		  kone1.setMalli("D621DW");
		  kone1.setPesuohjelma("Tehopesu");
		  printMachine(kone1);
		  
		  WashingMachine kone2 = new WashingMachine();
		  kone2.setId(2);
		  kone2.setMerkki("SMU4HVW725");
		  kone2.setMalli("Bosch");
		  kone2.setPesuohjelma("ECO-pesu");
		  printMachine(kone2);
	}

	private static void printMachine(WashingMachine kone) {
		// TODO Auto-generated method stub
		System.out.println("\nID: " + kone.getId());
		System.out.println("Merkki: " + kone.getMerkki());
		System.out.println("Malli: " + kone.getMalli());
		System.out.println("Pesuohjelma: " + kone.getPesuohjelma());
	}





}
