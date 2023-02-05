public class OperationsComplex implements OperationsComplexInterface {
    int choice;

    // Блок работы с комплексными числами

    //Выбор операции
    public OperationsComplex(int ch) {
        this.choice = ch;

        if (ch == 1) {
            sumCompl();
        }
        if (ch == 2) {
            subCompl();
        }
        if (ch == 3) {
            multCompl();
        }
        if (ch == 4) {
            divCompl();
        }
        if (ch == 0) {
            Logging.logWrite("Возврат в предыдущее меню");
            Menu.menu();
        }
    }

    @Override
    public void sumCompl() {
        double re1 = TryInput.inputNumber();
        double im1 = TryInput.inputNumber();
        double re2 = TryInput.inputNumber();
        double im2 = TryInput.inputNumber();

        double res = re1 + re2;
        double ims = im1 + im2;

        Output.out(res + " + " + ims + "j");
        Output.toLog("Комплексные числа", re1, im1, re2, im2, "+", res, ims); // логирование операции
    }

    @Override
    public void subCompl() {
        double re1 = TryInput.inputNumber();
        double im1 = TryInput.inputNumber();
        double re2 = TryInput.inputNumber();
        double im2 = TryInput.inputNumber();

        double res = re1 - re2;
        double ims = im1 - im2;
        Output.out(res + " + " + ims + "j");
        Output.toLog("Комплексные числа", re1, im1, re2, im2, "-", res, ims); // логирование операции
    }

    @Override
    public void multCompl() {
        double re1 = TryInput.inputNumber();
        double im1 = TryInput.inputNumber();
        double re2 = TryInput.inputNumber();
        double im2 = TryInput.inputNumber();

        double res = re1 * re2;
        double ims = im1 * im2;
        Output.out(res + " + " + ims + "j");
        Output.toLog("Комплексные числа", re1, im1, re2, im2, "*", res, ims); // логирование операции
    }

    @Override
    public void divCompl() {
        double re1 = TryInput.inputNumber();
        double im1 = TryInput.inputNumber();
        double re2 = TryInput.excep0();
        double im2 = TryInput.excep0();
        double res = re1 / re2;
        double ims = im1 / im2;
        Output.out(res + " + " + ims + "j");
        Output.toLog("Комплексные числа", re1, im1, re2, im2, "/", res, ims); // логирование операции
    }

}
