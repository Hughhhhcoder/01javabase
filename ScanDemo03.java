import java.util.Scanner;
public class ScanDemo03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.println("输入整数： ");
        if (scan.hasNextInt()){
            //判断输入是否为整数；
            i= scan.nextInt();
            //接收整数
            System.out.println("整数数据："+i);
        }else{
            //输入错误的信息
            System.out.println("Err");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {
            // 判断输入的是否是小数
            f = scan.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }
}