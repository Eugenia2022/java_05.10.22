import java.util.Arrays;

                               /*       Marynina Yevheniia 09.10.22. (2 задачи - два метода)

 Дано 2 массива. Первый массив String[] содержит имена студентов. Второй массив double[] содержит средний балл  студентов.
 i-й элемент первого массива соответствует i-элементу второго массива. Длины массивов равны.
 Необходимо написать метод, который возвращает имя самого успешного студена.
 В данной задаче, если 2 и более студента имеют лучший бал, метод может вернуть имя любого из них.

 Исходные условия как у предыдущей задачи, т.е. дано два массива один с именами другой с средним баллом,
 но ваш метод должен выдавать строку вида имя1 - балл1:имя2 - балл2:имя3 - балл3 ….для всех студентов,
 чей балл выше заданного значения.
 Например:
{“Jack”, “John”, “Stan”, “Ed”}, {3.5, 4.2, 4.8, “4.1”}, 4.0 ->
“John - 4.2:Stan - 4.8:Ed - 4.1” */


public class Main {
    public static void main(String[] args) {
        String[] names = new String[] {"Jack", "John", "Stan", "Ed"};
        double[] marks = new double[] {3.5, 4.2, 4.8, 4.1};

        double val1 = 3.0;
        double val2 = 3.5;
        double val3 = 4.1;
        double val4 = 4.5;

        FindBestStudent(names, marks);

        SortByMark(val1, names, marks);
        SortByMark(val2, names, marks);
        SortByMark(val3, names, marks);
        SortByMark(val4, names, marks);
    }

    private static void SortByMark(double mark, String[] names, double[] marks) {
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] > mark){
                System.out.print(names[i] + " - " + marks[i] + ':');
            }
        }

        System.out.println();
    }

    private static void FindBestStudent(String[] names, double[] marks) {
        int indexOfBestMark = 0;
        double bestMark = 0.0;

        for (int i = 0; i < marks.length; i++) {
            if(marks[i] > bestMark) {
                bestMark = marks[i];
                indexOfBestMark = i;
            }
        }

        System.out.print(names[indexOfBestMark] + " - " + marks[indexOfBestMark] + " <-- Our best classmate");
        System.out.println();
    }
}