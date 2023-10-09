package okoa.java;
import java.util.Scanner;

public class Okoajahazi {

	public static void main(String[] args) { 
		
		Scanner in = new Scanner(System.in);
		int again=0;
		do {
		System.out.println("1:Sh20 (30mins,3hrs)");
		System.out.println("2:Okoa Easy Sh50 (50Mins,midnight)");
		System.out.println("3:Okoa 100");
		System.out.println("4:Okoa 50");
		System.out.println("5:Okoa 20 (or KSh 50,Midnight)");
		System.out.println("6:Okoa 10");
		System.out.println("7:Okoa 5");
		System.out.println("8:Okoa Internet");
		System.out.println("0:More");
		int choice;
		choice=in.nextInt();
		
		
		switch(choice) {
		
		case 1:
			System.out.println("Existing Unpaid OKoa:0\nNew okoa request:20\nTOTAL DEBT will be:20\n1:Accept\n2:Cancel\n0:Back\n00:HOME");
		break;
		case 2:
			System.out.println("Existing Unpaid OKoa:0\nNew okoa request:50\nOTAL DEBT will be:50\n1:Accept\n2:Cancel\n0:Back\n00:HOME");
		break;
		case 3:
			System.out.println("Existing Unpaid OKoa:0\nNew okoa request:100\nOTAL DEBT will be:100\n1:Accept\n2:Cancel\n0:Back\n00:HOME");
			break;
		case 4:
			System.out.println("Existing Unpaid OKoa:0\nNew okoa request:50\nOTAL DEBT will be:50\n1:Accept\n2:Cancel\n0:Back\n00:HOME");
			break;
		case 5:
			System.out.println("Existing Unpaid OKoa:0\nNew okoa request:20\nOTAL DEBT will be:20\n1:Accept\n2:Cancel\n0:Back\n00:HOME");
			break;
		case 6:
			System.out.println("Existing Unpaid OKoa:0\nNew okoa request:10\nOTAL DEBT will be:10\n1:Accept\n2:Cancel\n0:Back\n00:HOME");
			break;
		case 7:	
			System.out.println("Existing Unpaid OKoa:0\nNew okoa request:5\nTOTAL DEBT will be:5\n1:Accept\n2:Cancel\n0:Back\n00:HOME");
			break;
		case 8:
			
				System.out.println("Okoa bundles\n1:Sh20(900MB,1hr)");
				System.out.println("2:Sh50(1400MB,3hrs");
				System.out.println("3:Sh99(675MB,24hrs)");
				System.out.println("4:Sh50(270MB,24hrs)");
				System.out.println("5:Sh20(90MB,24hrs");
				System.out.println("6:Sh10(30MB,,24hrs");
				System.out.println("98:More\n 0:BACK");
				break;
		case 0:
			
			System.out.println("8:Okoa Minutes");
			System.out.println("9:Okoa SMS");
			System.out.println("10:Lipa Okoa");
			System.out.println("#:Check Balance");
			System.out.println("0:BACK");
			break;
			
			
		
				default:
					System.out.println("Invalid choice!");
					
		}
		int option;
		option=in.nextInt();
		switch (option) {
		case 9:
			System.out.println("okoa wewe!");	
			break;
	
			
		case 0:
			again++;
			break;
			default :
				System.out.println("Invalid choice!");
				
				
			}}
		while(again<=1);
			
		}
		
	}


