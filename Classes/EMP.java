// get sal
// get sal
// name
// get name 
// set name 
import java.util.*;
class Employee
{
     String name;
     double sal;
     Employee(String name,double sal)
     {
        this.name=name;
        this.sal=sal;
     }
     String getName()
     {
        return name;

     }
     double getSal()
     {
        return sal;

     }
     void setName(String name)
     {
         this.name=name;

     }
      void setSal(double sal)
      {
        this.sal=sal;

      }

 }   
 public class EMP 
 {
    public static void main(String args[])
    {
      System.out.println("Enter emp name");
      Scanner sc=new Scanner(System.in);

      String name=sc.nextLine();
      System.out.println("Enter emp sal");   
      double sal=sc.nextDouble();

      Employee e=new Employee(name,sal);
      System.out.println("Emp name is "+e.getName());
      System.out.println("Emp sal is "+e.getSal());
      
    }
 } 

