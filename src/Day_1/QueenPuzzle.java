package Day_1;
import java.io.*;
import java.util.*;

/*
Вероятно, что многие из вас играли в шахматы. Поэтому вы знаете, что ферзь может двигаться по горизонталям,
вертикалям и диагоналям.

Вася недавно начал заниматься шахматами и где-то прочел головоломку, в которой нужно было расставить максимальное
количество ферзей на доске 8х8 так, чтобы хотя бы одно поле оказалось небитым. Эта задача легко решается для доски 3х3,
т.к. понятно, что более двух ферзей расставить таким образом на ней невозможно.

Помогите Васе решить эту задачу для доски N×N.
Входные данные

В единственной строке входного файла INPUT.TXT записано натуральное число N – размеры шахматной доски N×N (1 ≤ N ≤ 100).
Выходные данные

В единственную строку выходного файла OUTPUT.TXT нужно вывести максимальное количество ферзей, которых можно
расставить на шахматной доске N×N так, чтобы одна клетка оставалась небитой.

INPUT.TXT	OUTPUT.TXT
 3	           2

https://acmp.ru/?main=task&id_task=86
 */

public class QueenPuzzle {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int maxQueen = n * n - (3 * n - 2);
        System.out.println(maxQueen);
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new QueenPuzzle().run();
    }
}
