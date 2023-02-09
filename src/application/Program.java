package application;

import entities.Rectangule;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangule rectangule = new Rectangule();

        System.out.print("Enter rectangule width and height: ");
        rectangule.width = sc.nextDouble();
        rectangule.heigth = sc.nextDouble();
        System.out.printf("AREA = %.2f%n", rectangule.area());
        System.out.printf("PERIMETER = %.2f%n", rectangule.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangule.diagonal());

        sc.close();
    }
}
