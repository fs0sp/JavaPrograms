import java.util.*;

class MyNumber {

    private int num;


    /* Constructer to initialize */

    MyNumber() {
        num = 0;
    }

    MyNumber(int x) {
        num = x;
    }

    void isNegative() {
        if(num < 0) {
            System.out.println("Number is Negative");
        }
    }

    void isPositive() {
        if(num > 0) {
            System.out.println("Number is Positive");
        }

    }

    void isZero() {
        if(num == 0) {
            System.out.println("Number is ZERO");
        }

    }

    void isOdd() {
        if((num % 2)!= 0) {
            System.out.println("Number is Odd");
        }

    }

    void isEven() {
        if(num % 2 == 0) {
            System.out.println("Number is Even");
        }

    }

}

class Demo {
    public static void main(String args[]){

        int val;

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a number : ");
        val = scan.nextInt();

        MyNumber number = new MyNumber(val);

        number.isNegative();
        number.isPositive();
        number.isOdd();
        number.isEven();
        number.isZero();


    }
}