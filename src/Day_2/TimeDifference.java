package Day_2;

import java.io.*;
import java.util.*;

/*
Даны значения двух моментов времени, принадлежащих одним и тем же суткам: часы, минуты и секунды для каждого из
моментов времени. Известно, что второй момент времени наступил не раньше первого. Определите, сколько секунд прошло
между двумя моментами времени. Программа на вход получает три целых числа – часы, минуты, секунды, задающие первый
момент времени и три целых числа, задающих второй момент времени. Выведите число секунд между этими моментами времени.

Входные данные
Входной файл INPUT.TXT содержит две строки, в каждой из них записан момент времени: в первой строке – начальный,
во второй – конечный. Каждое описание времени состоит из трех целых неотрицательных чисел: H, M и S – часы, минуты и
секунды (H ≤ 23, M ≤ 59, S ≤ 59).

Выходные данные
В выходной файл OUTPUT.TXT выведите одно неотрицательное целое число – число секунд между заданными моментами времени.

INPUT.TXT	OUTPUT.TXT
1 1 1
2 2 2	      3661

1 2 30
1 3 20	       50

https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=28&id_problem=159
 */

public class TimeDifference {
    void solve(Scanner in, PrintWriter out) {
        int hourStart = in.nextInt();
        int minutesStart = in.nextInt();
        int secondsStart = in.nextInt();
        int hourStop = in.nextInt();
        int minutesStop = in.nextInt();
        int secondsStop = in.nextInt();
        int start = hourStart * 3600 + minutesStart * 60 + secondsStart;
        int stop = hourStop * 3600 + minutesStop * 60 + secondsStop;
        int result = stop - start;
        System.out.println(result);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new TimeDifference().run();
    }
}
