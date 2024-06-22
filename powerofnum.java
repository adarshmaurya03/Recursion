import java.util.*;
public class powerofnum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num & power");
        int n= sc.nextInt();
        int p= sc.nextInt();
      
        // int arr[] = { 1, 2, 3, 4, 5, 6, 3, 5, 2, 7, 8 };

        System.out.print(pow(n,p));
        sc.close();
    } 
    public static int pow(int n,int p){
int result=0;
if(p>0){
    result=n*pow(n,p-1);

}else{
return 1;
}
return result;
    }
}
