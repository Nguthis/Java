package net.javacode;

public class Invoice {

	public static void main(String[] args) {
		String soldTo = "C026-01-0952/2022";
		String date = "28/04/2020";
		String address = "Raphael Kaira";
		String contactNumber = "0100100100";
		String[] itemDescription= {"Pencil","Duster", "Pens", "Crayon"};
		int[] quantity= {4,10,9,10};
		int[] unitPrice= {20, 50, 30, 80};
		double[] amount= {80.00,500.00, 270.00, 800.00 };
		float subTotal = 1650.00f;
		float vat = 264.00f;
		float total = 1914.00f;
		
		System.out.println("**********************Admson Computers Ltd****************************");
		System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
		System.out.println("\t\t\t VAT REG. TIN 098-765-4321-0000 ");
		System.out.println("\t\t\t\t SALES INVOICE");
		
		System.out.println("Sold to:" + soldTo +"\t\t\t Date:" + date);
		System.out.println("Address:" + address +"\t\t\t\t Contact Number:" + contactNumber);
		
		System.out.println("========================================================================");
		System.out.println("Qty\t|\t Item Description\t|\t Unit Price\t| Amount");
		System.out.println("========================================================================");
		System.out.println( quantity[0]+"\t|\t\t"+itemDescription[0]+"\t\t|\t" + unitPrice[0]+"\t\t|"+ amount[0]);
		System.out.println("------------------------------------------------------------------------");
		System.out.println( quantity[1]+"\t|\t\t"+itemDescription[1]+"\t\t|\t" + unitPrice[1]+"\t\t|"+ amount[1]);
		System.out.println("------------------------------------------------------------------------");
		System.out.println( quantity[2]+"\t|\t\t"+itemDescription[2]+"\t\t|\t" + unitPrice[2]+"\t\t|"+ amount[2]);
		System.out.println("------------------------------------------------------------------------");
		System.out.println( quantity[3]+"\t|\t\t"+itemDescription[3]+"\t\t|\t" + unitPrice[3]+"\t\t|"+ amount[3]);
		System.out.println("========================================================================");
		System.out.println( "\t\t\t\t\t\t|Sub Total\t|"+ subTotal);
		System.out.println("\t\t\t\t\t\t========================");
		System.out.println( "\t\t\t\t\t\t|VAT(16%)\t|"+ vat);
		System.out.println("\t\t\t\t\t\t========================");
		System.out.println( "\t\t\t\t\t\t|Total Amount\t|"+ total);
		System.out.println("\t\t\t\t\t\t========================");

		
	
	}

}
