public class StringEx {
    public static void main(String[] args) {
        String chicken = "치킨은 살 안 쪄요. "; // 자바에서는 문자열일 경우에는 "를 이용하고 문자일 경우는 '를 이용한다.
        String me      = "살은 내가 쪄요.";
        String chickenAndMe = chicken + me; // 덧셈 기호로 문자열 이어 붙이기 가능

        int len = chicken.length();

        System.out.println(chicken);
        System.out.println(me);
        System.out.println(chickenAndMe);
        System.out.println(len);
        System.out.println(chicken.length());

        System.out.println(me.replaceAll("내가", "치킨이")); //replaceAll을 통해 문자열 내용 치환 가

        String birthday = "1970/01/01";
        String year = birthday.substring(0, 4); // .substring을 이용해 문자열의 원하는 부분을 잘라낼 수 있다
        String month = birthday.substring(5,7);
        String day = birthday.substring(8);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
