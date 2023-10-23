import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainReadFile {

    public static void main(String[] args) throws FileNotFoundException {
        Person person = new Person("Даниил", "Ткаченко", 67);
        Person personFromString = new Person("Даниил Ткаченко 67");

        System.out.println(person);
        System.out.println(personFromString);


        File file = new File("daniil/file.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
    }

}
