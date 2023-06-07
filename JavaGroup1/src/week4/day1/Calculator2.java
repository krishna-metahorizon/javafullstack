//package week4.day1;
//
//import java.util.Scanner;
//
//public class Calculator2 {
//	public static void main(String[] args) {
//		char operator;
//	    
//	    // create an object of Scanner class
//	    Scanner input = new Scanner(System.in);
//
//	 // ask users to enter operator
//	    System.out.println("Choose an operator: +, -, *, or /");
//	    operator = input.next().charAt(0);
//	    
//	    switch (operator) {
//	    	Double number1, number2, result;
//	      // performs addition between numbers
//	      case '+':
//	    	// ask users to enter numbers
//	  	    System.out.println("Enter first number");
//	  	    number1 = input.nextDouble();
//
//	  	    System.out.println("Enter second number");
//	  	    number2 = input.nextDouble();
//	  	    
//	        result = number1 + number2;
//	        System.out.println(number1 + " + " + number2 + " = " + result);
//	        break;
//
//	      // performs subtraction between numbers
//	      case '-':
//	    	// ask users to enter numbers
//	  	    System.out.println("Enter first number");
//	  	    number1 = input.nextDouble();
//
//	  	    System.out.println("Enter second number");
//	  	    number2 = input.nextDouble();
//	  	    
//	        result = number1 - number2;
//	        System.out.println(number1 + " - " + number2 + " = " + result);
//	        break;
//
//	      // performs multiplication between numbers
//	      case '*':
//	    	// ask users to enter numbers
//	  	    System.out.println("Enter first number");
//	  	    number1 = input.nextDouble();
//
//	  	    System.out.println("Enter second number");
//	  	    number2 = input.nextDouble();
//	  	    
//	        result = number1 * number2;
//	        System.out.println(number1 + " * " + number2 + " = " + result);
//	        break;
//
//	      // performs division between numbers
//	      case '/':
//	    	// ask users to enter numbers
//	  	    System.out.println("Enter first number");
//	  	    number1 = input.nextDouble();
//
//	  	    System.out.println("Enter second number");
//	  	    number2 = input.nextDouble();
//	  	    
//	        result = number1 / number2;
//	        System.out.println(number1 + " / " + number2 + " = " + result);
//	        break;
//
//	      default:
//	        System.out.println("Invalid operator!");
//	        break;
//	    }
//	    input.close();
//	  }
//}
