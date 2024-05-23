import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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