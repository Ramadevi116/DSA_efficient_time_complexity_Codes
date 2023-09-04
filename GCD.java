//Time Efficient
import java.util.*;
class GCD{
   static int gcd(int a,int b){
    while(a!=b){
    if(a>b){
        a=a-b;
    }else{
        b=b-a;
    }
    }
    return a;
    
   }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println(gcd(num1,num2));
    }
}
// Less Time efficient
import java.util.*;
class GCD{
   static int gcd(int a,int b){
    while(a!=0 && b!=0){
    if(a>b){
        a=a%b;
    }else{
        b=b%a;
    }
    }
    if(a!=0){
         return a;
    }else{
        return b;
    }
    
   }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println(gcd(num1,num2));
    }
}