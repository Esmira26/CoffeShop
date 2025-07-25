package coffeShop;

import java.util.Scanner;

public class CoffeeShop {
    public  static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Xos gelmisiniz, CoffeShop center-e");
        System.out.println("Zehmet olmasa yasinizi daxil edin:");

        int age = scanner.nextInt();

        if (age < 12){
            System.out.println("Siz 12 yaşdan kiçiksiniz - pulsuz içki alırsınız!");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Siz tələbəsiniz - sizə tələbə endirimi tətbiq olunur!");
        }
        else if (age >= 65) {
            System.out.println("Siz 65 yaşdan yuxarısınız - xüsusi yaşlı endirimi tətbiq olunur!");
        }

        System.out.println(" Qehve menyusu: " + "\n 1.Espresso single " + "\n 2.Espresso double" + "\n 3.Americano" + "\n 4.Cappuccino" + "\n 5.Latte" + "\n 6.Frappe");
        System.out.println("Zehmet olmasa (1-6) araliginda secim edin");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Siz Espresso single seçdiniz.");
                break;
            case 2:
                System.out.println("Siz Espresso double seçdiniz.");
                break;
            case 3:
                System.out.println("Siz Americano seçdiniz.");
                break;
            case 4:
                System.out.println("Siz Cappuccino seçdiniz.");
                break;
            case 5:
                System.out.println("Siz Latte seçdiniz.");
                break;
            case 6:
                System.out.println("Siz Frappe seçdiniz.");
                break;
            default:
                System.out.println("Zəhmət olmasa 1-6 arası düzgün seçim edin!");
        }

    }
}
