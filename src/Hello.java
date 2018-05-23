import java.util.Scanner;

public class Hello
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {        
        while(true) {
            System.out.println(":: Menus ::");
            System.out.println("1. Hello Number");
            System.out.println("2. String Explorations");
            System.out.println("3. Exit Program");
            System.out.print("Selected : ");
            
            Program program;
            int choise = input.nextInt();
            System.out.println("");

            switch (choise) {
                case 1:
                    program = new HelloNumber();
                    program.run();
                    break;
                case 2:
                    program = new HelloString();
                    program.run();
                    break;
                case 3:
                default:
                    System.exit(0);
                    break;
            }

            System.out.println("");
            System.out.println("");
        }
        
    }
}