import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class HelloNumber extends Program
{
    static {
        input = new Scanner(System.in);
    }

    private static Scanner input;
    
    public void run()
    {
        int size = 0, min = 0, max = 0;

        System.out.println(":: HelloNumber.java - Random Number with Boundary ::");
        System.out.print("type size : ");
        size = input.nextInt();
        System.out.print("type min : ");
        min = input.nextInt();
        System.out.print("type max : ");
        max = input.nextInt();

        List<Integer> rnum = getLists(size, min, max);
        System.out.println(":: Generated random number ::");    
        rnum.forEach((v) -> {
            System.out.println(v);
        });
    }

    public static List<Integer> getLists (int member)
    {
        List<Integer> lists = new ArrayList<Integer>();
        Random generator = new Random();
        lists = generator.ints(member, 1, 10).boxed().collect(Collectors.toList());
        return lists;
    }

    // Overloading Method
    public static List<Integer> getLists (int member, int min, int max)
    {
        List<Integer> lists = new ArrayList<Integer>();
        Random generator = new Random();
        lists = generator.ints(member, min, max).boxed().collect(Collectors.toList());
        return lists;
    }
}