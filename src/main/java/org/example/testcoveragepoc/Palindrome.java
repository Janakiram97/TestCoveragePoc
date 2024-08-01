package org.example.testcoveragepoc;

public class Palindrome {

    public boolean isPalindrome(String input){
        if(input==null){
            throw new IllegalArgumentException("Input cannot be null");
        }
        if(input.equals(reverseString(input)))
        {
            return true;
        }else{
            return false;
        }
    }

    private String reverseString(String input){
        String rev="";
        for(int i=input.length()-1;i>=0;i--)
        {
            rev=rev+input.charAt(i);
        }
        return rev;
    }
}
