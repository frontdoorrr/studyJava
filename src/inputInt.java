import java.util.Scanner;

public class inputInt {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        String intInput = scanner.nextLine();
        System.out.println(intInput + 1);                // input : 43, output : 431

        String intString = scanner.nextLine();
        int number = Integer.parseInt(intString);        // Integer.parseInt(something);
        System.out.println(number + 1);                  // input : 43, output : 44
    }
}
