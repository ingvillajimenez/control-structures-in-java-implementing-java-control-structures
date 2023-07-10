public class ForLoop {

    public static void main(String[] args) {

//        String[] productName = {"Mouse", "Speakers", "Watch", "Earphones", "Charger"};
//        double[] productPriceUSD = {9.90, 79.0, 110.0, 42.50, 55.0};
//        double USDToEUR = 0.82;

//        System.out.println("What are the product prices in USD and Euros?");

//        for (int i = 0; i < productPriceUSD.length; i++) {
//        for (int i = 0; i < 3; i++) {
//        for (int i = productPriceUSD.length - 1; i >= 0; i--) {
//        for (int i = 0; i < productPriceUSD.length; i += 2) {
//        for (int i = 0; i < productPriceUSD.length; ) {

//            System.out.format("\nProduct %s costs %f USD or %f EUR",
//                    productName[i],
//                    productPriceUSD[i],
//                    USDToEUR * productPriceUSD[i]);
//        }

//        String[] products = {"Mouse", "Speakers", "Watch", "Earphones", "Charger"};
//        String[] brands = {"Raganza", "Qenel", "Zoflina"};

//        System.out.println("What are the product in the catalog?\n");

//        for (int i = 0; i < products.length; i++) {

//            for (int j = 0; j < brands.length; j++) {
//                System.out.println(brands[j] + " " + products[i]);
//            }
//        }

        String[] treasureChest = {"Book", "Quill", "Gold",
                "Quill", "Document", "Silver",
                "Gold", "Book", "Book",
                "Spoon", "Silver", "Gold"};

//        int usefulItemsCount = 0;
//        String item = "Document";
        String item = "Sword";
        boolean itemFound = false;

        System.out.println("Let the search begin!");

        for (int i = 0; i < treasureChest.length; i++) {

//            if (treasureChest[i].equals("Gold")) {
//                System.out.println("I found some GOLD!");
//                usefulItemsCount++;
//            }

//            if (!(treasureChest[i].equals("Gold") || treasureChest[i].equals("Silver"))) {
//                System.out.format("\n%s is not what I wanted. Moving on with the search...",
//                        treasureChest[i]);
//                continue;
//            }

            if (treasureChest[i].equals(item)) {
                System.out.println("\nI found it!!");
                itemFound = true;
                break;
            }

//            System.out.format("\nLook. I found some %s!", treasureChest[i].toUpperCase());
//            usefulItemsCount++;
            System.out.format("\n%s is not what I wanted. Moving on with the search...",
                    treasureChest[i]);
        }

//        System.out.format("\n\nI found %d gold or silver bars.", usefulItemsCount);
        System.out.println("\n\nWas the search a success? : " + itemFound);
    }
}
