public class SwitchCaseEx {
    public static void main(String[] args) {
        int month = 3;
        switch (month) {
            case 1 :
                System.out.println("January");           // case (조건):
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            default :
                System.out.println("번역할 수 없음");       // 케이스에 해당하지 않는 default의 경우를 항상 고려해준다.

        }
    }
}
