// Worood Fathi Assi
// # 1210412
// sec-6 
// lab-11

import java.util.*;
public class CheackEquation {

	public static void main(String[] args) {

		
		Scanner input=new Scanner(System.in);   // read user name and id
		int IdNumber=1;
//		String Name="worood" ;
		while(true) {
		System.out.println("Please enter your name : ");
		 String Name = input.next();
		System.out.println("Please enter your ID number : ");
		IdNumber=input.nextInt();
		if(IdNumber == -1)                           // first part:-
			return  ;
	    while(Equation.isBalanced(IdNumber) == 0) {    // check if IdNumber valid or not
			System.out.println("Invalid Id Number ");
			System.out.println("Please enter your ID number -Balanced and without repeated- : ");
			IdNumber=input.nextInt();
			if(IdNumber == -1)
				break;
		   }
	    if(IdNumber == -1)
			break;
	  
		int select=1;                            // second part:-
		while(select != -1) {
			Equation.displaymenu();             // display the menu and ask user what she/he wants to do 
			select=input.nextInt();
			
		switch(select) {
		case 1 :
			System.out.println(Equation.solveEquation());      
			break;
		case 2:
			System.out.println("enter the value of a,b,c to find equation roots:");  
			int a=input.nextInt();          
			int b=input.nextInt();
			int c=input.nextInt();
			Equation.findEquationRoots(a,b,c);
//			System.out.println(Equation.findEquationRoots());
			break;
		case 3 :
			Equation.combinEquations();
//			System.out.println(Equation.combinEquations());
			break;
		}
		if(select==4)
			break;
		}
		}
		

	}

}
