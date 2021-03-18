package Task2;

import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        
        int orderedShirt, orderedTrouser, point = 0;
        int priceOfShirt = 300;
        int priceOfTrouser = 700;
        int costOfShirt, costOfTrouser, totalCost;
        double discount, netPay;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Shirts to order: ");
        orderedShirt = input.nextInt();
        System.out.println("Enter the number of Trouser to order: ");
        orderedTrouser = input.nextInt();

        costOfShirt = orderedShirt * priceOfShirt;
        costOfTrouser = orderedTrouser * priceOfTrouser;
        totalCost = costOfShirt + costOfTrouser;

        discount = totalCost > 3000? totalCost * 10 / 100 : 0;
        netPay = totalCost - discount;

        point = (int) (netPay > 3000 ? netPay / 100 : 0);

        System.out.println("\nItem \t\t Quantity \t Price \t Total");
        System.out.println("----------------------------------------------" + 
                       "-------------------");
        System.out.printf("Shirt \t\t   %d \t\t   %d \t\t     %d \n", orderedShirt, priceOfShirt, costOfShirt);
        System.out.printf("Shirt \t\t   %d \t\t   %d \t\t     %d \n", orderedTrouser, priceOfTrouser, costOfTrouser);
        System.out.printf("Discount \t  \t\t    \t\t\t      %.2f \n", discount);
        System.out.println("----------------------------------------------" + 
                       "-------------------");
        System.out.printf("Net Total \t    \t\t     \t\t\t      %.2f    \n", netPay  );
        System.out.println("----------------------------------------------" + 
                       "-------------------");
        System.out.printf("Point Earned \t  %d  \n", point);
        System.out.println("Thank you!");


        

    }
    
}
