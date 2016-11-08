package seconddz;

import java.util.Scanner;

public class Main {

	private static void task1() {
		double a = 0;
		double b= 0;
		double chastnoe = 0;
		
		System.out.println("Into numerator and denominator");
		
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		b = in.nextDouble();
		
		if (b>0 && a>=0) {
			chastnoe = a / b;
			System.out.println("quotient = " + chastnoe);
		}else{
			System.out.println("ERROR");
		}
		

	}
	private static void task2() {
		int date;
		
		System.out.println("What year was founded Odessa?");
		
		Scanner in = new Scanner(System.in);
		date = in.nextInt();
		
		if (date == 1794) {
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE!!!Odessa was founded in 1794");
		}
	}
	private static void task3() {
		double cost;
		double discount;
		
		System.out.println("Into cost");
		
		Scanner in = new Scanner(System.in);
		cost = in.nextDouble();
		
		if (cost>500 && cost<1000) {
			discount = cost * 0.03;
			System.out.println("Descount 3%! Descount price = " + discount);
		}else if(cost>1000){
			discount = cost * 0.05;
			System.out.println("Descount 5%! Descount price = " + discount);
		}else if(cost>0){
			System.out.println("We do not get a discount! Price = " + cost);
		}else{
			System.out.println("Error entering prices");
		}
	}
	private static void task4() {
		int a;
		
		System.out.println("Into the number");
		
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		
		if ((a%2) == 0) {
			System.out.println("The number " +a+ "- even");
		}else if((a%1) == 0){
			System.out.println("The number " +a+ "- odd");
		}
	}
	private static void task5(){
		int a;
		
		System.out.println("Into the number");
		
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		
		if ((a%3) == 0) {
			System.out.println("The number divided by 3 successful!");		
		}else{
			System.out.println("The number is not divisible by 3");
		}
	}
	private static void task6(){
		int minutes = 0;
		int i = 0;
		double cost = 0;
		
		System.out.println("How long did the conversation?");
		System.out.println("What day is it");
		Scanner in = new Scanner(System.in);
		minutes = in.nextInt();
		i = in.nextInt();
		
		switch (i) {
		case 1:
			cost = minutes * 0.1;
			System.out.println("Cost =" +cost);
			break;
		case 2:
			cost = minutes * 0.1;
			System.out.println("Cost =" +cost);
			break;
		case 3:
			cost = minutes * 0.1;
			System.out.println("Cost =" +cost);
			break;
		case 4:
			cost = minutes * 0.1;
			System.out.println("Cost =" +cost);
			break;
		case 5:
			cost = minutes * 0.1;
			System.out.println("Cost =" +cost);
			break;
		case 6:
			cost = minutes * 0.1 * 0.2;
			System.out.println("Cost =" +cost);
			break;
		case 7:
			cost = minutes * 0.1 * 0.2;
			System.out.println("Cost =" +cost);
			break;
		}
	}
	public static void task7(){
		int a = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		
		a1 = a / 100; 
		a2 = (a % 100) / 10; 
		a3 = a % 10;
		
		if (a1 > a3) {
			System.out.println("first > third");	
		}else if(a1 < a3){
			System.out.println("first < third");
		}else{
			System.out.println("first = third");
		}
		
		if(a1 > a2){
			System.out.println("first > second");
		}else if(a1 < a2){
			System.out.println("first < second");
		}else{
			System.out.println("first = second");
		}
		
		if (a2 > a3) {
			System.out.println("second > third");			
		}else if(a2 < a3){
			System.out.println("second < third");
		}else{
			System.out.println("second = third");
		}
	}
	public static void task8(){
		int a = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		
		a1 = a / 100; 
		a2 = (a % 100) / 10; 
		a3 = a % 10;
		
		if (Math.pow(a, 2) == ( Math.pow(a1, 3) + Math.pow(a2, 3) + Math.pow(a3, 3))) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	public static void task9() {
		int a = 0;
		int x = 0;
		int y = 0;
		
		System.out.println("Into numbers (x, y)");
		
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		
		if (x < y) {
			a = x;
			x = (x +y) / 2;
			y = 2 * (a * y);
			System.out.println("x =" +x+ "y =" +y);
		}else if(y < x){
			a = y;
			y = (x +y) / 2;
			x = 2 * (a * x);
			System.out.println("x =" +x+ "y =" +y);
		}else{
			System.out.println("ERROR");
		}
	}
	private static void task10() {
		double a = 0;
		double b = 0;
		double d = 0;
		double x1 = 0;
		double x2 = 0;
		
		System.out.println("Into a and b, if ax^3+bx=0");
		
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		b = in.nextDouble();
		
		d = b * b - 4 * a;
		
		if (d > 0) {
			x1 = (-b + d) / 2 * a;
			x2 = (-b - d) / 2 * a;
			System.out.println("x1 = "+x1+ "x2 ="+x2);
		}else if(d == 0){
			x1 = x2 = (-b) / 2 * a;
			System.out.println("x1 = x2 ="+x1);
		}else{
			System.out.println("no solutions!!!");
		}
	}
	public static void main(String[] args) {
		task1();
		task2();
		task3();
		task4();
		task5();
		task6();
		task7();
		task9();
		task10();
	}
}
