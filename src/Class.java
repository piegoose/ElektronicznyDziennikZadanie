import java.util.*;

// pola raczej prywatne i nie statyczne uzywamy getterow setterow, metody zazwczyaj sa publiczne nie statyczne
// static to sie odnisi i dzieli dla wszyskich, pensja, wspoldzielony kontekst

public class Class {
    // 1 pola
    private  HashMap<String, List<Student>> studentClasses = new LinkedHashMap<>();
    //konstruktory

    // 3 Metody
/// static

    public   void createClass() {
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

    public  void assignStudentToClass(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Którego studenta chcesz dodać do klasy?");
        String studentName = scanner.nextLine();
        Student foundStudent = findStudentByName(studentName, student);
        if (studentCheck(foundStudent)){
            return;
        }
        System.out.println("Do jakiej klasy chcesz dodać studenta?");
        String studentClass = scanner.nextLine();
        addingStudent(studentClass);
        studentClasses.get(studentClass).add(foundStudent);
        System.out.println("Dodano studenta " + foundStudent.getName() + " do klasy " + studentClass);
    }



    public  void classDisplay(){
        System.out.println(studentClasses);
    }

    /// Metody pomocnicze

    private  void addingStudent(String studentClass) {
        if (!studentClasses.containsKey(studentClass)) {
            studentClasses.put(studentClass, new ArrayList<>());
        }
    }


    private  boolean studentCheck(Student foundStudent) {
        if (foundStudent == null) {
            System.out.println("Student o podanym imieniu nie istnieje!");
            return true;
        }
        return false;
    }

    private Student findStudentByName(String studentName, Student student) {
        for (Student s : student.getStudentsList()) {  // Teraz używamy instancji Student
            if (s.getName().equalsIgnoreCase(studentName)) {
                return s;
            }
        }
        return null;
    }


}