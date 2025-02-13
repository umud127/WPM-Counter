import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
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

        Random random = new Random();

        StringBuilder text = new StringBuilder();

        for(int i = 0;i < 10;i++){
            int queue = random.nextInt(189);
            text.append(words[queue]).append(" ");
        }

        text.append(words[random.nextInt(189)]);

        System.out.println(3);
        Thread.sleep(1000);
        System.out.println(2);
        Thread.sleep(1000);
        System.out.println(1);
        Thread.sleep(1000);

        System.out.println(text);

        long startTime = System.currentTimeMillis();

        String input = new Scanner(System.in).nextLine();

        long finishTime =  System.currentTimeMillis();

        double timeInMilliSeconds =  (finishTime - startTime) / 1000.0;
        double timeInSeconds =  timeInMilliSeconds / 60;
        int wpm = (int)(11 /  timeInSeconds);

        if(!(Objects.equals(input, text.toString().trim()))){
            System.out.println("You Must Write All One Truely. You Wrote Wrong");
        }else {
            System.out.println("Your Wpm: " + wpm);
        }
    }
}