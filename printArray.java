import java.lang.reflect.Array;

public class printArray {
    public static void printArray(int[] array){
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    //数组作为返回值
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for (int i = 0,j = result.length - 1;i<list.length;i++,j--){
            result[j] = list[i];

        }
        return result;
    }
    public static void main(String[] args ){
        printArray(new int[]{0,1,2,3,4,5});
    }
}
