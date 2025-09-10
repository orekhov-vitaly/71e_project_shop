package client;

import app.controller.CustomerController;
import app.controller.ProductController;

import java.util.Scanner;

public class Client {
    private static ProductController productController;
    private static CustomerController customerController;
    private static Scanner scanner;

    public static void main(String[] args) {
        try {
            productController = new ProductController();
            customerController = new CustomerController();
            scanner = new Scanner(System.in);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        while (true) {
            System.out.println("Выберите желаемую операцию");
            System.out.println("1 - операции с продуктами");
            System.out.println("2 - операции с покупателями");
            System.out.println("0 - выход");

            String input = scanner.nextLine();

            switch (input){
                case "1":
                    productOperations();
                    break;
                case "2":
                    customerOperations();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Некорректный ввод!");
            }
        }
    }

    private static void productOperations() {
        while (true) {
            try {
                System.out.println("Выберите желаемую операцию с продуктами:");
                System.out.println("1 - сохранить продукт");
                System.out.println("2 - получить все продукты");
                System.out.println("3 - получить продукт по идентификатору");
                System.out.println("4 - изменить продукт");
                System.out.println("5 - удалить продукт по идентификатору");
                System.out.println("6 - удалить продукт по названию");
                System.out.println("7 - восстановить продукт по идентификатору");
                System.out.println("8 - получить количество продуктов");
                System.out.println("9 - получить суммарную стоимость всех продуктов");
                System.out.println("10 - получить среднюю стоимость продукта");
                System.out.println("0 - выход");

                String input = scanner.nextLine();

                switch (input) {
                    case "1":
                        break;
                    case "2":
                        productController.getAllActiveProducts().forEach(System.out::println);
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                    case "6":
                        break;
                    case "7":
                        break;
                    case "8":
                        break;
                    case "9":
                        break;
                    case "10":
                        break;
                    case "0":
                        return;
                    default:
                        System.out.println("Некорректный ввод!");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static void customerOperations() {
        while (true) {
            try {
                System.out.println("Выберите желаемую операцию с покупателями:");
                System.out.println("1 - сохранить покупателя");
                System.out.println("2 - получить всех покупателей");
                System.out.println("3 - получить покупателя по идентификатору");
                System.out.println("4 - изменить покупателя");
                System.out.println("5 - удалить покупателя по идентификатору");
                System.out.println("6 - удалить покупателя по имени");
                System.out.println("7 - восстановить покупателя по идентификатору");
                System.out.println("8 - получить количество покупателей");
                System.out.println("9 - получить стоимость корзины покупателя");
                System.out.println("10 - получить среднюю стоимость продукта в корзине покупателя");
                System.out.println("11 - добавить товар в корзину покупателя");
                System.out.println("12 - удалить товар из корзины покупателя");
                System.out.println("13 - очистить корзину покупателя");
                System.out.println("0 - выход");

                String input = scanner.nextLine();

                switch (input) {
                    case "1":
                        break;
                    case "2":
                        customerController.getAllActiveCustomers().forEach(System.out::println);
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                    case "6":
                        break;
                    case "7":
                        break;
                    case "8":
                        break;
                    case "9":
                        break;
                    case "10":
                        break;
                    case "11":
                        break;
                    case "12":
                        break;
                    case "13":
                        break;
                    case "0":
                        return;
                    default:
                        System.out.println("Некорректный ввод!");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
