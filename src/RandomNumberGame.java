import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(256);

        Scanner scanner = new Scanner(System.in);
        System.out.println("게임을 시작합니다.");

        int count = 0;

        while (count < 8){
            System.out.println("숫자를 입력해주세요.");
            int inputNumber = scanner.nextInt();
            if (randomNumber == inputNumber) {
                System.out.println("정답입니다!");
                break;
            } else if (randomNumber > inputNumber){
                System.out.println("Up!");
                count ++;
            } else {
                System.out.println("Down!");
                count ++;
            }
        }
        System.out.println("정답은 "+ randomNumber + "입니다...");
        System.out.println("게임을 종료합니다!");
    }
}
