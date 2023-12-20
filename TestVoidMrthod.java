public class TestVoidMrthod {
    public static void printGrade(double score){
        if (score >= 90){
            System.out.println("A");

        }

        else if (score >= 80){
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else{
            System.out.println("shit");
        }
    }
    public static void main(String[] args){
        printGrade(60);
    }
}
