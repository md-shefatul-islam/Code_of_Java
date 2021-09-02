package studentlist;
import java.util.LinkedList;
public class StudentList {

   
    public static void main(String[] args) {
       LinkedList<Student> StudentList= new LinkedList<Student>();
       
       Student s1= new Student("A",1);
       Student s2= new Student("B",2);
       Student s3= new Student("C",3);
       Student s4= new Student("D",4);
       
       //add all student to the list
       StudentList.add(s1);
       StudentList.add(s2);
       StudentList.add(s3);
       StudentList.add(s4);
       
       for(Student s : StudentList){
           
           System.out.println(s.id+"  "+s.name);
       }
    }
    
}
