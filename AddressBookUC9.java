
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBookUC9 {

    public static void main(String[] args) {

        List<String> stringlist = Arrays.asList("Anusha", "Ajith",
                "Sita", "Dhruv","Nakshatra");
        List<String> sortedList = stringlist.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
