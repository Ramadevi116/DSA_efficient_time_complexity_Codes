import java.util.*;
class LCM{
        static int lcm(int a,int b){
            int res=Math.max(a,b);
            while(true){
                if(res%a==0 && res%b==0){
                    break;
                }
                res++;
            }
        return res;
        }
    
     public static void main(String[] args){
         Scanner in=new Scanner(System.in);
         int n1=in.nextInt();
         int n2=in.nextInt();
         System.out.println(lcm(n1,n2));
     }
}