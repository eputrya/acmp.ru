package Day_4;

import java.io.*;
import java.util.*;

/*
Требуется посчитать сумму целых чисел, расположенных между числами 1 и N включительно.
Входные данные
В единственной строке входного файла INPUT.TXT записано единственное целое число N, не превышающее по абсолютной
величине 10^4.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел, расположенных
между 1 и N включительно.

INPUT.TXT	OUTPUT.TXT
5	            15

https://acmp.ru/?main=task&id_task=2
 */

public class Sum {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int amount = Math.abs(n - 1) + 1;
        int sum = (1 + n) * amount / 2;
        System.out.println(sum);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new Sum().run();
    }
}
