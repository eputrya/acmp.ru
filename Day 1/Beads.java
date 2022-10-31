import java.io.*;
import java.util.*;

/*
В шкатулке хранится разноцветный бисер (или бусины). Все бусины имеют одинаковую форму, размер и вес.
Бусины могут быть одного из N различных цветов. В шкатулке много бусин каждого цвета.

Требуется определить минимальное число бусин, которые можно не глядя вытащить из шкатулки так,
чтобы среди них гарантированно были две бусины одного цвета.

Входные данные

Входной файл INPUT.TXT содержит одно натуральное число N - количество цветов бусин (1 ≤ N ≤ 109).
Выходные данные

В выходной файл OUTPUT.TXT выведите ответ на поставленную задачу.

INPUT.TXT	OUTPUT.TXT
3	           4

https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=26&id_problem=144
 */

public class Beads {
    void solve(Scanner in, PrintWriter out) {
        int n =  in.nextInt();
        System.out.println(n + 1);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new Beads().run();
    }
}
