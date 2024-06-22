import java.util.*;
public class findlastoccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter key");
        int k = sc.nextInt();
      
        int arr[] = { 1, 2, 3, 4, 5, 6, 3, 5, 2, 7, 8 };

        System.out.print(findlastoccurances(arr, k, 0));
        sc.close();
    }
    public static int findlastoccurances(int arr[],int k, int i){
if(i<0){
    return -1;
}
        if(arr[arr.length-i-1]==k){
    return arr.length-1-i;
}
else{
    i=i-1;
    return findlastoccurances(arr, k, i);
}
    }
}
