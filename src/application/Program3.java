package application;

import entities.aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Aluno e as três notas: ");
        aluno aluno = new aluno();
        aluno.name = sc.nextLine();
        aluno.n1 = sc.nextDouble();
        aluno.n2 = sc.nextDouble();
        aluno.n3 = sc.nextDouble();

        System.out.println(aluno);

        sc.close();
    }

}
