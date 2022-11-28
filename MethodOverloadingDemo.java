public class MethodOverloadingDemo {
    void sum(int a, int b) {
        int s = a + b;
        System.out.println("Sum of two numbers: " + s);
    }
    // Method to calculate sum of three numbers.
    // Declare an instance method sum with three parameters a,b, and c having data
    // type int.
    // Here, the method sum() is overloaded having the same method name.

    void sum(int a, int b, int c) {
        int t = a + b + c;
        System.out.println("Sum of three numbers: " + t);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo m = new MethodOverloadingDemo();
        m.sum(10, 10);
        m.sum(10, 10, 80);

    }
}