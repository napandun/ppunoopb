

package chap4;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name :");
        String name = sc.next ();
        System.out.println("name is "+name);
        
       System.out.print ("Enter age :");
       int age = sc.nextInt();
       System.out.println("Age :"+age);
         if (age <= 11) {
            System.out.println("Age = BaBY ");
        } else if (age <= 20){
             System.out.println("Age = Teen");
        } else if (age <= 40){
             System.out.println("Age = Adult");
        } else if (age <= 60){
             System.out.println("Age = old");
        } else if (age <= 65){
             System.out.println("Age = Older");
        }
       System.out.print("Enter salary :");
       double salary = sc.nextDouble();
       
        System.out.print("degree\n"
                + "Bachelor Degrees Press 1\n"
                + "Master Degrees Press 2\n "
                + "Doctor Degrees press 3\n"
                + "Other Press 4\n");
       int End =sc.nextInt();
        System.out.println("degree :"+End);
        switch (End){
            case 1:
                System.out.println("Bachelor Degrees");
               break;
            case 2 :
                System.out.println("Master Degrees ");
                break;
            case 3 :
                System.out.println("Doctor Degrees");
                break;
            case 4 :
                System.out.println("Other");
        }
        
        
       System.out.print("Employee name :"+name);
       System.out.println(",age :"+age+",salary : "+salary);
       
    }

}
