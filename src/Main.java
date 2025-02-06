import java.util.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> studentList = new ArrayList<>();
        HashMap<String, List<String>> studentClasses = new LinkedHashMap<>();
        studentClasses.put("Klasa A", new ArrayList<>()); // tworzenie listy dla studentow w ten sposob do 
        studentClasses.put("Klasa B", new ArrayList<>());   // jednego klucza przypisuje kilku uczniow
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
            scanner.nextLine();
            switch (input) {

                // 1 - Lista
                case "1" -> System.out.println(studentList);
                // 2 - Dodaj osobe
                case "2" -> studentAdd(scanner, studentList);
                // 3 - Usun osobe
                case "3" -> deletingStudent(scanner, studentList);
                // Podzial na klasy
                case "4" -> {
                    System.out.println("Wpisz do jakiej Klasy chcialbys dodac studenta? "); // mapper studentow     lista klass plus lista studentow

                    switch (scanner.nextLine()) {
                        case "1" -> selectClassA(scanner, studentClasses);
                        case "2" -> selectClassB(scanner, studentClasses);
                    }
                }
                case "5" -> System.out.println(studentClasses);
                // 9 - Zakoncz program
                case "6" -> running = isRunning();
                default -> throw new IllegalStateException("Unexpected value: " + input);
            }

        }
        scanner.close();
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

    private static void selectClassA(Scanner scanner, Map<String, List<String>> studentClasses) {
        System.out.println("Podaj imie i nazwisko studenta ktory ma byc dodany do klasy A: ");
        String whichA = scanner.nextLine();
        studentClasses.get("Klasa A").add(whichA);
    }

    private static void selectClassB(Scanner scanner, Map<String, List<String>> studentClasses) {
        System.out.println("Podaj imie i nazwisko studenta ktory ma byc dodany do klasy B: ");
        String whichB = scanner.nextLine();
        studentClasses.get("Klasa B").add(whichB);
    }

    private static void deletingStudent(Scanner scanner, List<String> studentList) {
        System.out.println("Podaj studenta ktory ma byc usuniety: ");
        String personThrow = scanner.nextLine();
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