package Day_1;
import java.io.*;
import java.util.*;

/*
Напишите программу, которая считывает целое число и выводит текст с упоминанием следующего и предыдущего для него чисел.
Входные данные

Входной файл INPUT.TXT содержит целое число, не превосходящее 1000 по абсолютной величине.
Выходные данные

В выходной файл OUTPUT.TXT выведите текст, аналогичный приведенному в примере. При выводе следует учесть все
пробелы и знаки препинания.

INPUT.TXT	            OUTPUT.TXT
13            The next number for the number 13 is 14.
              The previous number for the number 13 is 12.

https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=26&id_problem=152
*/

public class NextAndPrevious {
    void solve(Scanner in, PrintWriter out) {
        int number = in.nextInt();
        System.out.println("The next number for the number " + number + " is " + (number + 1) + ".");
        System.out.println("The previous number for the number " + number + " is " + (number - 1) + ".");
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new NextAndPrevious().run();
    }
}
