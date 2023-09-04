import java.util.*;
class main{
    static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }else{
            return a;
        }
    }
    static int lcm(int n,int m){
        return (n*m)/gcd(n,m);
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println(lcm(num1,num2));
        
    }
}
