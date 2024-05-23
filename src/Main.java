import com.engeto.computers.Computer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        sortIntegersDemo();
        sortComputersDemo();
    }

    private static void sortComputersDemo() {
        List<Computer> computerList = new ArrayList<>();
        computerList.add(new Computer("Xyz", LocalDate.of(2024, 1, 15), 1500));
        computerList.add(new Computer("Abc", LocalDate.of(2024, 2, 2), 2000));
        computerList.add(new Computer("Klm", LocalDate.of(2024, 1, 2), 1800));

        System.out.println("Před seřazením: " + computerList);
        // computerList.sort(null); - při spuštění nastane chyba, protože Computer není Comparable
        // Alternativní zápis - funguje i na jiné typy kolekcí:
        Collections.sort(computerList);
        System.out.println("Po seřazení: " + computerList);
    }

    private static void sortIntegersDemo() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(5);
        integerList.add(7);

        System.out.println("Před seřazením: " + integerList);
        integerList.sort(null);
        // Alternativní zápis - funguje i na jiné typy kolekcí:
        // Collections.sort(integerList);
        System.out.println("Po seřazení: " + integerList);
    }
}