import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher {

    private String name;
    private int age;
    private String subject;
    private final List<Teacher> teacherList = new ArrayList<>();

    public Teacher() {

    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }


    private String getTeacherName() {
        return name;
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


    public void addTeacher(Scanner scanner) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko nauczyciela: ");
        String name = scanner.nextLine();
        System.out.println("Podaj wiek nauczyciela: ");
        int age = scanner.nextInt();
        System.out.println("Podaj jakiego przedmiotu uczy: ");
        String subject = scanner.next();
        teacherList.add(new Teacher(name, age, subject));

    }

    public void removeTeacher(Scanner scanner) { //nie dziala
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko nauczyciela: ");
        String teacherName = sc.nextLine();
        teacherList.remove(teacherName);
    }

}