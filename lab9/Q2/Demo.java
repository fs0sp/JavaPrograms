import java.lang.*;
import java.util.Scanner;

class Demo {

    public static void main(String args[]) {

        int a,b;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        try{
            

            if(b == 0) {
                throw new BisZeroExecption();
            }

            else {
                System.out.println(" Value is : " + a/b);
            }

        }

        catch(BisZeroExecption e1) {
            System.out.println(e1);
        }



    }

}

class BisZeroExecption extends Exception
{
    public String toString()
    {
        return("Value of B can't be zero");
    }
}
    