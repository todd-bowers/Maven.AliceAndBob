import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
    Scanner in = new Scanner(System.in);
    System.out.print("What is your name? ");
    String name = in.nextLine();

    switch (name) {
        case "Alice":
            System.out.println("Hello Alice!");
            break;
        case "Bob":
            System.out.println("Hello Bob!");
            break;
    }
    }
    }
