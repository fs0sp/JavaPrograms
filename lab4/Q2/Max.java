import java.util.Scanner;

class Max {
    public static void main(String args[]) {
        int i;
        int arr[] = new int[5];

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the array values");

        for(i=0;i<arr.length;i++) {
            arr[i] = scan.nextInt();
        }

       int maxValue = getMax(arr);
       int minValue =  getMin(arr);


       System.out.println("Max value : " + maxValue + "Min value : " + minValue);

    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max ) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];

        for(int i=0;i<arr.length;i++) {
            if(arr[i] < min ) {
                min = arr[i];
            }
        }

        return min;
    }

}