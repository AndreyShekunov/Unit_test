package hw3.task12;
/*
Задание 1.
Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет,
является ли переданное число четным или нечетным. (код приложен в презентации)

Задание 2.
Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
переданное число в интервал (25;100). (код приложен в презентации)
 */
public class Task12 {
    public boolean isEvenOrOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }

}
