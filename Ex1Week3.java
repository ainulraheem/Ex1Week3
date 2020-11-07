import java.util.Scanner;
public class Ex1Week3 {
	public static void main (String [] nilaiTerima) {

		int noInt = 10, x;

		// if (noInt == 10)
		// 	System.out.println("sama");
		// else
		// 	System.out.println("tak sama");

		System.out.println(noInt == 10 ? "sama" : "tak sama");

		if (noInt == 10)
			x = 3;
		else
			x = 19;

		//ternary operator
		x = noInt == 10 ? 3 : 19;
		System.out.println("x is " + x);








		// String nama;
		// int nombor;
		// double noDouble;

		// Scanner input = new Scanner(System.in);

		// input.nextLine();
		// System.out.println("Enter a string : ");
		// nama = 	input.next(); //or input.nextLine();
		// System.out.println("Number is " + nama);

		// System.out.println("Enter an integer : ");
		// nombor = input.nextInt();
		// System.out.println("Number is " + nombor);

		// System.out.println("Enter a double : ");
		// noDouble = input.nextDouble();
		// System.out.println("Number is " + noDouble);


		// input.close();
		








		//int [] tataInt = {10,20,30,40};
		//ordinary for
		//for (int i=0; i<tataInt.length; i++) {
		//	System.out.println(tataInt[i]);
		//}

		//for-each or advanced for
		//for ( int t : tataInt) {
		//	System.out.println("for each : " + t);
		//}








		//int noInt = '10'; //declare and initialize

		//final adalah constant variable
		//final char MYCHAR = 53; //ascii code
		//System.out.println("Char: " + MYCHAR);
		//MYCHAR = 100;
		//System.out.println("Char: " + MYCHAR);








		//int noInt = 0;
		//System.out.println("Nombor int " + noInt);

		//int [] tataInt = new int[4];

		//for (int i=0; i<tataInt.length; i++) {
		//	System.out.println(tataInt[i]);
		//}






		//int noInt = 123;
		//int noInt2 = 456;
		//double noDouble = 123.456;

		//System.out.format("%6d dan %4d", noInt, noInt2);
		//System.out.format("\n%4d", noInt2);
		//System.out.format("\nRM%7.1f", noDouble);
		//System.out.printf("\n%7.3f dan %6d ", noDouble, noInt);








		//System.out.println("Nilai 1 : " + nilaiTerima[0]);
		//System.out.println("Nilai 1 : " + nilaiTerima[1]);
		//System.out.println("Nilai 1 : " + nilaiTerima[2]);


		//javac Ex1Week3.java
		//java Ex1Week3 Ainul Arifah Beauticoma awesome

		//int sum = 0;

		//for (int i = 0; i < nilaiTerima.length; i++) {
		//	System.out.println("Nilai 1 : " + nilaiTerima[i]);
		//	sum += Integer.parseInt(nilaiTerima[i]);
		//	System.out.println("Nilai sum : " + sum);
		//}

		//java Ex1Week3 10 20 30 40
	}
}