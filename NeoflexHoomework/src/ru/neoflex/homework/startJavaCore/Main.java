package NeoflexHoomework.src.ru.neoflex.homework.startJavaCore;

public class Main {
    public static void main(String[] args) {
        byte byteVariable = 127;
        short shortVariable = 32767;
        int intVariable = -2147483648;
        long longVariable = 100L;
        float floatVariable = 65.546f;
        double doubleVariable = 12.04534;
        char charVariable = 'a';
        boolean booleanVariable = false;
    }

    public double calculateExpresion (double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public boolean isSumBetweenTenAndTwenty (double first, double second) {
        double sum = first + second;
        return 10 < sum && sum <= 20;
    }

    public void isPositiveOrNegative (int number) {
        System.out.println(number >= 0 ? "Положительное" : "Отрицательное");
    }

    public boolean isNegative (int number) {
        if (number < 0)
            return true;
        return false;
    }

    public void helloMethod (String name) {
        System.out.println("Привет, " + name + "!");
    }

    public void isLeapYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год не високосный.");
        }
    }
}
