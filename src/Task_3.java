import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the coordinates of segment A");
        System.out.print("x1=");
        int ax1 = scanner.nextInt();
        System.out.print("y1=");
        int ay1 = scanner.nextInt();
        System.out.print("x2=");
        int ax2 = scanner.nextInt();
        System.out.print("y2=");
        int ay2 = scanner.nextInt();
        System.out.println("Please enter the coordinates of segment B");
        System.out.print("x1=");
        int bx1 = scanner.nextInt();
        System.out.print("y1=");
        int by1 = scanner.nextInt();
        System.out.print("x2=");
        int bx2 = scanner.nextInt();
        System.out.print("y2=");
        int by2 = scanner.nextInt();
        int v1 = (bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
        int v2 = (bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
        int v3 = (ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
        int v4 = (ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);
        if (v1*v2<0 && v3*v4<0){
            System.out.println("Line segments intersect");
        } else
        {
            System.out.println("Line segments do not intersect");
        }
    }
}
