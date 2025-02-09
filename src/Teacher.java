import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher {

    public  String name;
    public  int age;
    public  String subject;
    public static List<Teacher> teacherList = new ArrayList<>();

    @Override
    public String toString() {
        return name + " " + age + " " + subject;
    }

    public Teacher(String subject, int age, String name) {
        this.subject = subject;
        this.age = age;
        this.name = name;
    }

    public static void addTeacher(Scanner sc) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko nauczyciela: ");
        String name = scanner.nextLine();
        System.out.println("Podaj wiek nauczyciela: ");
        int age = scanner.nextInt();
        System.out.println("Podaj jakiego przedmiotu uczy: ");
        String subject = scanner.next();
        teacherList.add(new Teacher(name,age,subject));

    }
    public static void removeTeacher(Scanner sc) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko nauczyciela: ");
        teacherList.removeIf(teacher -> teacher.name.equals(scanner.nextLine()));
    }

}
