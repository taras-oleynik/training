import java.util.Scanner;

/**
 * Created by Taras_Oliinyk on 9/4/2018.
 */
public class Arr {




    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        int temp ;
        int j = 0;
        int k = 0;

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        j=n-1;
        while(k<j){

            temp = arr[k];
            arr[k]=arr[j] ;
            arr[j] = temp;
            k++;
            j--;
        }


        scanner.close();
    }

}
