package IOJava.Java70RenameMoveCopy;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java70RenameMoveCopy {
    public static void main(String[] args) {
        Path path = Paths.get("IOJava","Java70RenameMoveCopy","xyz.yml");
        Path path1 = Paths.get("abc.txt");

        File f0 = new File(String.valueOf(path));
        File f1 = new File(String.valueOf(path1));
        System.out.println(f0.exists());
        System.out.println(f1.exists());
    }

    public static void copyFile(File f1, File f2){

    }
}
