package com.codersbay.caesarchiffre;

import java.util.Random;
import java.util.Scanner;

public class Aufgabe5_3_CaesarChiffre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println(text);

        Random randomNumber = new Random();
        int key = randomNumber.nextInt(27);
        System.out.println("key: " + key);

        String chiffre = "";
        for (int i = 0; i < text.length(); i++) {
            char c = (char) (text.charAt(i) + key);
            chiffre += c;
        }
        System.out.println(chiffre);
    }
}
