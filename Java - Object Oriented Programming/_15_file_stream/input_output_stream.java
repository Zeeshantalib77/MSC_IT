package _15_file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class input_output_stream {

    public static void main(String[] args) {
        file_write_input();
        file_read_ouput();
    }

    static void file_write_input() {
        try {
            FileOutputStream fout = new FileOutputStream("E:\\zee.txt"); // E:\\zee.txt
            //fout.write(20);
            String s = "Welcome Zeeshan";
            byte b[] = s.getBytes();//converting string into byte array    
            fout.write(b);
            fout.close();
            System.out.println("success.......");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void file_read_ouput() {
        try {
            FileInputStream fin = new FileInputStream("E:\\zee.txt");
            //int i = fin.read();
            //System.out.print((char) i); // read single character
            int i=0;    
            while((i=fin.read())!=-1) // read all chracters
            {    
             System.out.print((char)i);    
            }    
            fin.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
Java uses the concept of a stream to make I/O operation fast. 
The java.io package contains all the classes required for input and output operations.

OutputStream
Java application uses an output stream to write data to a destination; 
it may be a file, an array, peripheral device or socket.

InputStream
Java application uses an input stream to read data from a source; 
it may be a file, an array, peripheral device or socket.
 */
