public class RunoobTest {
    private int instanceVar;   //成员变量
    private  static int staticVar;  //静态变量
    public void method(int paramVar){
        int localVar = 10; //局部变量

        //使用变量
        instanceVar = localVar;
        staticVar = paramVar;

        System.out.println("成员变量 : "+ instanceVar);
        System.out.println("静态变量 : "+ staticVar);
        System.out.println("参数变量 : "+ paramVar);
        System.out.println("局部变量 : "+ localVar);

    }

    public static void main(String[] args){
        RunoobTest v = new RunoobTest();
        v.method(20);
    }
}
