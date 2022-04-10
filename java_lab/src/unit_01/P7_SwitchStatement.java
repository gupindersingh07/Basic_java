package Unit_01;


	/* Problem Statement: P7_SwitchStatements: 
	   Create a switch statement [Manual], In Which:
		 a. When you pass 1 your program would print current year
		 b. When you pass 2 your program would print current month
		 c. When you pass 3 your program would print current day
		 d. When you pass 4 your program would print Not applicable 
	 * */
	import java.util.Scanner;

	public class P7_SwitchStatement {

		public static void main(String[] args) {
			
			SwitchStatements obj = new SwitchStatements();
			obj.switchStatements();

		}

	}

	class SwitchStatements {
		void switchStatements() {
		
		  Scanner s = new Scanner(System.in);
		  int ch = s.nextInt();

		  switch(ch)
		  {
			 case 1:
			 System.out.print("2022");
			 break;
			 
			 case 2:
			 System.out.print("APRIL");
			 break;

			 case 3:
			 System.out.print("ThursDay");
			 break;

			 default:
			 System.out.print("Not Applicable");
			 break;

		  }


			
		}
	}

