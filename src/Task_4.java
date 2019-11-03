import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a");
        int x = scanner.nextInt();
        System.out.println("Enter number b");
        int y = scanner.nextInt();
        int k;
        k = y;
        if (x<y){
             y=x; x=k;
        }

        System.out.println("NOD = "+nod(x, y, k));
        k=x;
        System.out.println("NOK = "+nok(x, y, k));


    }
    static int nod(int x, int y, int k){
        if (k==1){
            return k;
        } else{
            if (x % k == 0 && y % k==0){
                return k;
            } else {
                return nod(x, y, k-1);
            }
        }


    }
    static int nok(int x, int y, int k){
        if (k == y*x){
            return k;
        }else {
            if (k % x == 0 && k % y==0){
                return k;
            } else {
                return nok(x, y, k+1);
            }
        }
    }

}
