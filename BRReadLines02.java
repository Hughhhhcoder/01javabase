import java.io.*;
public class BRReadLines02 {
    public static void main(String[] args) throws IOException{
        //use System.in to create BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit");
        do {
            str = br.readLine();
            System.out.println(str);


        }while (!str.equals("end"));
    }
}
