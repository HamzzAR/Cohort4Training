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



//        String days = "Friday";
//        switch (days){
//            case "Monday", "Tuesday" -> System.out.println("Today is mon or tue");
//            case "Wednesday", "Thursday" -> System.out.println("Today is wed or thur");
//            case "Friday" -> System.out.println("Today is Friday");
//        }
    }
}