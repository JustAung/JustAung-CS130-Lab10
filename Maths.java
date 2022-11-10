package Lab_10;

import java.util.Random;

public class Maths {
public static double E=Math.E;
public static double PI=3.1415;
private static Random randomNumberGenerator= new Random();

private Maths() {
	
}
public static int getRadomNumber() {
	int randomNumber= randomNumberGenerator.nextInt();
	return randomNumber;
}
public static int max(int num1, int num2) {
	return Math.max(num1, num2);
}
public static long max(long num1, long num2) {
	return Math.max(num1, num2);
}
public static double sin(double num1) {
	return Math.sin(num1);
}
public static double cos(double num1) {
	return Math.cos(num1);
}
public static double log(double num1) {
	return Math.log(num1);
}
public static double floor(double num1) {
	return Math.floor(num1);
}
public static double ceil(double num1) {
	return Math.ceil(num1);
}
public static double pow(double num1, double num2) {
	return Math.pow(num1, num2);
}
public static void main(String[] args) {
	System.out.println(Maths.max(2, 8));
	System.out.println(Maths.max(10, 20));
	System.out.println(Maths.sin(8.88));
	System.out.println(Maths.cos(8.88));
	System.out.println(Maths.log(8.88));
	System.out.println(Maths.floor(8.88));
	System.out.println(Maths.ceil(8.88));
	System.out.println(Maths.pow(12, 2));
	System.out.println(Maths.E);
	System.out.println(Maths.PI);
	System.out.println(Maths.getRadomNumber());
	
}
}