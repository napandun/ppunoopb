
public class callstudent {
    
    public static void main(String[] args) {
        System.out.println("Napan");
        Student napan = new Student();
        System.out.println(">>" + napan );
        napan.enrollment();
        napan.payment();
        napan.addCourse();
        napan.dropCourse();
        
        System.out.println("==================");
        System.out.println("Yaya");
        GraduateStudent yaya = new GraduateStudent();
        yaya.enrollment();
        yaya.addCourse();
        yaya.dropCourse();
        yaya.payment();
        yaya.oralExamination();
        yaya.thesisExamination();
    }
}// end class
