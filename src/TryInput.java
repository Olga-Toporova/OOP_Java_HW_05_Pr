import java.util.Scanner;

public class TryInput {
 // Ввод числа
    public static double inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        double a = sc.nextDouble();
        return a;
    }

    // Проверка ввода в окне выбора типа чисел
    public static int choice1() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        boolean is_right = false;
        while (!is_right) {
            a = sc.nextInt();
            if (a >= 0 && a < 3) {
                is_right = true;
            } else {
                System.out.println("Некорректное значение");
                Logging.logWrite("Введено некорректное значение" + a);

            }
        }
        return a;
    }

    // Проверка ввода в окне выбора типа операции
    public static int choice2() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        boolean is_right = false;
        while (!is_right) {
            a = sc.nextInt();
            if (a >= 0 && a < 5) {
                is_right = true;
            } else {
                System.out.println("Некорректное значение");
                Logging.logWrite("Введено некорректное значение" + a);

            }
        }
        return a;
    }

    // Проверка ввода на "0"
    public static double excep0() {
        boolean is_zero = true;
        double a = 0;
        while (is_zero) {
            a = inputNumber();
            if (a != 0) {
                is_zero = false;
            } else {
                System.out.println("Число не может быть нулем, попробуйте снова");
                Logging.logWrite("Попытка деления на 0");

            }
        }
        return a;
    }
}