package WfriteFromUser;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteUser {

    public static void main(String[] args) {
        int id;
        String name;
        try {
            Formatter f = new Formatter("C:\\Users\\ASUS\\Desktop\\File2\\f\\hap.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("number of student : ");
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("enter the details of " + (i+1) +" num student : ");
                id = input.nextInt();
                name = input.next();

                f.format("%d %s\r\n", id, name);

            }
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("exception"+e);
        }

    }
}
