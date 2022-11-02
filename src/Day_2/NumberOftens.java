package Day_2;

import java.io.*;
import java.util.*;

/*
Требуется определить число десятков в заданном натуральном числе в его десятичной записи  (то есть найти предпоследнюю
цифру в числе).

Входные данные
Входной файл INPUT.TXT содержит натуральное число, не превосходящее 10^9.

Выходные данные
В выходной файл OUTPUT.TXT выведите ответ на задачу.

INPUT.TXT	OUTPUT.TXT
123	            2
46	            4

https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=27&id_problem=154
 */

public class NumberOftens {
    void solve(Scanner in, PrintWriter out) {
        int number = in.nextInt();
        System.out.println((number%100) / 10);

    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new NumberOftens().run();
    }
}
