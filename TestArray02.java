public class TestArray02 {
    public static void main(String[] args){
        double[] myList = {1.9, 2.9, 3.4, 3.5};
// 打印所有数组元素
for (int i = 0;i<myList.length;i++){
    System.out.println(myList[i]);
}
//增强型for循环打印数组
        for (double element:myList){
            System.out.println(element);
        }
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i<myList.length; i++){
    total += myList[i];
}
System.out.println("total is: " + total);
        // 查找最大元素
        double Max = myList[0];
        for (int i = 0;i< myList.length;i++){
            if(myList[i]>Max) Max = myList[i];
        }
        System.out.println("Max is: " +Max);
    }
}
