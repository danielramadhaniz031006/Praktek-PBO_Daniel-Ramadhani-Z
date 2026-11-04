package Jobsheet10;

public class Tester2_percobaan2 {
    public static void main(String[] args) {
        RegularStudent rStd = new RegularStudent("Rina", 400);
        Student s;
        s = rStd;

        System.out.println("" + s.getStudentInfo());
        System.out.println("--------------------");
        System.out.println("" + rStd.getStudentInfo());
    }
}
