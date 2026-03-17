import java.util.Scanner;
public class Calc {

   private double num1;
   public void setNum1(double n1) {
      num1 = n1;   
   }
   public double getNum1() {
      return num1;
   }
   
   public void newNum1(Scanner scan) {
   System.out.println("Please enter the first number: ");
      while (!scan.hasNextDouble()) {
         System.out.println("Invalid input. Please enter a numeric value: ");
         scan.next();
      }
      num1 = scan.nextDouble();
   }
   
   private double num2;
   public void setNum2(double n2) {
      num2 = n2;
   }
   public double getNum2() {
      return num2;
   }
   
   public void newNum2(Scanner scan) {
   System.out.println("Please enter the second number: ");
      while (!scan.hasNextDouble()) {
         System.out.println("Invalid input. Please enter a numeric value: ");
         scan.next();
      }
      num2 = scan.nextDouble();
   }   

   //add, subtract, multiply, divide methods
   public double add() {
      return num1 + num2;
   }
   public double subtract() {
      return num1 - num2;
   }
   public double multiply() {
      return num1 * num2;
   }
   public double divide() {
      return num1/num2;
   }
   
   //toString
   public String toString() {
      return "Diplaying private data fields using toString():\n" + "Num1: " + num1 + "\n" + "Num2: " + num2;
   }
}