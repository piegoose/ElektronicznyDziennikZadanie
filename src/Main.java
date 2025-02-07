import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> studentList = new ArrayList<>();
        String studentPD;
        System.out.print("Ilu jest studentow? ");

        int studentCount = scanner.nextInt();
        scanner.skip("\n");
        Class.sigingIN(studentCount, scanner, studentList);
        Collections.sort(studentList);                              // sortowanie
        listSizing(studentList);

        /// Modyfikacje Listy studentow:\\

        boolean running = true;
        while (running) {

            menuLaunch();
            String input = scanner.next();
            scanner.nextLine();
            switch (input) {

                // 1 - Lista
                case "1" -> System.out.println(studentList);
                // 2 - Dodaj osobe
                case "2" -> Student.studentAdd(scanner, studentList);
                // 3 - Usun osobe
                case "3" -> Student.deletingStudent(scanner, studentList);
                // Podzial na klasy
                case "4" -> {
                    System.out.println("Wpisz do jakiej Klasy chcialbys dodac studenta? "); // mapper studentow     lista klass plus lista studentow

                    switch (scanner.nextLine()) {
                        case "1" -> Class.selectClassA(scanner, Class.studentClasses);
                        case "2" -> Class.selectClassB(scanner, Class.studentClasses);
                    }
                }
                case "5" -> System.out.println(Class.studentClasses);
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




    private static void menuLaunch() {
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