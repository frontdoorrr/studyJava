public class MethodEx {
    public static void main(String[] args) {
        sayHello();
        sayHelloTo("바보");
        printSum(3,5);
        System.out.println(sum(4,5));
        int[] sumAndProduct = addAndMultiply(3,5);
        System.out.println(sumAndProduct[0]);

    }
    // 두 정수를 더한 값과 곱한 값을 반환
    public static int[] addAndMultiply(int a, int b){
        int sum = a + b;
        int product = a * b;

        int[] result = {sum, product};
        return result;
    }
    // 두 정수를 더한 값 반환
    public static int sum(int a, int b){
        return a + b;
    }
    // 두 정수를 더한 값 출력
    public static void printSum(int a, int b){
        System.out.println(a + b);
    }
    // Hello + 이름 출력
    public static void sayHelloTo(String name){
        if (name.equals("바보")){
            System.out.println("바른 말을 사용해주세요.");
            return;                                     // return을 이용해 루프 중간에 빠져나올 수 있음
        }
            System.out.println("Hello " + name);

    }
    // Hello 출력
    public static void sayHello(){
        System.out.println("Hello");
    }
}
