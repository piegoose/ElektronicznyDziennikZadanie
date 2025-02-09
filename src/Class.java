import java.util.*;

public class Class {
    // 1 pola
   public static HashMap<String, List<Student>> studentClasses = new LinkedHashMap<>();

   public static void setStudentClasses(HashMap<String, List<Student>> studentClasses) {

   }



    // 3 Metody

    public static void assingStudentToClass(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ktorego Studenta chcesz dodac do klasy?");
        String studentName = scanner.nextLine();
        System.out.println("Do jakiej klasy chcesz dodac studenta?");
        String className = scanner.nextLine();




        studentClasses.put(scanner.nextLine(), Student.studentsList);

    }















////    public static void studentAdd(Scanner scanner, List<String> studentList) {
////        System.out.println("Podaj imie i nazwisko studenta: ");
////        Student.name = scanner.nextLine();
////
////    }
//    public static void sigingIN(int studentCount, Scanner scanner, List<String> studentList) {
//        String studentPD;
//        for (int i = 0; i < studentCount; i++) {
//            System.out.print("Podaj imie i nazwisko studenta: ");
//            studentPD = scanner.nextLine();
//            studentList.add(studentPD);                             // zapisywanie danych studenta do listy
//        }
//    }
//    public static void selectClassA(Scanner scanner, Map<String, List<String>> studentClasses) {
//        System.out.println("Podaj imie i nazwisko studenta ktory ma byc dodany do klasy A: ");
//        String whichA = scanner.nextLine();
//        studentClasses.get("Klasa A").add(whichA);
//    }
//    public static void selectClassB(Scanner scanner, Map<String, List<String>> studentClasses) {
//        System.out.println("Podaj imie i nazwisko studenta ktory ma byc dodany do klasy B: ");
//        String whichB = scanner.nextLine();
//        studentClasses.get("Klasa B").add(whichB);
//    }
//    public static void deletingStudent(Scanner scanner, List<String> studentList) {
//        System.out.println("Podaj studenta ktory ma byc usuniety: ");
//        String personThrow = scanner.nextLine();
//        studentList.remove(personThrow);
//        System.out.println(studentList);
//    }

}