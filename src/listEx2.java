import java.util.*;

public class listEx2 {
    public static void main(String[] args) {
        System.out.println("저장할 음식 이름 입력 :");
        List<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String food = scanner.nextLine();

            if (food.equals("0")) {
                break;
            }

            if (foods.contains(food)){
                System.out.println("이미 목록에 있습니다.");
            } else {
                foods.add(food);
            }

        }

        // 리스트 정렬
        Collections.sort(foods);
        // 리스트 역순 정렬
        Collections.reverse(foods);
        // 리스트 랜덤 정렬
        Collections.shuffle(foods);


        System.out.println(foods);

    }
}
