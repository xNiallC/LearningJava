import java.util.Scanner; 

public class Calculator {
	public Calculator() {
    
 }
	public int add(int a, int b) {
  	return (a + b);
	}

	public int subtract(int a, int b) {
  	return (a - b);
	}

	public int multiply(int a, int b) {
    return (a * b);

	}
  
  public int modulo(int a, int b) {
  	if((b == 0) || (a == 0)) {
      System.out.println("You must not divide by 0.");
      return 0;
    }
    else {
      	return (a % b);
    }
  }

  public int divide(int a, int b) {
    if((b == 0) || (a == 0)) {
      System.out.println("You must not divide by 0");
      return 0;
    }
    else {
      return (a / b);
    }
  }
  
public static void main(String[] args) {
  Scanner userInput = new Scanner(System.in);
  Calculator myCalculator = new Calculator();
  System.out.println("Calculator v1");
  System.out.println("\nPlease enter Integer A:");
 	int a = userInput.nextInt();
  System.out.println("\nPlease enter Integer B:");
  int b = userInput.nextInt();
  System.out.println("\nPlease Choose an Operator:");
  String inputBuffer = userInput.nextLine();
  String calcOp = userInput.nextLine();
  switch (calcOp) {
    case "+":
      System.out.println("\n" + a + " + " + b + " = " + myCalculator.add(a, b));
      break;

    case "-":
      System.out.println("\n" + a + " - " + b + " = " + myCalculator.subtract(a, b)) ;
      break;

    case "*":
      System.out.println("\n" + a + " * " + b + " = " + myCalculator.multiply(a, b)) ;
      break;

    case "/":
      System.out.println("\n" + a + " * " + b + " = " + myCalculator.divide(a, b)) ;
      break;

    case "%":
      System.out.println("\n" + a + " % " + b + " = " + myCalculator.modulo(a, b)) ;
      break;
  }
  
    
}
  
}