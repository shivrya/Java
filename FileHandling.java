import java.io.File;


public class FileHandling {

    public static void main(String[] args) {

        File file = new File("/Users/shivrajkhose/Documents/VSCode_Projects/Java/abc.txt");

        System.out.println(file.canRead());  // return true if we have the permissions to read, else returns false
        System.out.println(file.canWrite()); // return true if we have the permissions to write, else returns false
        System.out.println(file.length());   // returns length of the file in bytes
        System.out.println(file.exists());   // returns true if file exists, else returns false
        
    }

}
