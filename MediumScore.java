package Task2;

import java.util.Scanner;

public class MediumScore {
    public static void  main(String[] args) {

        double Math, Physic, Biology;
        String name;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name: ");
        name = scan.nextLine();

        System.out.println("Enter score of Math: ");
        Math = scan.nextDouble();
        System.out.println("Enter score of Physic: ");
        Physic = scan.nextDouble();
        System.out.println("Enter score of  Biology: ");
        Biology = scan.nextDouble();

        double mediumScore = (Math + Physic + Biology) / 3;

        System.out.println("Name of student is: " + name + "\nMedium score is: " + mediumScore);


        
        
    }
    
}
