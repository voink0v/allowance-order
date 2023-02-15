public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петровна";


        long ans = saveStudentOrder(so);
        System.out.println(ans);

    }

    public static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder" + studentOrder.hLastName);
        return answer;
    }
}
