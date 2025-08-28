public class StringApp {
    static void Personal_info(String name, int VANO, int age) {
        System.out.println("name:" +name );
        System.out.println("VANO:" +VANO );
        System.out.println("age:" +age);
    }

    static void College_info(String collegename, String dept, int college_id) {
        System.out.println("collegename:" +collegename );
        System.out.println("dept:" +dept );
        System.out.println("college_id:" +college_id);
    }

    public static void main(String[] args) {
        Personal_info("sanjay", 6311, 20);
        College_info("Veltech ranga sanku arts", "B.sc", 1453);
    }
}

