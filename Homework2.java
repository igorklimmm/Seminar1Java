// Вывести все простые числа от 1 до 1000

public class Homework2 {
    public static void main (String[] args) {
       int x;
       int y;
        for (x = 1; x <1000; x++) {
            y = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0)
                    y++;
            }
            if (y <= 2)
        System.out.println(x);
        }
    }
}