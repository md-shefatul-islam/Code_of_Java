
package filewrite1;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileWrite1 {

    public static void main(String[] args) {
        
         try{
            Formatter w= new Formatter("C:\\Users\\ASUS\\Desktop\\File2\\f\\gap.txt");
        w.format("%s %s","101","A");
        w.format("%s %s","102","B");
        w.format("%s %s","103","C");
        w.format("%s %s","104","D");
        
        w.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("exception"+e); 
        }
    }
    
}
