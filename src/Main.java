import java.util.*;
import java.util.HashMap;

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
        boolean running = true;
        while (running) {
            System.out.println("--------Menu------------");
            System.out.println("1- Lista Studentow");
            System.out.println("2- Dodaj Studenta");
            System.out.println("3- Usun Studenta");
            System.out.println("4- Podzial na klasy");
            System.out.println("6 - Wyjdz z Dziennika");


            String input = scanner.next();
            switch (input) {

                // 1 - Lista
                case "1" -> System.out.println(studentList);
                // 2 - Dodaj osobe
                case "2" -> {
                    System.out.println("Podaj imie i nazwisko studenta: ");
                    String studentPD = scanner.nextLine();
                    studentList.add(studentPD);
                    System.out.println("Dodano Studenta: " + studentPD);
                }
                // 3 - Usun osobe
                case "3" -> {
                    System.out.println("Podaj studenta ktory ma byc usuniety: ");
                    String personThrow = scanner.next();
                    studentList.remove(personThrow);
                    System.out.println(studentList);

                }
                // Podzial na klasy 
                case "4" -> {
                    HashMap<String, List<String>> studentClasses = new HashMap<>();
                    List<String> classA = new ArrayList<>();
                    List<String> classB = new ArrayList<>();
                    studentClasses.put("KlasaA", classA);
                    studentClasses.put("KlasaB", classB);
                    System.out.println("Wpisz do jakiej Klasy chcialbys dodac studenta? ");
                    scanner.nextLine();
                    switch (scanner.nextLine()) {

                        case "KlasaA" -> {
                            System.out.println("Podaj imie i nazwisko studenta ktory ma byc dodany do klasy A: ");
                            String studentChangeClassA = scanner.nextLine();
                            classA.add(studentChangeClassA);

                        }
                        case "KlasaB" -> {
                            System.out.println("Podaj imie i nazwisko studenta ktory ma byc dodany do klasy A: ");
                            String studentChangeClassB = scanner.nextLine();
                            classB.add(studentChangeClassB);
                        }
                        // dodawanie do poszczegolnbych klas studentow dziala, ale w momencie kiedy chcemy dodac nastepnego to poprzedni jest nim zastepowany
                        // przydaloby sie tez dodac opcje zamkniecia programu bo obcecna nie dziala


                    }
                    System.out.println(studentClasses);


                }

                // 9 - Zakoncz program
                case "5" -> {
                    System.out.println("Zakonczenie programu");
                    running = false;
                }
            }
            //scanner.close();


        }

    }


}