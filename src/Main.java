import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("Hamza", 0623746323, "Example Address", 1);
        customer1.setAccountNumber(2653265);

        CurrentAccount currentAccount1 = new CurrentAccount("current", "Branch 1",
                2222, 2653265, "Account 1",0,2, 200);

        Employee employee1 = new Employee("Jack", 0623746323,"Example Address", 1);

        System.out.println(currentAccount1.deposit(100,2222));
        System.out.println("Interest - "+currentAccount1.calculateInterest());

////        Area of a rectangle
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter length and width: ");
//        double length = input.nextDouble();
//        double width = input.nextDouble();
//
//        Area area1 = new Area(length, width);
//        System.out.println("This is the area - "+area1.returnArea());

//        Book
        Book book1 = new Book("Happy Book", "Hamza", 1000.0);
        System.out.println(book1);

        DeckOfCards deck = new DeckOfCards();
        Card[] allCard = deck.returnDeck();
        for (Card card : allCard){
            System.out.println("Rank: "+card.getRank()+ " Suit: "+card.getSuit());
        }





//        String days = "Friday";
//        switch (days){
//            case "Monday", "Tuesday" -> System.out.println("Today is mon or tue");
//            case "Wednesday", "Thursday" -> System.out.println("Today is wed or thur");
//            case "Friday" -> System.out.println("Today is Friday");
//        }
    }
}
