package be.abis.palindrome.test;

import be.abis.palindrome.model.Palindrome;
import be.abis.palindrome.model.PalindromePhrase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void tacocatIsPalindrome() {
        Palindrome p = new Palindrome("tacocat");
        assertTrue(p.isPalindrome());
    }

    @Test
    void sentenceIsPalindrome() {
        PalindromePhrase pp = new PalindromePhrase("Was it a car or a cat I saw?");
        assertTrue(pp.isPalindrome());
    }

    @Test
    void countNumberOfPalindromesReturns18() {
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

        assertEquals(18,Palindrome.countNumberOfPalindromes(palArray));

    }
}