package all_java;
import java.io.*;
public class BufferExample {
    public static void main(String args[]) throws IOException{
        System.out.print("\033c");
        
        // BufferedWriter 
       /* FileWriter fw = new FileWriter("name.txt",true);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("Hello All");
        System.out.println("Writen Successfully!!!");
        bf.close();*/

        // BufferedReader
        FileReader fr = new FileReader("name.txt");
        BufferedReader br = new BufferedReader(fr);
        /*int ch;
        while((ch=br.read())!= -1){
            System.out.print((char)ch);
        }*/ 

        // Use of readLine() function
        /*String s;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }*/

        // Use of int read(char []ch,int index,int len)
        char[] ch = new char[20];
        br.read(ch,0,6);
        System.out.print(ch);
        br.close();
    }
}
