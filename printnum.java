import java.util.*;
public class printnum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n =sc.nextInt();
        num(n);
sc.close();
    }
    public static void num(int n){
        if(n>0){
               num(n-1);
            System.out.print(n);
         
        }else return ;
    }
}