package Day_2;

import java.io.*;
import java.util.*;

/*
Требуется определить последнюю цифру натурального числа.
Входные данные

Входной файл INPUT.TXT содержит натуральное число, не превосходящее 10^9.

Выходные данные
В выходной файл OUTPUT.TXT выведите последнюю цифру заданного числа.

INPUT.TXT	OUTPUT.TXT
5	            5
273         	3

https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=27&id_problem=153
 */

public class LastDigit {
    void solve(Scanner in, PrintWriter out) {
        int digit = in.nextInt();
        System.out.println(digit % 10);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new LastDigit().run();
    }
}
