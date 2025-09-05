package DynamicProgramming.Fibonacii.Recursion;

public class fibMemoize {
    static int fib(int x, int[] dp){
        if(x==0 || x==1){  //Base Case
            return x;
        }

        if(dp[x]!=0){ // step3
            return dp[x];
        }

        dp[x] =  fib(x-1, dp) + fib(x-2, dp); // step2
        return dp[x];// Recursive Case
    }

    public static void main(String[] args) {
        int n = 100;
        int[] dp = new int[n+1]; // step1
        for(int i=0; i<n; i++){
            System.out.print(fib(i, dp) + " ");
        }
    }
}
