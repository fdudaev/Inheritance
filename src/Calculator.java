public class Calculator {
    public static void main(String[] args) {
        printSum(4, 5);
        printHi();
        Calculator.printSum(7,2);
    }
    public static void printSum(int a, int b){
        System.out.println("sum = "+(a+b));
    }
    public static void printHi(){
        System.out.println("Hi");
    }
}
