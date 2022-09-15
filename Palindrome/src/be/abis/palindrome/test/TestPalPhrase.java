package be.abis.palindrome.test;

import be.abis.palindrome.model.Palindrome;
import be.abis.palindrome.model.PalindromePhrase;

import java.util.ArrayList;
import java.util.Iterator;

public class TestPalPhrase {

    public static void main(String[] args) {
        String[] palWords = {"kok", "pap", "lepel", "droomoord", "legerregel","", "level", null, "negen", "error", "lol",
                "meetsysteem", "legovogel", "parterretrap", "tarwewrat", "kaak", "racecar", "a"};
        String[] palSentences ={"lezen is in ezel", null, "This is a sentence", "Never odd or even","A Toyota's a Toyota", "x", "Was it a car or a cat I saw?","null"};

       Palindrome[] palArray = new Palindrome[30];
       int palArrayIndex=0;

        for (String palStr : palWords) {
            palArray[palArrayIndex] = new Palindrome(palStr);
            palArrayIndex++;
        }
        for (String palStr : palSentences) {
            palArray[palArrayIndex]=new PalindromePhrase(palStr);
            palArrayIndex++;
        }

        for (Palindrome p : palArray){
            if (p!=null) {
                if (p.isPalindrome()) {
                    System.out.println(p);
                }
            }
        }

        System.out.println("\nNumber of correct palindromes: " + Palindrome.countNumberOfPalindromes(palArray));



    }
}

