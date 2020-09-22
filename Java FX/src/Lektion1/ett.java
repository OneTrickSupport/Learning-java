package Lektion1;

public class ett {
    private static int power(int x, int n){
        if(n > 0){
           return x * power(x, n-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(3, 4));
        System.out.println(power(3,4));
    }
}
