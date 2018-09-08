public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int a = 20;
        int b = 5;
        System.out.println(plus(a, b));
        System.out.println(minus(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));

    }

    static double plus(int a, int b){
        return a+b;
    }

    static double minus(int a, int b){
        return a-b;
    }

    static double multiply(int a, int b){
        return a*b;
    }

    static double divide(int a, int b){
        return a/b;
    }
}
