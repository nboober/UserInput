import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String firstInitial = keyboard.next();
        String lastName = keyboard.next();
        String houseNumber = keyboard.next();
        String streetName = keyboard.next();
        String streetType = keyboard.next();
        String city = keyboard.next();

        System.out.println(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);

    }
}
