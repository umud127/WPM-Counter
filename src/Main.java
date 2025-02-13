import java.time.LocalTime;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //all words we can use to type
        String[] words = {
                "apple", "banana", "orange", "grape", "pineapple", "mango", "peach", "pear", "kiwi", "plum",
                "strawberry", "blueberry", "blackberry", "raspberry", "cherry", "watermelon", "melon", "papaya",
                "lemon", "lime", "coconut", "fig", "pomegranate", "apricot", "avocado", "date", "grapefruit",
                "guava", "lychee", "nectarine", "passionfruit", "persimmon", "quince", "tangerine", "tomato",
                "almond", "walnut", "pecan", "hazelnut", "peanut", "cashew", "pistachio", "brazilnut", "chestnut",
                "oak", "maple", "pine", "birch", "cedar", "fir", "spruce", "redwood", "sequoia", "willow", "elm",
                "ash", "hawthorn", "cypress", "dogwood", "magnolia", "jasmine", "rose", "tulip", "daisy", "lily",
                "orchid", "sunflower", "violet", "iris", "lavender", "marigold", "carnation", "petunia", "poppy",
                "butterfly", "bee", "ant", "spider", "grasshopper", "dragonfly", "ladybug", "cricket", "mosquito",
                "beetle", "moth", "caterpillar", "snail", "slug", "worm", "frog", "toad", "newt", "salamander",
                "lizard", "snake", "turtle", "crocodile", "alligator", "shark", "whale", "dolphin", "octopus",
                "squid", "crab", "lobster", "jellyfish", "seal", "penguin", "bear", "lion", "tiger", "leopard",
                "cheetah", "elephant", "rhinoceros", "hippopotamus", "giraffe", "zebra", "kangaroo", "koala",
                "panda", "monkey", "ape", "gorilla", "baboon", "parrot", "eagle", "owl", "hawk", "falcon",
                "penguin", "sparrow", "robin", "swan", "peacock", "flamingo", "ostrich", "pigeon", "dove",
                "wolf", "fox", "dog", "cat", "rabbit", "hamster", "mouse", "rat", "horse", "cow", "sheep",
                "goat", "pig", "chicken", "duck", "turkey", "goose", "fish", "salmon", "trout", "carp",
                "bass", "perch", "herring", "eel", "shrimp", "clam", "oyster", "scallop", "mussel", "urchin",
                "starfish", "coral", "anemone", "seaweed", "kelp", "algae", "plankton", "bacteria", "virus",
                "fungus", "moss", "fern", "grass", "bamboo", "palm", "ivy", "cactus", "succulent", "herb"
        };

        //some initialize
        Random random = new Random();
        StringBuilder text = new StringBuilder();
        int wordCount = 5;
        int charCount;
        //select all words
        for(int i = 0;i < wordCount;i++){
            int queue = random.nextInt(words.length);
            text.append(words[queue]).append(" ");
        }

        String targetText = text.toString().trim();

        charCount = targetText.length();
        //countdown and showing text
        System.out.println(3);
        Thread.sleep(1000);
        System.out.println(2);
        Thread.sleep(1000);
        System.out.println(1);
        Thread.sleep(1000);

        System.out.println(targetText);

        //calculating wpm
        long startTime = LocalTime.now().toNanoOfDay();

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        long finishTime =  LocalTime.now().toNanoOfDay();

        double timeInSeconds =  (finishTime - startTime) / 1_000_000_000.0;

        System.out.println("You Spent " + timeInSeconds + " sec");//////

        double wordsYouWrote = (double) charCount / 5.0;

        System.out.println(wordsYouWrote);///////

        int wpm = (int) ( ( wordsYouWrote / timeInSeconds) * 60);

        if(!(Objects.equals(input.strip(), text.toString().strip()))){
            System.out.println("You Must Write All One Truely. You Wrote Wrong");
        }else {
            System.out.println("Your Wpm: " + wpm);
        }
    }
}