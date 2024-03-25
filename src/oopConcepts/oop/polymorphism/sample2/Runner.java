package oopConcepts.oop.polymorphism.sample2;

public class Runner {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "Ogrenci";
        std1.age = 18;
        std1.phoneNumber = "0000";

        Teacher teacher1 = new Teacher();
        teacher1.name = "Mirac";
        teacher1.age = 41;
        teacher1.phoneNumber = "111";

        printInfoForStudents(std1);
        printInfoForTeacher(teacher1);

        System.out.println("---------------Aynı sonucu ");
        printForUser(teacher1);
        printForUser(std1);


    }

    public static void printInfoForStudents(Student std){
        System.out.println("name : " + std.name);
        System.out.println("age : " + std.age);
        System.out.println("phone-number : " + std.phoneNumber);
    }

    public static void printInfoForTeacher(Teacher teacher){
        System.out.println("name : " + teacher.name);
        System.out.println("age : " + teacher.age);
        System.out.println("phone-number : " + teacher.phoneNumber);
    }

    public static void printForUser(User user){
        System.out.println("name : " + user.name);
        System.out.println("age : " + user.age);
        System.out.println("phone-number : " + user.phoneNumber);
    }
}
