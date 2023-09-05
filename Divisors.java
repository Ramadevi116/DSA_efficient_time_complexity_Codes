import java.util.*;
class Divisor{
    static void divisors(int n){
        int i=0;
        for(i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for( ;i>=1;i--){
            if(n%i==0 && i!=n/i){
            System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        divisors(num);
        
    }
}
//Time complexity is O(sqrt(n));