package lessons.lesson5;
/*
 SimpleCalculator -- define an instantiable class to perform arithmetic operations
 This example shows how to declare an instantiable class, and in particular:
 -- how to declare instance variables/ fields
 -- how to declare setter and getter methods corresponding to the instance variables
 -- how to declare a method to return a value
 */
// declare a class named SimpleCalculator -- this is the instantiable class
public class SimpleCalculator {
    // declare instance variables
    // properties /state
    private double firstNumber; // will store the first number
    private double secondNumber; // will store the second number
    private double result; // will store the result of an arithmetic operation
    private boolean isScientific; // an example of declaring an instance variable of type boolean
    // declare setter methods -- one setter method for each instance variable that needs to receive a value from the user
    // declare a setter method to store a value into the firstNumber instance variable
    public void setFirstNumber(double number){
        // store the number in the firstNumber instance variable
        firstNumber = number;
    }
    // declare setter method to set the value of the secondNumber instance variable
    public void setSecondNumber(double n){
        // store the value from n in the secondNumber instance variable
        secondNumber = n;
    }
    // define getter methods -- one getter method for each instance variable whose value should be made available to other classes (for example, the CalculatorApp class)
    // declare a getter method to be able to retrieve/get the result of the arithmetic computation
    public double getResult(){
        // return the value stored in result instance variable
        return result;
    }
    // declare behaviour/actions i.e. declare processing/computation methods
    // declare a method to perform the multiplication
    public void multiply(){
        result = firstNumber * secondNumber;
    }
    // declare a method to perform the division
    public void divide(){
        result = firstNumber / secondNumber;
    }
    // declare a method to perform the addition
    public void add(){
        result = firstNumber + secondNumber;
    }
    // declare a method to perform the subtraction
    public void subtract(){
        result = firstNumber - secondNumber;
    }
    // this method is not required by the text of the problem, I implement it just to demonstrate the default values of the instance variables i.e. zero (0.0) for numbers of type double
    public void display(){
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println();
    }
}
