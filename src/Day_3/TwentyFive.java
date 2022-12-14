package Day_3;

import java.io.*;
import java.util.*;

/*
Вася и Петя учатся в школе в одном классе. Недавно Петя поведал Васе о хитром способе возведения в квадрат натуральных
чисел, оканчивающихся на цифру 5. Теперь Вася может с легкостью возводить в квадрат двузначные
(и даже некоторые трехзначные) числа, оканчивающиеся на 5. Способ заключается в следующем: для возведения в квадрат
числа, оканчивающегося на 5 достаточно умножить число, полученное из исходного вычеркиванием последней пятерки на
следующее по порядку число, затем остается лишь приписать «25» к получившемуся результату справа. Например, для того,
чтобы возвести число 125 в квадрат достаточно 12 умножить на 13 и приписать 25, т.е. приписывая к числу 12*13=156
число 25, получаем результат 15625, т.е. 1252=15625. Напишите программу, возводящую число, оканчивающееся на 5, в
квадрат для того, чтобы Вася смог проверить свои навыки.

Входные данные
В единственной строке входного файла INPUT.TXT записано одно натуральное число А, оканчивающееся на цифру 5, не превышающее 4*105.
Выходные данные

В выходной файл OUTPUT.TXT выведите одно натуральное число - A^2 без лидирующих нулей.

INPUT.TXT	OUTPUT.TXT
5	            25
75	            5625
4255	        18105025

https://acmp.ru/?main=task&id_task=3
 */

public class TwentyFive {
    void solve(Scanner in, PrintWriter out) {
        long digit = in.nextLong();
        long result = (digit / 10 * (digit / 10 + 1)) * 100 + 25;
        System.out.println(result);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new TwentyFive().run();
    }
}
