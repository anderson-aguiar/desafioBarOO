package aplication;
import entities.Bill;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();
        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();

        System.out.println();
        System.out.println("RELATORIO:");

        System.out.println(bill);

        sc.close();
    }
}
