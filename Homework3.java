// Реализовать простой калькулятор

import java.util.Scanner;

public class Homework3 {
   public static void main(String[] args) {
      double num1;
      double num2;
      double res;
      char symbol;
      Scanner reader = new Scanner(System.in);
      System.out.println("Введите числа:");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("Введите действие которое вы хотие сделать (+, -, *, /): ");
      symbol = reader.next().charAt(0);
      switch(symbol) {
         case '+': res = num1 + num2;
            break;
         case '-': res = num1 - num2;
            break;
         case '*': res = num1 * num2;
            break;
         case '/': res = num1 / num2;
            break;
         default:  System.out.printf("Введите действие представленное в списке");
            return;
      }
      System.out.println("Результат:");
      System.out.printf(num1 + " " + symbol + " " + num2 + " = " + res);
    }
}
