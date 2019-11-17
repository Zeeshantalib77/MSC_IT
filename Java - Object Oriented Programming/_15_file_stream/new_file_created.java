package _15_file_stream;

import java.io.File;
import java.io.IOException;

public class new_file_created {

    public static void main(String[] args) {
        try {
            File file = new File("javaFile123.txt");
            System.out.println(file);
            System.out.println("Length ="+file.length());
            System.out.println("File name :" + file.getName());
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path:" + file.getAbsolutePath());
            System.out.println("Parent:" + file.getParent());
            System.out.println("Exists :" + file.exists());
            System.out.println("Is writeable:"+file.canWrite()); 
            System.out.println("Is readable"+file.canRead());
            
            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
