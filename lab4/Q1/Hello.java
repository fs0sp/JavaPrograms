import java.util.Scanner;

class Hello {
    public static void main(String args[]) {
        int a[] = new int[5];
        int i, num = 0;
        int avgValue = a.length;


        Scanner scan = new Scanner(System.in);

        for(i=0;i<a.length;i++) {
            a[i] = scan.nextInt();
        }

        for(i=0;i<a.length;i++) {
             num = num + a[i];
        }

        int avg  = num/avgValue;

        System.out.println("Average is : " + avg);
        
    }
}