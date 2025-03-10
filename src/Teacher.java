import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
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
        scanner.skip("\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko nauczyciela: ");
        name = sc.nextLine();
        System.out.println("Podaj przedmiot jakiego uczy: ");
        subject = sc.nextLine();
        System.out.println("Podaj wiek nauczyciela: ");
        age = sc.nextInt();
        teacherList.add(new Teacher(subject, age, name));

    }

    public void removeTeacher(Scanner scanner) {
        scanner.skip("\n");
        System.out.println("Podaj jakiego nauczyicela chcesz usynac");
        String removeT = scanner.nextLine();
        teacherList.remove(findTeacherByName(removeT));

    }

    private Teacher findTeacherByName(String teacherName) {
        for (Teacher t : teacherList) {
            if (t.name.equals(teacherName)) {
                return t;
            }
        }
        return null;

    }


}