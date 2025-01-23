import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> studentList = new ArrayList<>();


        System.out.println("Ilu jest studentow? ");
        int studentCount = scanner.nextInt();
        scanner.skip("\n");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Podaj imie i nazwisko studenta: ");
            String studentPD = scanner.nextLine();
            studentList.add(studentPD);
        }
        Collections.sort(studentList);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i + 1) + ": " + studentList.get(i));

        }

        /// Modyfikacje Listy studentow:


        System.out.println("--------Menu------------");
        System.out.println("1- Lista Studentow");
        System.out.println("2- Dodaj Studenta");
        System.out.println("3- Usun Studenta");
        System.out.println("4- Podzial na klasy");

        String input = scanner.next();
        switch (input) {

            // 1 - Lista
            case "1" -> System.out.println(studentList);
            // 2 - Dodaj osobe
            case "2" -> {
                System.out.println("Podaj imie i nazwisko studenta: ");
                String studentPD = scanner.nextLine();
                studentList.add(studentPD);
            }
            // 3 - Usun osobe
            case "3" -> {
                System.out.println("Podaj studenta ktory ma byc usuniety: ");
                String personThrow = scanner.next();
                studentList.remove(personThrow);
                System.out.println(studentList);

            }


            // 9 - Zakoncz program
            // 10 - podzial na klasy ( mapy)

        }


    }


}