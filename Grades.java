package grades.java;
import java.util.Scanner;

public class Grades {

	
	public static void main(String[] args) {
		String name = "Anthony Nguthiru";
		String rollNo = "C026-01-0900/2022";
		int semester = 1;
		Scanner uniCode = new Scanner(System.in);
			Scanner score= new Scanner(System.in);
			String[] uCode = new String[4];
			int[] uScore = new int[4];
			int total = 0;
			float average;
			String grade = "";
			System.out.print("Enter unit code:");
			
			for (int i= 0; i<4 ; i++) {
			uCode[i] = uniCode.nextLine();
			}
			System.out.print("Enter score:");
			for (int i= 0; i<4 ; i++) {
				uScore[i] = score.nextInt();
				total +=uScore[i];
				}
			average = (float) ((double)total/4);
			
			if (average <= 100 && average >= 70 ) {
				grade = "A";
			}else if(average < 70 && average >= 60 ) {
				grade ="B";
			}else if(average < 60 && average >= 50 ) {
				grade ="C";
			}else if(average < 50 && average >= 40 ) {
				grade = "D";
			}else if(average < 40 ) {
				grade = "F";
			}else {
				System.out.println("Marks entered do not exist!!");
			}
			System.out.println("\t\t\tDepertment of Computer Science");
			System.out.println("\t\t\tEnd of semester results ");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("|Name:- " + name +"\t|Roll_No: "+ rollNo +"\tSemester: " + semester);
			System.out.println("___________________________________________________________________");
			System.out.println("|Unit Code \t\t|Unit Name: \t\t\tScore: ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("|" + uCode[0] + "\t\t|Database \t\t\t|"+uScore[0]);
			System.out.println("\n");
			System.out.println("|" + uCode[1] + "\t\t|Systems  \t\t\t|" + uScore[1]);
			System.out.println("\n");
			System.out.println("|" + uCode[2] + " \t\t|Algorithim\t\t\t|" +uScore[2]);
			System.out.println("\n");
			System.out.println("|" + uCode[3] + "\t\t|Statistics \t\t\t|"+ uScore[3]);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("|Total \t\t\t\t\t\t\t|" + total);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("|Average \t\t\t\t\t\t|" + String.format("%.2f", average));
			System.out.println("--------------------------------------------------------------------");
			System.out.println("|Grade \t\t\t\t\t\t\t" + grade);
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t  Recommendation|");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Grading Criteria \t\tOverall Grade(A-D) \tRecommend Pass");
		System.out.println("70-100\t\t A");
		System.out.println("60-70\t\t B");
		System.out.println("50-60\t\t C");
		System.out.println("40-50\t\t D");
		System.out.println("Below 40\t F");
		System.out.println("--------------------------------------------------------------------");
		

	}

}

		// TODO Auto-generated method stub

	


