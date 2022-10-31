import java.io.*;
import java.util.*;

/*
В свободное время одноклассники Вася и Петя любят играть в различные логические игры: морской бой, крестики-нолики,
шахматы, шашки и многое другое. Ребята уже испробовали и поиграли во всевозможные классические игры подобного рода,
включая компьютерные. Однажды им захотелось сыграть во что-нибудь новое, но ничего подходящего найти не удалось.
Тогда Петя придумал следующую игру «Угадайка»: Играют двое участников. Первый загадывает любое трехзначное число,
такое что первая и последняя цифры отличаются друг от друга более чем на единицу. Далее загадавший число игрок
переворачивает загаданное число, меняя первую и последнюю цифры местами, таким образом получая еще одно число.
Затем из максимального из полученных двух чисел вычитается минимальное. Задача второго игрока – угадать по первой
цифре полученного в результате вычитания числа само это число. Например, если Вася загадал число 487, то перестановкой
первой и последней цифры он получит число 784. После чего ему придется вычесть из 784 число 487, в результате чего
получится число 297, которое и должен отгадать Петя по указанной первой цифре «2», взятой из этого числа.
Петя успевает лучше Васи по математике, поэтому практически всегда выигрывает в играх такого типа. Но в данном случае
Петя схитрил и специально придумал такую игру, в которой он не проиграет Васе в любом случае. Дело в том, что
придуманная Петей игра имеет выигрышную стратегию, которая заключается в следующем: искомое число всегда является
трехзначным и вторая его цифра всегда равна девяти, а для получения значения последней достаточно отнять от девяти
первую, т.е. в рассмотренном выше случае последняя цифра равна 9-2=7. Помогите Пете еще упростить процесс отгадывания
числа по заданной его первой цифре, написав соответствующую программу.

Входные данные:
В единственной строке входного файла INPUT.TXT задана единственная цифра К, соответствующая первой цифре полученного
Васей в результате вычитания наименьшего загаданного Васей значения из наибольшего.

Выходные данные:
В выходной файл OUTPUT.TXT нужно вывести значение полученной Васей разности.

INPUT.TXT
5

OUTPUT.TXT
594
 */

public class Game {
    void solve(Scanner in, PrintWriter out) {
        int number = in.nextInt();
        System.out.println(number + "9" + (9 - number));
    }

    void run() {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }

    public static void main(String[] args) {
        new Game().run();
    }
}
