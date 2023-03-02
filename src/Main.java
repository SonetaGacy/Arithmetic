public class Main {
    public static int num1 = 2;
    public static int num2 = 4;
    public static void main(String[] args) {
        sum();
        productOfNumbers();
        maxNumber();
        minNumber();
    }

    public static void sum(){
        int sum = num1 + num2;
        System.out.println("Сумма чисел равна : " + sum);
    }

    public static void productOfNumbers(){
        int prod = num1 * num2;
        System.out.println("Произведение чисел равно : " + prod);
    }

    public static void maxNumber(){
        if (num1 > num2){
            System.out.println("Максимальное число : " + num1);
        } else if (num2 > num1) {
            System.out.println("Максимальное число : " + num2);
        } else {
            System.out.println("Числа равны");
        }
    }

    public static void minNumber(){
        if (num1 < num2){
            System.out.println("Минимальное число : " + num1);
        } else if (num2 < num1) {
            System.out.println("Минимальное число : " + num2);
        } else {
            System.out.println("Числа равны");
        }
    }
}