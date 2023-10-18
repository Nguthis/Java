package book;
import java.util.Scanner;


public class BookInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object now
	Book b=new Book();
		Scanner tit=new Scanner(System.in);
		Scanner aut=new Scanner(System.in);
		Scanner pages=new Scanner(System.in);
		
		System.out.println("Please enter the title of the book:");
		b.title=tit.nextLine();
		
		System.out.println("Please enter the authors name:");
		
		b.author=aut.nextLine();
		System.out.println("Please enter the number of pages:");
		b.numberOfPages=pages.nextInt();
		System.out.println("The book title is:"+b.title);
		System.out.println("The book author is:"+ b.author);
		System.out.println("The book has"+b.numberOfPages+"pages");
		
      

	}

}
