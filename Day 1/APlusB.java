import java.io.*;
import java.util.*;

/*
Требуется сложить два целых числа А и В.

Входные данные:
В единственной строке входного файла INPUT.TXT записаны два натуральных числа через пробел.
Значения чисел не превышают 10^9.

Выходные данные:
В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел А и В.

Пример
INPUT.TXT  OUTPUT.TXT
2 3          5

https://acmp.ru/?main=task&id_task=1
*/

public class APlusB {
    void solve(Scanner in, PrintWriter out) {
        int firstNumber = in.nextInt();
        int secondnumber = in.nextInt();
        System.out.println(firstNumber + secondnumber);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new APlusB().run();
    }
}