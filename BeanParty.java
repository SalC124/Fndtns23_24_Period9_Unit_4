import java.util.Scanner;

public class BeanParty {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String pintoName = "Pinto";
            String kidneyName = "Kidney";
            String blackName = "Black";

            // Asks for previous amount of money to replace the zero
            System.out.print("How many pinto beans were counted previously?  ");
            int pintoCount = input.nextInt();
            
            System.out.print("How many kidney beans were counted previously? ");
            int kidneyCount = input.nextInt();

            System.out.print("How many black beans were counted previously?  ");
            int blackCount = input.nextInt();

            input.nextLine();
            BeanCounter pintoCounter = new BeanCounter(pintoName, pintoCount);
            BeanCounter kidneyCounter = new BeanCounter(kidneyName, kidneyCount);
            BeanCounter blackCounter = new BeanCounter(blackName, blackCount);
            
            System.out.println();
            System.out.println("Enter commands: (RENAME, RESET, DONE, p-, k-, b-)");
            System.out.println();

            String Response = input.nextLine();
            while (!Response.equals("DONE")) {
            
                if (Response.charAt(0) == 'p') {
                    pintoCounter.count();
                    System.out.println("BeanCounter " + pintoName + " has " + pintoCounter.getBeanCount() + " beans.");
                } else if (Response.charAt(0) == 'k') {
                    kidneyCounter.count();
                    System.out.println("BeanCounter " + kidneyName + " has " + kidneyCounter.getBeanCount() + " beans.");
                } else if (Response.charAt(0) == 'b') {
                    blackCounter.count();
                    System.out.println("BeanCounter " + blackName + " has " + blackCounter.getBeanCount() + " beans.");
                } else if (Response.equals("RENAME")) {
                    System.out.print("What should we call " + pintoName + " now? ");
                    pintoName = input.nextLine() + " (Pinto)";
                    System.out.print("What should we call " + kidneyName + " now? ");
                    kidneyName = input.nextLine() + " (Pinto)";
                    System.out.print("What should we call " + blackName + " now? ");
                    blackName = input.nextLine() + " (Pinto)";
                }else if (Response.substring(0, 4).equals("RESET")) {
                    if(Response.substring(Response.length() - 2, Response.length()).equals("-y")) {
                        
                    }
                    System.out.println("Are you sure you want to reset? \n (y/n)");
                    pintoCount = 0;
                    kidneyCount = 0;
                    blackCount = 0;
                    pintoCounter = new BeanCounter(pintoName, pintoCount);
                    kidneyCounter = new BeanCounter(kidneyName, kidneyCount);
                    blackCounter = new BeanCounter(blackName, blackCount);
                } else {
                System.out.println("Invalid command.");
                }
                System.out.println();
                Response = input.nextLine();
            }
            System.out.println(pintoCounter);
            System.out.println(kidneyCounter);
            System.out.println(blackCounter);
            System.out.println("There are a total of " + (pintoCounter.getBeanCount()
            + kidneyCounter.getBeanCount() + blackCounter.getBeanCount()) + " beans.");
        }

        System.out.println();
        System.out.println("I hope you enjoyed this BeanParty!");
    }
}