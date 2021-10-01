package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Run run = new Run();
        Scanner in = new Scanner(System.in);

        int chooce = -1;
        while(chooce != 3) {
            System.out.println("Choose a role: ");
            System.out.println("1: Admin");
            System.out.println("2: Student");
            System.out.println("3: Exit");
            chooce = in.nextInt();

            String choose;
            switch(chooce) {
                case 1: run.adminMethod();
                    break;
                case 2:
                    break;
                default: choose = "You haven't chosen correctly!";
                    break;
            }

        }
    }
}
