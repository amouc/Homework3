package com.amou;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        System.out.println("請輸入便利箱長度:");
        Float length = scanner.nextFloat();
        System.out.println("請輸入便利箱寬度:");
        Float width = scanner.nextFloat();
        System.out.println("請輸入便利箱高度:");
        Float height = scanner.nextFloat();

        if(box3.validate(length,width,height)){
            System.out.println("Box3");
        }else if (box5.validate(length,width,height)){
            System.out.println("Box5");
        }else{
            System.out.println("請用大點的箱子");
        }
    }
}
