package com.cracking.coding.interview;

import java.util.Arrays;

public class PermutationOfOther {
    public boolean isPermutationOfOtherStr(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       // return ch1.toString().equals(ch2.toString());//this doesn't work as it is address of an array
        return new String(ch1).equals(new String(ch2));
        /*int i = 0;
        int length = ch1.length;
        while (i < length) {
            if (ch1[i] == ch2[i]) {
                i++;
            } else {
                return false;
            }
        }
        return true;*/
    }

    public boolean isPermutationOfOtherString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int ch[] = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            ch[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            ch[s2.charAt(i)]--;
            if (ch[s2.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PermutationOfOther pemo = new PermutationOfOther();
        System.out.println(pemo.isPermutationOfOtherStr("madam", "damam"));
        System.out.println(pemo.isPermutationOfOtherString("madam", "mamda"));
        System.out.println(pemo.isPermutationOfOtherStr("hello", "happy"));
        System.out.println(pemo.isPermutationOfOtherString("hello", "happy"));
    }
}
