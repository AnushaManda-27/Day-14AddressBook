
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBookUC10 {

    public static void main(String[] args)
    {

        Stream<String> s = Stream.of("Anusha", "Ajith",
                "Sita", "Dhruv","Nakshatra");


        long count_string =  s.collect(Collectors.counting());

        System.out.println(count_string);
    }
}
