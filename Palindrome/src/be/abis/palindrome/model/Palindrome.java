package be.abis.palindrome.model;

public class Palindrome {
    private final String value;

    public Palindrome(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isPalindrome() {
        boolean retval=false;

        if (value != null && !value.equals("") && value.length()!=1) {
            StringBuilder sb = new StringBuilder(value);
            StringBuilder sbrev = new StringBuilder(value).reverse();
            retval=sb.toString().equals(sbrev.toString());
        }

        return retval;
    }

    public static int countNumberOfPalindromes(Palindrome[] palindromes){
        int counter = 0;
        for (Palindrome p: palindromes){
            if (p!=null && p.isPalindrome()){
                counter++;
            }
        }
        return counter;
    }

    public String toString(){
        return value;
    }


}

