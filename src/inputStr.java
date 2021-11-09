import java.util.Scanner;

public class inputStr {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);                    // 표준 입력

        String input = scanner.nextLine();                   // 문자열 Type을 반환
        System.out.println(input);

        String engWord = scanner.next();                     // next()는 띄어쓰기로 단어 분할하여 각각의 변수에 저장 가능
        String korWord = scanner.next();

        System.out.println(engWord);
        System.out.println(korWord);

    }
}
