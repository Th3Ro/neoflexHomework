package NeoflexHoomework.src.ru.neoflex.homework.OOP;

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
                    break;
                case "enum":
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
}
