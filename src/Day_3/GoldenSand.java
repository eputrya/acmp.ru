package Day_3;

import java.io.*;
import java.util.*;

/*
 Сотрудники завода по производству золотого песка из воздуха решили поправить свое финансовое положение.
 Они пробрались на склад завода, где хранился золотой песок трех видов. Один килограмм золотого песка первого вида
 они смогли бы продать за A1 рублей, второго вида – за A2 рублей, а третьего вида – за A3 рублей. Так получилось,
 что у сотрудников оказалось с собой только три емкости: первая была рассчитана на B1 килограмм груза, вторая на
 B2 килограмм, а третья на B3 килограмм. Им надо было заполнить полностью все емкости таким образом, чтобы получить
 как можно больше денег за весь песок. При заполнении емкостей нельзя смешивать песок разных видов, то есть, в одну
 емкость помещать более одного вида песка, и заполнять емкости песком так, чтобы один вид песка находился более чем в
 одной емкости.

Требуется написать программу, которая определяет, за какую сумму предприимчивые сотрудники смогут продать весь песок
в случае наилучшего для себя заполнения емкостей песком.

Входные данные
В единственной строке входного файла INPUT.TXT записано 6 натуральных чисел A1, A2, A3, B1, B2, B3, записанных в
одной строке через пробел. Все числа не превосходят 100.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести единственное целое число – сумму в рублях, которую
смогут сотрудники заработать в случае наилучшего для себя заполнения емкостей песком.

INPUT.TXT	    OUTPUT.TXT
1 2 3 3 2 1	        14

https://acmp.ru/?main=task&id_task=685
 */

public class GoldenSand {
    void solve(Scanner in, PrintWriter out) {
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int b3 = in.nextInt();
        int sumA = a1 + a2 + a3;
        int sumB = b1 + b2 + b3;

        int maxA = Math.max(a1, Math.max(a2, a3));
        int minA = Math.min(a1, Math.min(a2, a3));
        int middleA = sumA - maxA - minA;

        int maxB = Math.max(b1, Math.max(b2, b3));
        int minB = Math.min(b1, Math.min(b2, b3));
        int middleB = sumB - maxB - minB;

        int result = maxA * maxB + middleA * middleB + minA * minB;
        System.out.println(result);

    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new GoldenSand().run();
    }
}
