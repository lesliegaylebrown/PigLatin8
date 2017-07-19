package com.Leslie;

import java.util.Scanner;

public class PigLatin8 {

    public static void main(String[] args) {
        System.out.println("Welcome to the English to Pig Latin Translator");
        System.out.println();

        System.out.println("Enter a word you would like translated: ");
        Scanner scan = new Scanner(System.in);

        do {
            String pigTrans = scan.nextLine();

            String translation = translateWord(pigTrans);

            System.out.println(translation + "");
        } while (scan.hasNext());
    }

    public static String translateWord(String originalWord) {

        originalWord = originalWord.toLowerCase();

        char v = originalWord.charAt(0);
        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {

            String newPig = originalWord + "way";

            return newPig;

        } else {
            // System.out.println("Vowel: "+ originalWord);my house is blue

            for (int i = 0; i < originalWord.length(); i += 1) {

                char p = originalWord.charAt(i);
                if (p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u') {

                    String newPig = originalWord.substring(i);
                    newPig += originalWord.substring(0, i);

                    return newPig + "ay";
                }
            }

        }
        return "Untranslatable -- no vowels";

    }

}

            




