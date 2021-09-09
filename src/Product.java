public class Product {
    String Name;
    float Rating;
    float Quantity;
    int Cost;
    public void allProducts(String Name, float Rating, float Quantity, int Cost){
        this.Name = Name;
        this.Rating = Rating;
        this.Quantity = Quantity;
        this.Cost = Cost;
        System.out.println("Name: "+Name);
        System.out.println("Rating: "+Rating);
        System.out.println("No.of item's: "+Quantity);
        System.out.println("Cost for one Item: "+Cost);
        if (Quantity == 0){
            System.out.println("Total Cost is: 0.0");
        }
        else{
            float Total_Cost = Quantity*Cost;
            System.out.println("Total Cost is: "+Total_Cost);
        }
    }
}
class Cloths extends Product{
    public void MenWomenCloths(String Name, float Rating, float Quantity, int Cost){
        allProducts(Name,Rating,Quantity,Cost);
    }
}
class Electronic extends Product{
    public void Laptop(String Name, float Rating, float Quantity, int Cost){
        allProducts(Name,Rating,Quantity,Cost);
    }
    public void Tv(String Name, float Rating, float Quantity, int Cost){
        allProducts(Name,Rating,Quantity,Cost);
    }
}
class Grocery extends Product{
    public void Milk(String Name, float Rating, float Quantity, int Cost){
        allProducts(Name,Rating,Quantity,Cost);
    }
}