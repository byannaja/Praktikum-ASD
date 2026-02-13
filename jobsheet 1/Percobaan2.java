import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        long nim;
        int n;
        
        System.out.print("Input NIM: ");
        nim = input.nextLong();
        
        n = (int)(nim % 100);
        
        if (n < 10) {
            n += 10;
        }
        
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            
            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
