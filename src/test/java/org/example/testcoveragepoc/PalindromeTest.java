package org.example.testcoveragepoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {


    Palindrome p=new Palindrome();

    @Test
     void palindromeTest()
    {
        String input="madam";
        boolean exceptedResult=true;
        assertEquals(exceptedResult,p.isPalindrome(input));
    }

    @Test
    void notPalindromeTest()
    {
       String input="hello";
        boolean exceptedResult=false;
        assertEquals(exceptedResult,p.isPalindrome(input));
    }

    @Test
    void nullInputTest()
    {
      String input=null;
     assertThrows(IllegalArgumentException.class,() ->p.isPalindrome(input));
    }
}