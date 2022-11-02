package Day_2;

import java.io.*;
import java.util.*;

/*
Найдите сумму цифр трехзначного натурального числа.
Входные данные

Входной файл INPUT.TXT содержит трехзначное натуральное число.
Выходные данные

В выходной файл OUTPUT.TXT выведите сумму цифр заданного числа.

INPUT.TXT	OUTPUT.TXT
100         	1
123         	6

https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=27&id_problem=155
 */

public class SumOfDigits {
    void solve(Scanner in, PrintWriter out) {
        int digit = in.nextInt();
        int sum =  digit%10 + (digit%100)/10 + digit/100;
        System.out.println(sum);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new SumOfDigits().run();
    }
}
