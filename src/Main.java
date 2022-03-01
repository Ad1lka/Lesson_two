public class Main {

    public static void main(String[] args) {
        System.out.println(checkValue(3, 15));
    }

    public static boolean checkValue(int a, int b){
       int sum = a + b;
        return 10 < sum && sum <= 20;
    }

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static boolean returnBoolean(int a) {
        return a <= 0;
    }

    public static void writeStringNTimes(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0) && (year % 100) != 0 && (year % 400) == 0;
    }
}
