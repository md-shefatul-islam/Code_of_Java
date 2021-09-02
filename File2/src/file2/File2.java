
package file2;
import java.io.File;

public class File2 {

    public static void main(String[] args) {
        
        File F=new File("f");
        F.mkdir();              //create folder
        String path=F.getAbsolutePath();
        
        File G=new File("C:\\Users\\ASUS\\Desktop\\File2\\f\\gap.txt");
        File H=new File(path+"\\ohap.txt");
        
        try{
            G.createNewFile();       //create file
            H.createNewFile();
            System.out.println("file created");
        }catch(Exception e)
        {
            System.out.println("exception"+e);
        }
        
        
    }
    
}
