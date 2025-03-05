import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher {

    private  String name;
    private  int age;
    private  String subject;
    private static List<Teacher> teacherList = new ArrayList<>();

    public Teacher() {
    }

    @Override
    public String toString() {
        return name + " " + age + " " + subject;
    }

    public Teacher(String subject, int age, String name) {
        this.subject = subject;
        this.age = age;
        this.name = name;

    }

    public void setTeacher(Teacher teacher) {
        teacherList.add(teacher);
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
