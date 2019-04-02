package com.amou;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box3Box box3 = new Box3Box();
        Box5Box box5 = new Box5Box();
        System.out.println("請輸入便利箱長度:");
        float length = scanner.nextFloat();
        System.out.println("請輸入便利箱寬度:");
        float width = scanner.nextFloat();
        System.out.println("請輸入便利箱高度:");
        float height = scanner.nextFloat();

        if (box3.validate(length, width, height)) {
            System.out.println("請用Box3箱子");
        } else if (box5.validate(length, width, height)) {
            System.out.println("請用Box5箱子");
        } else {
            System.out.println("請用更大的子箱子");
        }
    }
}
