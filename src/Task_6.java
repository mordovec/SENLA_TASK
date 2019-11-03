import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = true;
        System.out.println("Enter your string");
        String in = scanner.nextLine();
        String out = "";
        for (int i = 0; i<in.length(); i++){
            String target = in.substring(i, i+1);
            try{
                Integer.parseInt(target);
            }catch (NumberFormatException e){
                out= out+target;
            }
        }
        System.out.println(out);
    }
}
