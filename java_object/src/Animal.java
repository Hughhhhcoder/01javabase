public class Animal {
        private String name;
        private int id;
        public  Animal(String myname, int myid){
            name = myname;
            id = myid;
    }
    public void eat(){
            System.out.println("eating");
    }
    public void sleep(){
            System.out.println("sleeping");
    }
    public void introduction(){
            System.out.println("hello i am "+id+name);
    }
}

