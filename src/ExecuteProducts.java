import java.util.Scanner;

public class ExecuteProducts {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Cloths cloths = new Cloths();
        //String Name, float Rating, float Quantity, int Cost
        String clothName = input.nextLine();
        float clothRating = input.nextFloat();
        float clothQuantity = input.nextFloat();
        int clothCost = input.nextInt();
        cloths.MenWomenCloths(clothName,clothRating,clothQuantity,clothCost);
        System.out.println();
        Electronic electronic = new Electronic();
        //String Name, float Rating, float Quantity, int Cost
        String electronicName1 = input.nextLine();
        float electronicRating1 = input.nextFloat();
        float electronicQuantity1 = input.nextFloat();
        int electronicCost1 = input.nextInt();
        electronic.Laptop(electronicName1,electronicRating1,electronicQuantity1,electronicCost1);
        System.out.println();
        String electronicName2 = input.nextLine();
        float electronicRating2 = input.nextFloat();
        float electronicQuantity2 = input.nextFloat();
        int electronicCost2 = input.nextInt();
        electronic.Tv(electronicName2,electronicRating2,electronicQuantity2,electronicCost2);
        System.out.println();
        Grocery grocery = new Grocery();
        String groceryName1 = input.nextLine();
        float groceryRating1 = input.nextFloat();
        float groceryQuantity1 = input.nextFloat();
        int groceryCost1 = input.nextInt();
        grocery.Milk(groceryName1,groceryRating1,groceryQuantity1,groceryCost1);


    }
}
