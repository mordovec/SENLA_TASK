import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Please enter N");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean check = true;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i<=n; i++){
            if (i == 1){
                list.add(i);
                continue;
            }
            for (Integer j: list
                 ) {
                if (j!= 1 && i%j == 0){
                    check = false;
                    break;
                }
            }
            if (check == true){
                list.add(i);
            }
            check = true;
        }
        for (Integer res: list
             ) {
            System.out.println(res);
        }
    }
}
