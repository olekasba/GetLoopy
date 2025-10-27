public class PartB {
    public static void main(String[] args) {

        System.out.println("Task 5");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
                if (col < row) System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\nTask 6");
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
                if (col < row) System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\nTask 7");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");
                if (col < 5) System.out.print(" ");
            }
            System.out.println();
        }

    }
}
