package Day_4;

import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.util.*;

/*
Замок состоит из K уровней. Каждый уровень - это правильный N-угольник, угол которого совпадает с углом предыдущего.
На сторонах первого уровня находится по две комнаты (в углах), на сторонах каждого следующего - на одну больше.
Сколько в замке комнат?

Входные данные
В первой строке входного файла INPUT.TXT указаны два целых числа N и K (3 ≤ N ≤ 106; 1 ≤ K ≤ 106).

Выходные данные
В выходной файл OUTPUT.TXT выведите целое число - количество комнат в замке.

INPUT.TXT	OUTPUT.TXT
6 3	            28

https://acmp.ru/?main=task&id_task=528
 */

public class Castle {
    void solve(Scanner in, PrintWriter out) {
        long N = in.nextInt();
        long K = in.nextInt();
        long count = K + 1 + (N - 2) * (1 + K) * K / 2;
        System.out.println(count);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new Castle().run();
    }
}
