package chap4;

import java.util.Scanner;

public class PostOffice {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu = 0;

        System.out.print("Songkhla Post Office\n");
        System.out.print("--------Menu------\n"
                + "0 : Exit\n"
                + "1 : Normal Letter\n"
                + "2 : Register\n"
                + "3 : EMS\n");

        do {
            System.out.print("Please Enter Menu : ");
            menu = sc.nextInt();

            if (menu == 1) {

                System.out.print("Enter Weight :");
                int weight = sc.nextInt();

                if (weight <= 20) {

                    System.out.println("Normal Letter Service Price : 3  ");
                } else if (weight > 20 && weight <= 100) {

                    System.out.println("Normal Letter Service Price :  5 ");
                } else if (weight > 100 && weight <= 250) {

                    System.out.println("Normal Letter Service Price :  9 ");
                } else if (weight > 250 && weight <= 500) {

                    System.out.println("Normal Letter Service Price :  15 ");
                } else if (weight > 500 && weight <= 1000) {

                    System.out.println("Normal Letter Service Price :  25 ");
                } else if (weight > 1000 && weight <= 2000) {

                    System.out.println("Normal Letter Service Price :  45 ");
                }

            } else if (menu == 2) {

                System.out.print("Enter Weight :");
                int weight = sc.nextInt();

                if (weight <= 20) {

                    System.out.println("\t" + "Normal Letter Service Price : " + (3 + 13) + "Baht");
                } else if (weight > 20 && weight <= 100) {

                    System.out.println("\t" + "Normal Letter Service Price : " + (5 + 13) + "Baht");
                } else if (weight > 100 && weight <= 250) {

                    System.out.println("\t" + "Normal Letter Service Price : " + (9 + 13) + "Baht");
                } else if (weight > 250 && weight <= 500) {

                    System.out.println("\t" + "Normal Letter Service Price : " + (15 + 13) + "Baht");
                } else if (weight > 500 && weight <= 1000) {

                    System.out.println("\t" + "Normal Letter Service Price : " + (25 + 13) + "Baht");
                } else if (weight > 1000 && weight <= 2000) {

                    System.out.println("\t" + "Normal Letter Service Price : " + (45 + 13) + "Baht");
                }

            } else if (menu == 3) {

                System.out.print("Enter Weight :");
                int weight = sc.nextInt();

                if (weight <= 20) {

                    System.out.println("Normal Letter Service Price : 27  ");
                } else if (weight > 20 && weight <= 100) {

                    System.out.println("Normal Letter Service Price :  32 ");
                } else if (weight > 100 && weight <= 250) {

                    System.out.println("Normal Letter Service Price :  37 ");
                } else if (weight > 250 && weight <= 500) {

                    System.out.println("Normal Letter Service Price :  47 ");
                } else if (weight > 500 && weight <= 1000) {

                    System.out.println("Normal Letter Service Price :  62 ");
                } else if (weight > 1000 && weight <= 2000) {

                    System.out.println("Normal Letter Service Price :  77 ");
                }

            }}
            while (menu != 0);

        
    }
}
