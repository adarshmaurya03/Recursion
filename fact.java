import java.util.*;
public class fact {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n =sc.nextInt();
        System.out.println(factorial(n));
sc.close();
    }

    public static int factorial(int n){
        int fact=0;
if(n==1){
    return 1;

}
else{
     fact=factorial(n-1)*n;
}

return fact;
    }
}
