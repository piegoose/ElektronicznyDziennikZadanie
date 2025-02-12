import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {
    public static void main(String[] args) {

        System.out.println(Class.studentClasses);

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println(" ---- WITAJ W ELEKTROCZNICZNYM DZIENNNIKU --- ");
        System.out.println("");
        boolean running = true;
        while (running) {
            MenuLauncher.menuLaunch();
            switch (scanner.nextInt()) {
                case 1 -> System.out.println(Student.studentsList); ///
                case 2 -> Student.studentAddToList(scanner);  ///
                case 3 -> Student.studentRemoveFromList(scanner);
                case 4 -> Teacher.addTeacher(scanner);
                case 5 -> Teacher.removeTeacher(scanner);
                case 6 -> System.out.println(Teacher.teacherList);
                case 7 -> {
                    Class.createClass(); /// dziala
                    Class.assignStudentToClass();
                }
                case 8 ->Class.classDisplay();// wypisanie klas
                case 9 -> {
                    running = false;
                    System.out.println("Zamykanie ..");

                }
            }

        }
    }
}
