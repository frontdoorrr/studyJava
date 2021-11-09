// 예외처리 및 사용자 숫자 입력 연습
import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("달러 환율을 입력하세요.");
        String exchangeString = scanner.nextLine();
        System.out.println("순댓국값을 입력하세요. ");
        String priceOfSoupString = scanner.nextLine();
        try {                                                                  // 예외처리 구문 try
            double exchange = Double.parseDouble(exchangeString);
            double priceOfSoup = Double.parseDouble(priceOfSoupString);
            System.out.println("순댓국은 " + priceOfSoup / exchange + "달러입니다.");
        } catch(Exception e) {                                                 // 예외처리 구문 catch (예외)
            System.out.println("숫자를 입력해야 합니다.");
        }





    }
}
