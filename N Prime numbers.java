import java.util.*;
class Prime{
    static void primeNum(int n){
        boolean[] prime=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(prime[i]==false){
            for(int j=i*i;j<=n;j=j+i){
                prime[j]=true;
            }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==false){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        primeNum(num);
    }
}
//Time complexity is : O(Sqrt(n)log(log(n)))