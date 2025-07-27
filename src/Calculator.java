import java.util.Scanner; // для ввода данных через консоль

public class Calculator { //класс как название?
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //точка входа и чтение консоли используя сканнер

        System.out.println("Калькулятор");
        System.out.println("Введите число:");
        double number1 = scanner.nextDouble(); // обЪявление переменной number1
        System.out.println("Введите операцию (+,-,/,*)");
        char operation = scanner.next().charAt(0);// если без charAT то работать не будет , так как scanner next - string , а не char , charAT метод который берет 1 символ из строки и преобразует его в char
        System.out.println("Введите второе чило:");
        double number2 = scanner.nextDouble();
        double  result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                if (number2 !=0) {
                    result = number1 / number2;
                } else {
                    System.out.println("На ноль делить нельзя");
                    return;
                }
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                System.out.println("Неверная операция!");
                return;
        }
        System.out.println("Итого:" + result);
        //scanner.close(); // Закрытие сканнера , чтоб не жрал память? Но и без этго отработает
}

}

