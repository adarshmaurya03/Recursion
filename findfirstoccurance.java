import java.util.*;

public class findfirstoccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter key");
        int k = sc.nextInt();
      
        int arr[] = { 1, 2, 3, 4, 5, 6, 3, 5, 2, 7, 8 };

        System.out.print(findoccurance(arr, k, 0));
        sc.close();
    }

    public static int findoccurance(int arr[], int k, int i) {
        
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == k) {

            return i;
        }
        
        return findoccurance(arr, k, ++i);
        
    }
}
