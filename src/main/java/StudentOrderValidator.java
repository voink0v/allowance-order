public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    public static void checkAll(){
        checkCitiRegister();
        checkWedding();
        checkChildren();
        checkStudent();
    }

    public static void checkCitiRegister(){
        System.out.println("CityRegister is running");
    }

    public static void checkWedding(){
        System.out.println("Wedding is running");
    }

    public static void checkChildren(){
        System.out.println("Children Check is running");
    }

    public static void checkStudent(){
        System.out.println("Студенты проверяются ");
    }
}
