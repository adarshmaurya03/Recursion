import java.util.*;
public class fibnacci{
            public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n =sc.nextInt();
        // System.out.println(0);
        // System.out.println(1);
        for(int i=0;i<n;i++){

        
       System.out.print( fibnacciseries(i)+" ");
        }
sc.close();    }
public static int   fibnacciseries(int n){
  if(n==0){
    return 0;
  }else if(n==1){
    return 1;
  }
  else{
    return fibnacciseries(n-1)+fibnacciseries(n-2);
  }


}

}