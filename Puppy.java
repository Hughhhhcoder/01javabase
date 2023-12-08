public class Puppy {
    int puppyAge;
    public Puppy(){

    }
    public Puppy(String name){
        //这个构造器只有一个参数name
        System.out.println("name is : " + name);
    }
    public void setAge(int age){
        puppyAge = age;
    }
    public int getAge(){
        System.out.println("Age is : " + puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        //创建一个Puppy对象
        Puppy myPuppy = new Puppy("tommy");
        //通过方法来设定age
        myPuppy.setAge(2);
        //调用另一个方法获取age
        myPuppy.getAge();
    }
}
