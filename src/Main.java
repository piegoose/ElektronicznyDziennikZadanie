import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        Class class1 = new Class();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println(" ---- WITAJ W ELEKTROCZNICZNYM DZIENNNIKU --- ");
        System.out.println("");
        boolean running = true;
        while (running) {
            MenuLauncher.menuLaunch();
            switch (scanner.nextInt()) {
                case 1 -> System.out.println(student.getStudentsList()); ///
                case 2 -> student.studentAddToList(scanner);  ///
                case 3 -> student.studentRemoveFromList(scanner);
                case 4 -> Teacher.addTeacher(scanner);
                case 5 -> Teacher.removeTeacher(scanner);
                case 6 -> System.out.println(Teacher.teacherList);
                case 7 -> {
                    class1.createClass(); /// dziala
                    class1.assignStudentToClass();
                }
                case 8 ->class1.classDisplay();// wypisanie klas
                case 9 -> {
                    running = false;
                    System.out.println("Zamykanie ..");

                }
            }

        }
    }
}
