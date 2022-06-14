import java.util.Scanner;

public class Main
{
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        greet("Julie", "2022");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear)
    {
        System.out.println("Hej! Mit navn er " + assistantName + ".");
        System.out.println("Jeg blev skabt i " + birthYear + ".");
        System.out.println("Mind mig venligst om dit navn.");
    }

    static void remindName()
    {
        String name = scanner.nextLine();
        System.out.println("Sikke et godt navn du har, " + name + "!");
    }

    static void guessAge()
    {
        System.out.println("Lad mig gætte din alder.");
        System.out.println("Indtast rester af at dividere din alder med 3, 5 og 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Din alder er " + age + "; det er et godt tidspunkt at begynde at programmere!");
    }

    static void count()
    {
        System.out.println("Nu vil jeg bevise for dig, at jeg kan tælle til et hvilket som helst tal, du vil.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++)
        {
            System.out.printf("%d!\n", i);
        }
    }

    static void test()
    {
        System.out.println("Lad os teste din programmeringsviden.");
        System.out.println("Hvorfor bruger vi metoder?");

        System.out.println("1. For at gentage en sætning flere gange.");
        System.out.println("2. For at dekomponere et program i flere små underrutiner.");
        System.out.println("3. For at bestemme udførelsestiden for et program.");
        System.out.println("4. For at afbryde udførelsen af et program.");

        int input = scanner.nextInt();

        while (input!=2)
        {
            System.out.println("Prøv igen.");
            input = scanner.nextInt();
        }
    }

    static void end()
    {
        System.out.println("Tillykke, hav en god dag!");
    }
}
