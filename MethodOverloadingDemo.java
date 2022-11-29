public class MethodOverloadingDemo {

    public static void main(String[] args) {
        SimpleMultiplication num = new SimpleMultiplication();

        /* Calling functions */
        System.out.println(num.multiply(10, 20));
        System.out.println(num.multiply(10, 20, 30));

    }
}