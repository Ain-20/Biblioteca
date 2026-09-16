package it.uniroma2.dicii.bd.view;

import java.io.IOException;
import java.util.Scanner;

public class AmministratoreView {
    public static int showMenu() throws IOException {
        System.out.println("*********************************");
        System.out.println("*    LIBRARY MENU    *");
        System.out.println("*********************************\n");
        System.out.println("*** Scegliere una delle seguenti opzioni ***\n");
        System.out.println("1) Dismissione libri");
        System.out.println("2) Esci");

        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.print("Inserire l'opzione desiderata: ");
            choice = input.nextInt();
            if (choice >= 1 && choice <= 2) {
                break;
            }
            System.out.println("Opzione invalida");
        }

        return choice;
    }
}
