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
  	if(b == 0) {
      System.out.println("You must not divide by 0.");
      return 0;
    }
    else {
         return (a * b); 
    }

	}
  
  public int modulo(int a, int b) {
  	if(b == 0) {
      System.out.println("You must not divide by 0.");
      return 0;
    }
    else {
      	return (a % b);
    }
  }

  public int divide(int a, int b) {
    return (a / b);
  }
  
public static void main(String[] args) {
  Scanner userInput = new Scanner(System.in);
  Calculator myCalculator = new Calculator();
  System.out.println("Calculator v1");
  System.out.println("Please enter Integer A:");
 	int a = userInput.nextInt();
  System.out.println("Please enter Integer B:");
  int b = userInput.nextInt();
  System.out.println("Please Choose an Operator:");
  String calcOp = userInput.nextLine();
  String operator;
  switch (calcOp) {
    case "+":
      System.out.println(a + " + " + b + " = " + myCalculator.add(a, b));
      break;
    case "-":
      System.out.println(a + " - " + b + " = " + myCalculator.subtract(a, b)) ;
      break;
  }
  
    
}
  
}