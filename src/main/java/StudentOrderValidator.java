public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    public static void checkAll() {
        StudentOrder so = readStudentOrder();

        checkCitiRegister(so);
        checkWedding(so);
        checkChildren(so);
        checkStudent(so);

        sendMail(so);

    }

    public static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    public static void checkCitiRegister(StudentOrder so) {
        System.out.println("CityRegister is running");
    }

    public static void checkWedding(StudentOrder so) {
        System.out.println("Wedding is running");
    }

    public static void checkChildren(StudentOrder so) {
        System.out.println("Children Check is running");
    }

    public static void checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются ");
    }

    public static void sendMail(StudentOrder so){

    }
}
