public class Puppy {
    public Puppy(){

    }
    public Puppy(String name){
        //这个构造器只有一个参数name
        System.out.println("name is : " + name);
    }
    public static void main(String[] args){
        //创建一个Puppy对象
        Puppy myPuppy = new Puppy("tommy");
    }
}
