
public class GraduateStudent extends Student {

    @Override
    public void payment() {
        System.out.println("payment by credit");
    }

    private String studyLevel;
    private String thesisAdvisor;

    public void oralExamination() {
        System.out.println("oralExamination");
    }

    public void thesisExamination() {
        System.out.println("thesisExamination");
    }
}// end class
