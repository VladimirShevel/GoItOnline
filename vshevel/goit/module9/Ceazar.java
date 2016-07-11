package vshevel.goit.module9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ceazar {


    public static String encrypt(int key, String inputString) {
        ArrayList<Character> charArray = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            int a = ((int) inputString.charAt(i) + key);
            charArray.add((char) a);
        }
        StringBuilder builder = new StringBuilder();
        for (Character value : charArray) {
            builder.append(value);
        }
        return builder.toString();
    }
    public static String decrypt (int key, String inputString) {
        return encrypt((-key), inputString);
    }
}
