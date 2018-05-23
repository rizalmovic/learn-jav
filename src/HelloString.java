import java.util.Scanner;

public class HelloString extends Program
{
    public static Scanner input = new Scanner(System.in);

    public void run()
    {
        System.out.println(":: HelloString.java - Palindrome Checker ::");
        System.out.print("Type-in the word you would like to check : ");
        String word = input.next();

        if (palindrome(word)) {
            System.out.printf("%s is a palindrome", word);
        } else {
            System.out.printf("%s isn't a palindrome", word);
        }
    }

    public static Boolean palindrome(String word)
    {
        StringBuilder string = new StringBuilder();
        string.append(word);
        return word.matches(string.reverse().toString());
    }
}
