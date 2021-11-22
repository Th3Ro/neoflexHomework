package NeoflexHoomework.src.ru.neoflex.homework.OOP;

import NeoflexHoomework.src.ru.neoflex.homework.OOP.geometry.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Что вы хотите проверить?" + "\r\n" +
                    "contacts - команда для работы с контактами;" + "\r\n" +
                    "geometry - команда для работы с геиметрическими фигурами;" + "\r\n" +
                    "enum - команда для работы с перечислением;" + "\r\n" +
                    "exit - команда для выхода из программы.");
            switch (in.next().toLowerCase()) {
                case "contacts":
                    workWithContacts();
                    break;
                case "geometry":
                    workWithFigures();
                    break;
                case "enum":
                    System.out.println("Дни недели из созданного Enum");
                    for(MyEnum myEnum: MyEnum.values) {
                        System.out.println(myEnum);
                    }
                    break;
                case "exit":
                    isExit = true;
                    break;
                default:
                    System.out.println("Не верная команда");
                    break;
            }
        }
    }

    private static void workWithContacts () {
        Scanner in = new Scanner(System.in);
        boolean isEnd = false;
        while (!isEnd) {
            System.out.println("Вы выбрали работу с контактами, что вы хотите сделать?" + "\r\n" +
                    "add - команда для добавления контакта;"  + "\r\n" +
                    "get - команда для поучения контакта по имени;" + "\r\n" +
                    "getbypart - команда для получения списка контактов по части имени" + "\r\n" +
                    "exit - команда для выхода из режима работы с контактами.");
            switch (in.next().toLowerCase()){
                case "add":
                    HashSet<Long> numbers = new HashSet<>();
                    System.out.println("Введите имя контакта:");
                    String contactName = in.next();
                    boolean isEnough = false;
                    while (!isEnough) {
                        System.out.println("Введите номер:");
                        System.out.println("Для выхода из добавления номера введите - 0.");
                        Long number;
                        try{
                             number = in.nextLong();
                        } catch (Exception ex) {
                            System.out.println("Вы ввели не верный номер");
                            in.next();
                            continue;
                        }
                        if (number < 0) {
                            System.out.println("Вы ввели не верный номер");
                        } else if (number == 0) {
                            isEnough = true;
                        } else {
                            numbers.add(number);
                        }
                    }
                    ContactBook.addNewContact(contactName.toLowerCase(), numbers);
                    break;
                case "get":
                    System.out.println("Введите имя контакта:");
                    System.out.println(ContactBook.getContact(in.next()));
                    break;
                case "getbypart":
                    System.out.println("Введите часть имени контакта:");
                    System.out.println(ContactBook.getContactByPartOfName(in.next()));
                    break;
                case "exit":
                    isEnd = true;
                    break;
                default:
                    System.out.println("Не верная команда");
                    break;
            }
        }
    }

    private static void workWithFigures () {
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Circle(0, 0, 5));
        figures.add(new Line(5, 5, 17, 15));
        figures.add(new Parallelogram(5, 5, 7, 9, 14, 9, 12, 5));
        figures.add(new Point(1,8));
        figures.add(new Rectangle(3, 8, 3, 13, 11, 13, 11, 8));
        figures.add(new Square(5,10, 5, 22, 17, 22, 17, 10));
        figures.add(new Triangle(10, 5, 15, 14, 20, 2));
        System.out.println("Фигуры и их свойства.");
        for(Figure figure: figures){
            System.out.println(figure.getType() + ", length: " + figure.getLineLength() + ", area: " + figure.getArea());
        }
    }
}
