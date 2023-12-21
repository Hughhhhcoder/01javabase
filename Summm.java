import java.util.Scanner;
public class Summm {
    public static void main(String[] args) {
        System.out.println("please enter numbles");
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int m = 0;
        while(scan.hasNextDouble()){
            double x = scan.nextDouble();
            m = m+1;
            sum = sum+x;

        }
        System.out.println("sum is:" + sum);
        System.out.println("arvage is:"+ (sum/m));
        scan.close();
    }
}
