import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

//        System.out.print("Enter the temperature in Fahrenheit : ");

//        Scanner tempInput = new Scanner(System.in);

//        int temperature = tempInput.nextInt();
//        float temperature = tempInput.nextFloat();

//        System.out.println("The input temperature is : " + temperature);

//        Scanner nameInput = new Scanner(System.in);

//        System.out.print("Enter a name : ");

//        String name = nameInput.next();
//        String name = nameInput.nextLine();
//        String name = nameInput.nextLine().trim();

//        System.out.println("The name entered is : " + name);

//        System.out.print("Enter the temperature in Fahrenheit : ");
//        Scanner tempInput = new Scanner(System.in);
//        int temperature = tempInput.nextInt();

//        tempInput.close();

//        System.out.println("Temperature : " + temperature);

//        if (temperature >= 84) {

//            System.out.println("It's a hot day!");

//            System.out.println("Remember to stay hydrated.");
//        }

//        if (temperature >= 84) {

//            System.out.println("It's a hot day! Remember to stay hydrated.");
//        }
//        else {

//            System.out.println("A t-shirt and shorts may not be the best option today.");
//        }

//        if (temperature >= 84)

//            System.out.println("It's a hot day! Remember to stay hydrated.");

//        else

//            System.out.println("A t-shirt and shorts may not be the best option today.");

//        System.out.println("Have a Nice day !!!! ");

//        String result = ( temperature >= 84 ) ? "hot" : "not so hot";

//        System.out.println("The weather today is " + result);

//        String tempLevel;

//        if (temperature >= 84) {
//            tempLevel = "Hot";
//        }
//        if (temperature >= 70) {
//            tempLevel = "Warm";
//        }
//        if (temperature >= 55) {
//            tempLevel = "Cool";
//        }
//        else {
//            tempLevel = "Cold";
//        }

//        if (temperature >= 84) {
//            tempLevel = "Hot";
//        }
//        if (temperature >= 70 && temperature < 84) {
//            tempLevel = "Warm";
//        }
//        if (temperature >= 55 && temperature < 70) {
//            tempLevel = "Cool";
//        }
//        if (temperature < 55) {
//            tempLevel = "Cold";
//        }

//        if (temperature >= 84) {
//            tempLevel = "Hot";
//        }
//        else if (temperature >= 70) {
//            tempLevel = "Warm";
//        }
//        else if (temperature >= 55) {
//            tempLevel = "Cool";
//        }
//        else  {
//            tempLevel = "Cold";
//        }

//        String tempLevel = ( temperature >= 84) ? "Hot"
//                : ( temperature >= 70 && temperature < 84 ) ? "Warm"
//                : ( temperature >= 55 && temperature < 70 ) ? "Cool" : "Cold";

//        System.out.println("Temperature = " + temperature);
//        System.out.println("Temperature Level = " + tempLevel);

//        int i = 0;

//        System.out.format("\nMessage %d: Welcome to Java programming!", i + 1);
//        i++;

//        System.out.format("\nMessage %d: Welcome to Java programming!", i + 1);
//        i++;

//        System.out.format("\nMessage %d: Welcome to Java programming!", i + 1);
//        i++;

//        int count = 3;

//        for (int i = 0; i < count; i++) {

//            System.out.format("\nMessage %d: Welcome to Java programming!", i + 1);
//        }

        Scanner numberInput = new Scanner(System.in);
        System.out.print("How many times should I repeat the message? : ");

        int count = numberInput.nextInt();

        for (int i = 0; i < count; i++) {

            System.out.format("\nMessage %d: Welcome to Java programming!", i + 1);
        }

    }
}