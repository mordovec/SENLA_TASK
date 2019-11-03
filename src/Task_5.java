import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = true;
        System.out.println("Enter your string");
        String s = scanner.nextLine();
        int i = s.length()-1;
        int j = 0;
        while (i>=0){
            if (s.charAt(i) != s.charAt(j)){
                result = false;
                break;
            }
            i--;
            j++;
        }
        if (result==true){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

    }
}
