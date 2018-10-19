package pdn.scs.lab7_strings;

public class Main {

    public static void main(String[] args)
    {
        Personnel p1 = new Personnel();
        if (p1.validateLogin())
            System.out.println("Success");
        else
            System.out.println("Failed");

        System.out.println("Is racecar a palindrome: " + p1.isPalindrome("racecar"));
        System.out.println("Is madam a palindrome: " + p1.isPalindrome("madam"));
        System.out.println("Is apple a palindrome: " + p1.isPalindrome("apple"));

        System.out.println("Is brainy an anagram of binary: " + p1.isAnagram("binary", "brainy"));
        System.out.println("Is anagram an anagram of nag a ram: " + p1.isAnagram("nag a ram", "anagram"));
        System.out.println("Is apple an anagram of orange: " + p1.isAnagram("apple", "orange"));
    }
}
