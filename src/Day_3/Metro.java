package Day_3;

import java.io.*;
import java.util.*;

/*
Витя работает недалеко от одной из станций кольцевой линии метро, а живет рядом с другой станцией той же линии.
Требуется выяснить, мимо какого наименьшего количества промежуточных станций необходимо проехать Вите по кольцу,
чтобы добраться с работы домой.

Входные данные
Во входном файле INPUT.TXT заданы три числа: сначала N – общее количество станций кольцевой линии, а затем
i и j – номера станции, на которой Витя садится, и станции, на которой он должен выйти. Станции пронумерованы подряд
натуральными числами 1, 2, 3, …, N (1-я станция – соседняя с N-й), N не превосходит 100. Числа i и j не совпадают.
Все числа разделены пробелом.

Выходные данные
В выходной файл OUTPUT.TXT требуется вывести минимальное количество промежуточных станций (не считая станции посадки
и высадки), которые необходимо проехать Вите.

INPUT.TXT	OUTPUT.TXT
100 5 6	        0
10 1 9	        1

https://acmp.ru/?main=task&id_task=263
 */

public class Metro {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();
        int numberOfStation = Math.min(Math.abs(i - j) - 1, n - Math.abs(i - j) - 1);
        System.out.println(numberOfStation);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new Metro().run();
    }
}
