import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean again = true;

        do {
            System.out.println("\n");
            System.out.printf("%-6s%-6s%-6s%-6s%-6s%n", "Roll", "Die1","Die2","Die3","Sum");
            System.out.println("------------------------------------------------");

            int totalRolls = 0;
            boolean notTriple = true;

            while (notTriple) {
                totalRolls++;
                int die1 =rnd.nextInt(6) + 1;
                int die2 =rnd.nextInt(6) + 1;
                int die3 =rnd.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                System.out.printf("%-6s%-6s%-6s%-6s%-6s%n", totalRolls, die1, die2, die3,sum);

                if (die1 == die2 && die2 == die3) {
                    notTriple = false;
                }
            }

            System.out.println("\nPlay again? (Y/N)");
            String response;
            response = in.nextLine();
            if (response.equals("y") || response.equals("Y")) {
                again = true;
            }else {
                again= false;
            }


        } while (again);


    }
}
