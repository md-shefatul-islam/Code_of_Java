package filewrite;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileWrite {


    public static void main(String[] args) {
        
        try{
            Formatter w= new Formatter("C:\\Users\\ASUS\\Desktop\\File2\\f\\gap.txt");
        w.format("%d %s\r\n",101,"A");
        w.format("%f %d\r\n",10.2,100);
        w.format("%s %s\r\n","103","C");
        w.format("%s %.1f\r\n","104",123.4);
        
        w.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("exception"+e); 
        }
    }
    
}
