import java.util.*;
public class sumNumber {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n =sc.nextInt();
        System.out.println(sum(n));
sc.close();
    }
    public static int sum(int n){
        int sum=0;
        if(n>0){
sum=sum+n+sum(n-1);
        }else{
            return 0;
        }
        return sum;
    }

}
