import java.util.Scanner;

public class DoWhilePassword {
    public static void main(String[] args) {
        String password = "abc123";
        Scanner scanner = new Scanner(System.in);

        String input;

        do{                                                         // do - while 문을 사용 시, 최초에 한 번 실행한 이후에
            System.out.println("비밀번호를 입력해주세요.");               // 조건문을 따질 수 있어서 중복된 코드를 제거할 수 있다.
            input = scanner.nextLine();
        } while (input.equals(password) != true);
        System.out.println("비밀번호를 올바르게 입력했습니다.");
    }
}
