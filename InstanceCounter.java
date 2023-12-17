public class InstanceCounter {
private static int numInstance = 0;
protected static int getCount(){
    return numInstance;
}
   private static void addInstance(){
    numInstance++;
   }
   InstanceCounter(){
    InstanceCounter.addInstance();
   }
public static void main(String[] args){
    System.out.println("初始值为： "+InstanceCounter.getCount());
    for (int i = 0;i<500;i++){
        new InstanceCounter();
    }
    System.out.println("create is " +InstanceCounter.getCount());
}
}
