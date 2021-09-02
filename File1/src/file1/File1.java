package file1;

import java.io.File;

public class File1 {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\ASUS\\Desktop\\p.t");

        f.mkdir();

        String path = f.getAbsolutePath();
        System.out.println(path);

        System.out.println(f.getName());

        if (f.delete()) {
            System.out.println(f.getName() + " folder has been deleted");

        }

    }
}
