package Problem1;
public class Factorial {
    public static void main(String []args){
        int n=3;
        if(n<0)
        {
            System.out.println("Enter a positive Integer");
        }
            int result=fact(n);
            System.out.println("factorial of " +n+" is: "+result);
        }
        public static int fact(int n){
            if(n==1||n==0){
                return 1;
            }
            return n*fact(n-1);
        }
    }
