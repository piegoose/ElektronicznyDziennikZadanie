import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        Class class1 = new Class();
        Teacher teacher = new Teacher();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println(" ---- WITAJ W ELEKTROCZNICZNYM DZIENNNIKU --- ");
        System.out.println("");
        boolean running = true;
        while (running) {
            MenuLauncher.menuLaunch();
            Student instantStudent = new Student("Jedrzej Sikora",4);
            class1.setStudentsList(instantStudent);
            Teacher instantTeacher = new Teacher("Angielski",30,"Marek Mostowiak");
            teacher.setTeacher(instantTeacher);

            switch (scanner.nextInt()) {
                case 1 -> System.out.println(class1.getStudentsList()); ///
                case 2 -> class1.studentAddToList(scanner);  ///
                case 3 -> class1.studentRemoveFromList(scanner);
                case 4 -> Teacher.addTeacher(scanner);
                case 5 -> Teacher.removeTeacher(scanner);
              //  case 6 -> //System.out.println(teacher.teacherList);
                case 7 -> {
                    class1.createClass(); /// dziala
                    class1.assignStudentToClass();
                }
                case 8 -> class1.classDisplay();// wypisanie klas
                case 9 -> {
                    running = false;
                    System.out.println("Zamykanie ..");

                }
            }

        }
    }
}
