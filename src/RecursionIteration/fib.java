package RecursionIteration;

// Recursion
public class fib {
    static int fib(int x){
        if(x==0 || x==1){  //Base Case
            return x;
        }
        return fib(x-1) + fib(x-2); // Recursive Case
    }

    public static void main(String[] args) {
        int n = 100;
        for(int i=0; i<n; i++){
            System.out.print(fib(i) + " ");
        }
    }
}
