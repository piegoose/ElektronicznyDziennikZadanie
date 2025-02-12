import java.sql.SQLOutput;
import java.util.*;

public class Class {
    // 1 pola
    public static HashMap<String, List<Student>> studentClasses = new LinkedHashMap<>();

    public static void setStudentClasses(HashMap<String, List<Student>> studentClasses) {

    }


    // 3 Metody

    public static void createClass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile klas chcesz utworzyc?");
        int classNum = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < classNum; i++) {
            System.out.println("Podaj nazwe klasy: ");
            String input = sc.nextLine();
            studentClasses.put(input, new ArrayList<>());
        }
        System.out.println(studentClasses);
    }

    public static void assignStudentToClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Którego studenta chcesz dodać do klasy?");
        String studentName = scanner.nextLine();
        Student foundStudent = findStudentByName(studentName);
        if (studentCheck(foundStudent)) return;
        System.out.println("Do jakiej klasy chcesz dodać studenta?");
        String studentClass = scanner.nextLine();
        addingStudent(studentClass);
        studentClasses.get(studentClass).add(foundStudent);
        System.out.println("Dodano studenta " + foundStudent.getName() + " do klasy " + studentClass);
    }

    public static void classDisplay(){
        System.out.println(studentClasses);
    }


    /// Metody pomocnicze

    private static void addingStudent(String studentClass) {
        if (!studentClasses.containsKey(studentClass)) {
            studentClasses.put(studentClass, new ArrayList<>());
        }
    }


    private static boolean studentCheck(Student foundStudent) {
        if (foundStudent == null) {
            System.out.println("Student o podanym imieniu nie istnieje!");
            return true;
        }
        return false;
    }

    private static Student findStudentByName(String studentName) {
        for (Student s : Student.studentsList) {
            if (s.getName().equalsIgnoreCase(studentName)) {
                return s;
            }
        }
        return null;
    }


}