public class WrapperTypeEx {
    public static void main(String[] args) {
        Integer integerNum = 3 ;
        float floatNum = integerNum.floatValue(); // 3.0f
        double doubleNum = integerNum.doubleValue(); // 3.0d
        String stringNum = integerNum.toString(); // "3"

        System.out.println(integerNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(stringNum);

    }
}
