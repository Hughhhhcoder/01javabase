import java.util.Scanner;
public class ScannerDemo02 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scan = new Scanner(System.in);

        System.out.println("用nextLine方法接收");

        if(scan.hasNextLine()){
            String str2 = scan.nextLine();
            System.out.println("接收到的数据为 ： " + str2);
        }
    }
}
