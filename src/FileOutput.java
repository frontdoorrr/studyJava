import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/output01.txt");
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("파일 입력을 종료하려면 입력 없이 ENTER 키를 누르세요.");

        while (true) {
            String inputMessage = scanner.nextLine();

            if (inputMessage.equals("")){
                System.out.println("파일 입력을 종료합니다.");
            }
            try {
                for (int i = 0; i < 10; i++) {
                    inputMessage = scanner.nextLine();
                    writer.write(inputMessage + "\n");
                    writer.write("치킨은 살 안 쪄요.\n");
                }
            writer.close();
            } catch (IOException e) {
                System.out.println("파일에 데이터를 쓰는 데에 실패했습니다.");
                System.exit(2);
            }
        }

    }
}
