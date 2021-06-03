
import java.util.stream.Stream;

public class AddressBookUC8 {

    public static void main(String[] args)
    {


        Stream<String> stream = Stream.of("Anusha", "Ajith",
                "Sita", "Dhruv","Nakshatra");


        stream.filter(str -> str.endsWith("a"))
                .forEach(System.out::println);

    }
}
