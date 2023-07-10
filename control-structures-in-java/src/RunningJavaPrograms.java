import java.util.Arrays;

public class RunningJavaPrograms {

    public static void main(String[] args) {

        System.out.println("The input args are: " + Arrays.toString(args));

        String[] treasureChest = {"Book", "Quill", "Gold",
                "Quill", "Document", "Silver",
                "Gold", "Book", "Book",
                "Spoon", "Silver", "Gold"};

//        String item = "Document";
        String item = args[0];
        int searchLimit = Math.min(Integer.valueOf(args[1]), treasureChest.length);
        boolean itemFound = false;

//        System.out.println("The the search begin for: " + item);
        System.out.format("\nLet the search begin for: %s with a limit of %d\n",
                item, searchLimit);

//        for (int i = 0; i < treasureChest.length; i++) {
        for (int i = 0; i < searchLimit; i++) {

            if (treasureChest[i].equals(item)) {
                System.out.println("\nI found it!!");
                itemFound = true;
                break;
            }

            System.out.format("\n%s is not what I wanted. Moving on with the search...",
                    treasureChest[i]);
        }

        System.out.println("\nWas the search a success? : " + itemFound);

    }
}
