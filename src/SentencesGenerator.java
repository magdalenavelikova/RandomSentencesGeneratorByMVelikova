import java.util.Random;
import java.util.Scanner;

public class SentencesGenerator {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        String[] names = {"Peter", "Michell", "Jane", "Steve"};
        String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = {"near the river", "at home", "in the park"};
        System.out.println("Hallo! This is you first sentence ");
        String readString="";
        while (readString.equals("")) {

            System.out.println(getWord(names) + " from " + getWord(places)
                    + " " + getWord(verbs) + " " + getWord(nouns) + " "
                    + getWord(adverbs) + " " + getWord(details) + ".");

            System.out.println("Press [Enter] to generate new sentence.");

            readString=scanner.nextLine();

        }
    }

    public static String getWord(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);

        return  array[randomIndex];
    }
}
