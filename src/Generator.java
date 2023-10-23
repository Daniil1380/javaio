import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Random;

public class Generator {

    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();

        File fileForNames = new File("daniil/name.txt");
        File fileForLastNames = new File("daniil/lastname.txt");

        FileReader fileReaderForNames = new FileReader(fileForNames);
        FileReader fileReaderForLastNames = new FileReader(fileForLastNames);

        BufferedReader bufferedReaderForNames = new BufferedReader(fileReaderForNames);
        BufferedReader bufferedReaderForLastNames = new BufferedReader(fileReaderForLastNames);

        List<String> names = bufferedReaderForNames.lines()
                .toList();
        List<String> lastNames = bufferedReaderForLastNames.lines()
                .toList();

        System.out.println(names);
        System.out.println("------------");
        System.out.println(lastNames);

        for (int i = 0; i < 1000; i++) {
            int age = random.nextInt(0, 80);

            int nameRandomNumber = random.nextInt(0, names.size());
            String name = names.get(nameRandomNumber);

            int lastNameRandomNumber = random.nextInt(0, lastNames.size());
            String lastName = lastNames.get(lastNameRandomNumber);

            System.out.println(name + " " + lastName + " " + age);
        }

    }
}
