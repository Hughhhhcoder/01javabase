
public class Test {
 public void PupAge(){
     int age = 0;
     age = age+7;
     System.out.println("age is :"+age);
 }
 public static void main(String[] args){
     Test test = new Test();
     test.PupAge();
     char grade = 'C';
     switch (grade) {
         case 'A':
             System.out.println("优秀");
             break;
         case 'B':
         case 'C':
             System.out.println("良好");
             break;
         case 'D':
             System.out.println("及格");
     }
 }
}


