// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int num = in.nextInt();
        
        if (num>0) 
        {
            for (int i = 0; i <= num; i++) {
                int f = num * (num+1)/2;
                System.out.println(f);      
            }
        }
        else System.out.println("Введите число больше 0");
    }
}
