import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        int weekDays = days.length;

        for (int i = 0; i < weekDays; i ++){
            System.out.println(days[i]);
        }

        // 배열에 값 추가하기
        // 카피해서 더하는 개념

        String[] days2 = Arrays.copyOf(days, 8);
        days2[7] = "일";

        // 배열은 이렇게도 출력 가능
        for (String day : days2){
            System.out.println(day);
        }

    }
}
