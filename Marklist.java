package marklist.java;

import java.util.Scanner;

public class Marklist {

	public static void main(String[] args) {
		
		Scanner name=new Scanner(System.in);
		Scanner marks=new Scanner(System.in);
		String[] nme=new String[4];
		int[][] score= new int[4][3];
		int []total=new int[4];
		
		
		float[] average = new float[4];
		String result="";
	
		String grade="";
		System.out.print("Please enter the students names:");
		for (int i=0;i<4;i++) {
			nme[i]= name.nextLine();
		}
		for(int i=0;i<4;i++) {
		System.out.print("Enter their marks"+i);
		for (int j=0;j<3;j++) {
			score[i][j]=marks.nextInt();
			total[i]+=score[i] [j];
		}
			average[i]=total[i]/3;
		
		}
		
		for(int k=0;k<4;k++){
		if (average [k]<= 100 && average[k] >= 70 ) {
			grade = "A";
		}else if(average [k]< 70 && average [k]>= 60 ) {
			grade ="B";
		}else if(average[k] < 60 && average[k] >= 50 ) {
			grade ="C";
		}else if(average[k] < 50 && average [k]>= 40 ) {
			grade = "D";
		}else if(average[k] < 40 ) {
			grade = "F";
		}else {
			System.out.println("Marks entered do not exist!!");
		}
		}
		for(int l=0;l<4;l++)
		if (average [l]<= 100 && average[l] >= 70 ) {
			result = "P";
		}else if(average [l]< 70 && average[l] >= 60 ) {
			result ="P";
		}else if(average[l] < 60 && average[l] >= 50 ) {
			result ="P";
		}else if(average [l]< 50 && average[l] >= 40 ) {
			result = "P";
		}else if(average [l]< 40 ) {
			result = "F";
		}else {
			System.out.println("Marks entered do not exist!!");
		}
		System.out.println("****************************************************************************");
		System.out.println("\t\t\t\tSTUDENT MARKLIST");
		System.out.println("****************************************************************************");
		System.out.println("ROLL\tNAME\tMARK1\tMark2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");
		System.out.println("101\t"+nme[0]+"\t"+score[0][0]+"\t"+score[0][1]+"\t"+score[0][2]+"\t"+total[0]+"\t"+result+"\t"+average[0]+"\t"+grade);
		System.out.println("102\t"+nme[1]+"\t"+score[1][0]+"\t"+score[1][1]+"\t"+score[1][2]+"\t"+total[1]+"\t"+result+"\t"+average[1]+"\t"+grade);
		System.out.println("103\t"+nme[2]+"\t"+score[2][0]+"\t"+score[2][1]+"\t"+score[2][2]+"\t"+total[2]+"\t"+result+"\t"+ average[2]+"\t"+grade);
		System.out.println("104\t"+nme[3]+"\t"+score[3][0]+"\t"+score[3][1]+"\t"+score[3][2]+"\t"+total[3]+"\t"+result+"\t"+ average[3]+"\t"+grade);
		
		}
		
		
		// TODO Auto-generated method stub

	}

