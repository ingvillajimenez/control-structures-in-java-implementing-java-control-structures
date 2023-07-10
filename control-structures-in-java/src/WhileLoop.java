public class WhileLoop {

    public static void main(String[] args) {

        String[] treasureChest = {"Book", "Quill", "Gold",
                "Quill", "Document", "Silver",
                "Gold", "Book", "Book",
                "Spoon", "Silver", "Gold"};

//        String item = "Document";
        String item = "Sword";
        boolean itemFound = false;

        int i = 0;

//        while (i < treasureChest.length) {

//            System.out.println("Found " + treasureChest[i]);
//            i++;
//        }

        while (!itemFound && i < treasureChest.length) {

            if (treasureChest[i].equals(item)) {
                System.out.println("\nI found it!!");
                itemFound = true;
                break;
            }

            System.out.format("\n%s is not what I wanted. Moving on with the search...",
                    treasureChest[i]);
            i++;
        }

        System.out.println("\nWas the search a success? : " + itemFound);

    }
}
