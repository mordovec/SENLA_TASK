import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
    System.out.println("Please enter N");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int i = 0;
    while (i<=n){
        System.out.println(f(i));
        i++;
    }

}
    public static int f(int n)  {
    if(n == 0)
        return 0;
    else if(n == 1)
        return 1;
    else
        return f(n - 1) + f(n - 2);
}



}
