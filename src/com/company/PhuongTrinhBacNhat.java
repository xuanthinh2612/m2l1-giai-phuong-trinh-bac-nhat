package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PhuongTrinhBacNhat {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Chuong Trinh Gai Phuong Trinh Bac Nhat");
        System.out.println("Vui Long Nhap vao 3 so a,b,c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a");
        double a = scanner.nextDouble();
        System.out.println("Nhap vao so b");
        double b = scanner.nextDouble();
        if ((a == 0 && b == 0)) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else {
            if (a == 0 && b != 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co nghiem: " + (-b / a));
            }
        }


    }
}
