public class NumberFloat {
    public static void main(String[] args) {
        float floatnumber = 1.2f;  // float 형을 선언할 때에는 숫자 뒤에 f를 붙여줘야 함
        double doubleNumber = 3.5;

        System.out.println(floatnumber);
        System.out.println(doubleNumber);

        float floatSum = 0.001f + 0.001f + 0.0001f; // 0.0021로 나와야 함
        System.out.println(floatSum);               // 그러나 자바의 실수형 연산은 정확하지 못함
                                                    // 때문에 정수형으로 연산한 후 나눗셈으로 실수형을 만들어주는 경우가 많음
    }
}
