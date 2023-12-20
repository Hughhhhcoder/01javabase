import java.io.*;
public class BRReadLines {
    public static void main(String[] args) throws IOException{
        char c;
        //use System.in to create BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter,if you want to exit please enter'q',");
        //Read characters
        do{
            c = (char) br.read();
            System.out.println(c);
        }while(c!='q');

    }

}
