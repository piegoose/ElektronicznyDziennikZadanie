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
        System.out.println("2- Usun Studenta");

        String input = scanner.next();
        switch (input){
            case "1"-> System.out.println(studentList);
            // 2 - Dodaj osobe

            // 3 - Usun osobe
            case "2"-> {
                System.out.println("Podaj Numer indeksu studenta ktory ma byc usuniety: ");
                int number = scanner.nextInt();
                studentList.remove(number+1);
                System.out.println(studentList);

            }
            // 9 - Zakoncz program
            // 10 - podzial na klasy ( mapy)

        }













        }



















    }