public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(Tilingproblem(5));
    }
    public static int Tilingproblem(int n){
        if(n==1||n==0){
            return 1;
        }
        //vartical 
    int var=Tilingproblem(n-1);

    //horiZantal
    int hor=Tilingproblem(n-2);
return var+hor;

    }
}
