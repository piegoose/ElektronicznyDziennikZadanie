import java.util.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> studentList = new ArrayList<>();
        HashMap<String, String> studentClasses = new HashMap<>();
        String studentPD;

        System.out.print("Ilu jest studentow? ");

        int studentCount = scanner.nextInt();
        scanner.skip("\n");
        sigingIN(studentCount, scanner, studentList);
        Collections.sort(studentList);                              // sortowanie
        listSizing(studentList);

        /// Modyfikacje Listy studentow:

        boolean running = true;
        while (running) {

            menuLanuch();

            String input = scanner.next();
            switch (input) {

                // 1 - Lista

                case "1" -> System.out.println(studentList);

                // 2 - Dodaj osobe

                case "2" -> {
                    studentAdd(scanner, studentList);
                }

                // 3 - Usun osobe

                case "3" -> {
                    deletingStudent(scanner, studentList);

                }

                // Podzial na klasy 

                case "4" -> {
                    // mapper studentow     lista klass plus lista studentow

                    System.out.println("Wpisz do jakiej Klasy chcialbys dodac studenta? ");
                    scanner.nextLine();


                    switch (scanner.nextLine()) {

                        case "Klasa A" -> selectClassA(scanner, studentClasses);
                        case "Klasa B" -> selectClassB(scanner, studentClasses);


                    }
                }
                case "5" -> {
                    System.out.println(studentClasses);
                }
                // 9 - Zakoncz program
                case "6" -> {
                    running = isRunning();
                }
            }
        }
    }

    private static void listSizing(List<String> studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i + 1) + ": " + studentList.get(i));

        }
    }

    private static void sigingIN(int studentCount, Scanner scanner, List<String> studentList) {
        String studentPD;
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Podaj imie i nazwisko studenta: ");
            studentPD = scanner.nextLine();
            studentList.add(studentPD);                             // zapisywanie danych studenta do listy
        }
    }

    private static void selectClassA(Scanner scanner, HashMap<String, String> studentClasses) {
        System.out.println("Podaj imie i nazwisko studenta ktory ma byc dodany do klasy A: ");
        String whichA = scanner.nextLine();
        studentClasses.put("Klasa A", whichA);
    }

    private static void selectClassB(Scanner scanner, HashMap<String, String> studentClasses) {
        System.out.println("Podaj imie i nazwisko studenta ktory ma byc dodany do klasy A: ");
        String whichB = scanner.nextLine();
        studentClasses.put("Klasa B", whichB);
    }


    private static void deletingStudent(Scanner scanner, List<String> studentList) {
        System.out.println("Podaj studenta ktory ma byc usuniety: ");
        String personThrow = scanner.next();
        studentList.remove(personThrow);
        System.out.println(studentList);
    }

    private static void studentAdd(Scanner scanner, List<String> studentList) {
        System.out.println("Podaj imie i nazwisko studenta: ");
        String studentPD = scanner.nextLine();
        studentList.add(studentPD);
        System.out.println("Dodano Studenta: " + studentPD);
    }

    private static void menuLanuch() {
        System.out.println("--------Menu------------");
        System.out.println("1- Lista Studentow");
        System.out.println("2- Dodaj Studenta");
        System.out.println("3- Usun Studenta");
        System.out.println("4- Podzial na klasy");
        System.out.println("5- Pokaz Klasy");
        System.out.println("6 - Wyjdz z Dziennika");
    }

    private static boolean isRunning() {
        boolean running;
        System.out.println("Zakonczenie programu");
        running = false;
        return running;
    }

}