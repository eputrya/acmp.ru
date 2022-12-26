package Day_4;

import java.io.*;
import java.util.*;

/*
Пицца – любимое лакомство Васи, он постоянно покупает и с удовольствием употребляет различные сорта этого великолепного
блюда. Однажды, в очередной раз, разрезая круглую пиццу на несколько частей, Вася задумался: на какое максимальное
количество частей можно разрезать пиццу за N прямых разрезов?

Помогите Васе решить эту задачу, определив максимальное число не обязательно равных кусков, которые может получить Вася,
разрезая пиццу таким образом.

Входные данные
Входной файл INPUT.TXT содержит натуральное число N – число прямых разрезов пиццы (N ≤ 1000).

Выходные данные
В выходной файл OUTPUT.TXT выведите ответ на задачу.

INPUT.TXT	OUTPUT.TXT
2	            4
3	            7

https://acmp.ru/?main=task&id_task=554
 */

public class Pizza {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int result = (1 + n) * n / 2 + 1;
    }

    void run() {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new Pizza().run();
    }
}
