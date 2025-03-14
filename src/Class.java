import java.util.*;


public class Class {

    private final HashMap<String, List<Student>> studentClasses = new LinkedHashMap<>();
    private final List<Student> studentsList = new ArrayList<>();


    public void studentAddToList(Scanner scanner) {
        scanner.skip("\n");
        System.out.println("Podaj imie i nazwisko studenta:");
        String name = scanner.nextLine();
        System.out.println("Podaj ocene koncowa studenta: ");
        double grade = scanner.nextDouble();
        studentsList.add(new Student(name, grade));
    }


    public void createClass() {
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

    public void assignStudentToClass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Którego studenta chcesz dodać do klasy?");
        String studentName = sc.nextLine();
        Student foundStudent = findStudentByName(studentName);
        if (studentCheck(foundStudent)) {
            return;
        }
        System.out.println("Do jakiej klasy chcesz dodać studenta?");
        String studentClass = sc.nextLine();
        addingStudent(studentClass);
        studentClasses.get(studentClass).add(foundStudent);
        System.out.println("Dodano studenta " + foundStudent.getName() + " do klasy " + studentClass);
    }


    public void studentRemoveFromList(Scanner scanner) {
        scanner.skip("\n");
        System.out.print("Nazwa studenta: ");
        String name = scanner.nextLine();
        studentsList.remove(findStudentByName(name));

    }

    public void setStudentsList(Student student) {
        studentsList.add(student);
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void classDisplay() {
        System.out.println(studentClasses);
    }

    /// Metody pomocnicze

    private void addingStudent(String studentClass) {
        if (!studentClasses.containsKey(studentClass)) {
            studentClasses.put(studentClass, new ArrayList<>());
        }
    }

    // unchecked
    private boolean studentCheck(Student foundStudent) {
        if (foundStudent == null) {
            System.out.println("Student o podanym imieniu nie istnieje!");
            return true;
        }
        return false;
    }


    private Student findStudentByName(String studentName) {
        for (Student s : studentsList) {
            if (s.getName().equals(studentName)) {
                return s;
            }
        }
        return null;
    }


}