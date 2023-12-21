import java.io.*;
public class fileStreamTest02 {
    public static void main(String[] args) throws IOException{
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f); //构建FileOutputStream对象，文件不存在会自动新建

        OutputStreamWriter write = new OutputStreamWriter(fop,"UTF-8");
        //构建OutputStreamWrite对象，其参数可以指定编码

        write.append("中文输入");  //写到缓冲区

        write.append("\r\n");    //换行

        write.append("English");
        //刷新缓存冲，写入到文件，如果下面已经没有内容写入了直接close也会写入

        fop.close();  //关闭输出流，释放系统资源

        FileInputStream fip = new FileInputStream(f);
//        构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip,"UTF-8");

        StringBuffer sb = new StringBuffer();
        while(reader.ready()) {
            sb.append((char) reader.read());
            //转成char转到StringBuffer中
        }
        System.out.println(sb.toString());
        reader.close();
        //关闭读取流

        fip.close();
        //关闭输入流，释放系统资源

    }


}
