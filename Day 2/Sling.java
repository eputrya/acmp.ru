import java.io.*;
import java.util.*;

/*
Портос хочет украсить золотым шитьем свою перевязь. Он знает, что один сантиметр золотого шитья стоит один луидор.
Портосу надо вышить N миллиметров перевязи. Причем мастер никогда не возьмется за работу, если ему заплатят меньше,
чем стоит работа. И сдачу мастер никогда не отдает.

Какое минимальное количество луидоров Портос должен заплатить мастеру за работу?
Входные данные

Входной файл INPUT.TXT содержит натуральное число N (N ≤ 109) – длина перевязи в миллиметрах.
Выходные данные

В выходной файл OUTPUT.TXT выведите минимальное количество луидоров, которые Портос должен отдать за работу.

INPUT.TXT	OUTPUT.TXT
200	            20
203	            21

https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=27&id_problem=151
 */

public class Sling {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int cost = (n + 10 - 1)/10;
        System.out.println(cost);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new Sling().run();
    }
}
