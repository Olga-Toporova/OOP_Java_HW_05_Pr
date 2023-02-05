public class Output {

    //Вывод результата в терминал
    static void out(Double res) {
        System.out.println(res);
    }

    static void out(String result) {
        System.out.println(result);
    }

    // Сборка информации для логирования
    static void toLog(String type, double a, double b, String op, double result ){
        Logging.logWrite(type + " | Операция: " + a + " " + op + " " + b + " = " + (a + b));
        Menu.menu();
    }

    static void toLog(String type, double re1, double im1, double re2, double im2, String op, double res, double ims ){
        Logging.logWrite(type + " | Операция: (" + re1 + " + " + im1 + "j) - (" + re2 + " + " + im2 + "j) = " + res + " + " + ims + "j");
        Menu.menu();
    }
}
