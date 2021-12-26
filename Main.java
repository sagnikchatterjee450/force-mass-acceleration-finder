package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Find Force, mass or acceleration with this program");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Find Force using mass and acceleration");
        System.out.println("2. Find Acceleration using mass and force");
        System.out.println("3. Find Mass using force and acceleration");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Enter the mass of the object:");
            double mass1_1 = sc.nextDouble();
            System.out.println("Enter the acceleration of the object:");
            double acceleration1_1 = sc.nextDouble();
            double result_1 = mass1_1 * acceleration1_1;
            System.out.println("The force of the object is:" + result_1 + "N");
        }

        if (a == 2) {
            System.out.println("Enter the mass of the object:");
            double mass1_2 = sc.nextDouble();
            System.out.println("Enter the force of the object:");
            double force1_2 = sc.nextDouble();
            double result_2 = force1_2 / mass1_2;
            System.out.println("The acceleration of the object is:" + result_2 + "m/s^2");

        }
        if (a == 3) {
            System.out.println("Enter the force of the object");
            double force1_3 = sc.nextDouble();
            System.out.println("Enter the acceleration of the object:");
            double acceleration3_3 = sc.nextDouble();
            double result_3 = force1_3 / acceleration3_3;
            System.out.println("The Mass of the object is:" + result_3 + "kg");
        }
    }
}
