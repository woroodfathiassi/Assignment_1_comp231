import java.util.*;
public class Equation {
	public static int isBalanced(int idNum) {
		int odd=0 , even=0 ,temp=idNum ,x ,y ,z;
		while(temp != 0) {          // check IdNumber is balanced or not
			x=temp%10;
			if(x%2==0)
				even+=x;
			else
				odd+=x;
			temp/=10;
		}
		temp=idNum;
		x=temp%10;
		while(temp != 0) {         // check IdNumber has digit repeated or not
			temp/=10;
			y=temp%10;
			if(x==y )
				return 0;
			else 
			    x=y;		
		}
		if(odd==even)
        	return 1;
		else
			return 0;
	}
	public static void displaymenu() {        // to display this menu
		System.out.println("Please select an operation(1-4) :");
		System.out.println("1- To solve equation ");
		System.out.println("2- To find equation roots");
		System.out.println("3- To combine two equation ");
		System.out.println("4- Exit menu .");
	}
	public static double solveEquation() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of x to solve equation :");
		int x=input.nextInt();              // this method to solve any equation and return result
		System.out.println("enter the value of a,b,c :");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		double result=((a*Math.pow(x, 2))+(b*x)+c);
		return result;
		
	}
	public static void findEquationRoots(int a,int b,int c ) {		
		double m=((b*b) - (4*a*c)) , i=0,j=0;          // this method to take equation values and find a roots
		if(a==0)
			System.out.println("there is imaginary roots .");
		else if (m < 0)
			System.out.println("there is imaginary roots .");

		else {
			 i=(((-b)-(Math.pow(m, 0.5)))/(2*a));
			 j=(((-b)+(Math.pow(m, 0.5)))/(2*a));
		}
		if (i==j)
			System.out.println( i+" is the root .");
		else
			System.out.println( " "+i+" and "+j+" are the roots");
//		return 0;
		
	}
	public static void combinEquations() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of a,b,c for First equation:");
		int a=input.nextInt();              // this method to receive the coefficient values for any two equation and print a result of combining the two                                                                                  
		int b=input.nextInt();
		int c=input.nextInt();
		System.out.println("enter the value of a,b,c for second equation:");
		int e=input.nextInt();
		int f=input.nextInt();
		int d=input.nextInt();
		if((b+f)>0 && (c+d)>0)
		    System.out.println((a+e)+"x2+"+(b+f)+"x+"+(c+d));
		else if ((b+f)<0 && (c+d)<0)
			System.out.println((a+e)+"x2"+(b+f)+"x"+(c+d));
		else if((b+f)<0 && (c+d)>0)
		    System.out.println((a+e)+"x2"+(b+f)+"x+"+(c+d));
		else if((b+f)>0 && (c+d)<0)
		    System.out.println((a+e)+"x2+"+(b+f)+"x"+(c+d));
//		double m=(((b+f)*(b+f)) - (4*(a+e)*(c+d))) , i=0,j=0;
//		if((a+e)==0)
//			System.out.println("there is imaginary roots .");
//		else if (m < 0)
//			System.out.println("there is imaginary roots .");

//		else {
//			 i=((-(b+f))-(Math.pow(m, 0.5)))/(2*(a+e));
//			 j=((-(b+f))+(Math.pow(m, 0.5)))/(2*(e+a));
//		}
//		if (i==j)
//			System.out.println( i+" is the root .");
//		else
//			System.out.println( i+" and "+j+" are the roots");
//		return 0;
		
	}

}
