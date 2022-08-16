package LineComparision;

import java.util.Scanner;

public class EqualityOfLine {

	public static void main(String[] args) {
		
System.out.println("Welcome to Line comparison program...!");
		
		int x1,x2,y1,y2;
        float length;

        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter x1 point: ");
        x1=sc.nextInt();

        System.out.print("Enter y1 point: ");
        y1=sc.nextInt();
        
        System.out.print("Enter x2point: ");
        x2=sc.nextInt();
        
        System.out.print("Enter y2 point: ");
        y2=sc.nextInt();

        length=(float) Math.sqrt((x2-x1)^2 + (y2-y1)^2);

        System.out.println("Length of Lines is : "+"("+x1+","+y1+"),"+"("+x2+","+y2+")=>"+length);
        
		System.out.println(" Checking Equality of two lines in length:");
        System.out.println(x1 + " = " + y1 + " : " + (x1 == y1));
        System.out.println(x2 + " = " + y2 + " : " + (x2 == y2));

	}

}
