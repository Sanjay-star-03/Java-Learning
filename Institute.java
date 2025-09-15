public class Institute {
    String instu_name;
    String course_name;
    String stu_name;
    int fees;

    public static void main(String[] args) {
        Institute ins = new Institute();
        Institute info =new Institute();
        ins.instu_name = "vtrs";
        ins.course_name = "BSC(CS)";
        info.stu_name = "Sanjay S";
        System.out.println("Institute name: " + ins.instu_name);
        System.out.println("Course name: " + ins.course_name);
        System.out.println("Student name: " + info.stu_name);
    }
}
