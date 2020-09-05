package now;
import java.util.Scanner;
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter percentage marks");
     double percentage = scan.nextDouble();
     if(percentage>=90) {
    	 System.out.println("A");
     }
     else if(percentage<90 && percentage >=80) {
    	 System.out.println("B");
     }
     else if(percentage<70 && percentage >=80) {
    	 System.out.println("C");
     }
	}

}
