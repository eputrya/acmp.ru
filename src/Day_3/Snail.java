package Day_3;

import java.io.*;
import java.util.*;

/*
Улитка ползет по вертикальному шесту высотой H метров, поднимаясь за день на A метров, а за ночь спускаясь на B метров.
На какой день улитка доползет до вершины шеста?

Входные данные
Входной файл INPUT.TXT содержит натуральные числа H, A и B. Ограничения: H ≤ 1000, B < A ≤ 100.

Выходные данные
В выходной файл OUTPUT.TXT выведите натуральное число – количество дней, необходимых улитке для достижения вершины шеста.

INPUT.TXT	OUTPUT.TXT
10 3 2	       8

https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=28&id_problem=161
*/

public class Snail {
    void solve(Scanner in, PrintWriter out) {
        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int result =  Math.max(1, 1 + (h - b - 1) / (a - b)); // см. формулу округления вверх (a+b-1)/b
        System.out.println(result);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new Snail().run();
    }
}
