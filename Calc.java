public class Calc {

   private double num1;
   public void setNum1(double n1) {
      num1 = n1;   
   }
   public double getNum1() {
      return num1;
   }
   
   private double num2;
   public void setNum2(double n2) {
      num2 = n2;
   }
   public double getNum2() {
      return num2;
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