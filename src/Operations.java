public class Operations implements OperationsInterface {
    int choice;

    // Блок работы с рациональными числами

    //Выбор операции
    public Operations(int ch) {
        this.choice = ch;

        if (ch == 1) {
            sum();
        }
        if (ch == 2) {
            sub();
        }
        if (ch == 3) {
            mult();
        }
        if (ch == 4) {
            div();
        }
        if (ch == 0) {
            Logging.logWrite("Возврат в предыдущее меню");
            Menu.menu();
        }
    }

    @Override
    public void sum() {
        double a = TryInput.inputNumber();
        double b = TryInput.inputNumber();
        double result = a + b;
        Output.out(result);
        Output.toLog("Рациональные числа", a, b, "+", result); // логирование операции
    }

    @Override
    public void sub() {
        double a = TryInput.inputNumber();
        double b = TryInput.inputNumber();
        double result = a - b;
        Output.toLog("Рациональные числа", a, b, "-", result); // логирование операции
        Output.out(result);
    }

    @Override
    public void mult() {
        double a = TryInput.inputNumber();
        double b = TryInput.inputNumber();
        double result = a * b;
        Output.out(result);
        Output.toLog("Рациональные числа", a, b, "*", result); // логирование операции
    }

    @Override
    public void div() {
        double a = TryInput.inputNumber();
        double b = TryInput.excep0();
        double result = a / b;
        Output.out(result);
        Output.toLog("Рациональные числа", a, b, "/", result); // логирование операции
    }
}
