

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class AddressBookUC7 {
    public static void main(String[] args)
    {


        Stream<String> stream = Stream.of("Anusha", "Ajith",
                "Sita", "Dhruv","Nakshatra");

        stream.filter(str -> str.startsWith("A"))
                .forEach(System.out::println);

    }
}
