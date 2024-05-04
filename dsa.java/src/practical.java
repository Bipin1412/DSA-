//import java.util.Scanner;
//
//interface productMarker{
//}
//class product implements productMarker{
//    int id;
//    String name;
//    int cost;
//    int quality;
//    int count;
//    product(){
//        id=0;
//        name="";
//        cost=0;
//        quality=0;
//    }
//    product(int id,String name,int cost,int quality,int count){
//        this.id=id;
//        this.name=name;
//        this.cost=cost;
//        this.quality=quality;
//        this.count++;
//    }
//}
//public class practical{
//    public static void main(String[] args) {
//       int count=0;
//        Scanner a=new Scanner(System.in);
//        System.out.println("how many product");
//        int number= a.nextInt();
//
//        System.out.println("\n");
//        product products[]=new product[number];
//        System.out.println("enter product data");
//        for (int k = 0; k < number; k++) {
//            System.out.println("product id");
//            int id= a.nextInt();
//            System.out.println("product name");
//            String name=a.next();
//            System.out.println("product cost");
//            int cost= a.nextInt();
//            System.out.println("product quality");
//            int quality= a.nextInt();
//            System.out.println("\n");
//
//            products[k]=new product(id,name,cost,quality,count);
//            count++;
//        }
//        if (products[0] != null){
//            System.out.println("class is using productMarker");
//        }
//        System.out.println("product details\n");
//            for (product product:products){
//                System.out.println("product id" + product.id);
//                System.out.println("product name" + product.name);
//                System.out.println("product cost" + product.cost);
//                System.out.println("product quality" + product.quality);
//            }
//            System.out.println("total object is " +count);
//        }
//    }
//
import java.util.*;
interface ProductMarker
{
}
class Product implements ProductMarker
{
    int id;
    String name;
    int cost;
    int quantity;
    int count;
    Product(){
        id=0;
        name=" ";
        cost=0;
        quantity=0;
    }
    Product(int id, String name, int cost, int quantity){
        this.id=id;
        this.name=name;
        this.cost=cost;
        this.quantity=quantity;
        this.count++;
    }
}
public class practical
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner a = new Scanner(System.in);
        System.out.println("How many product ?");
        int number = a.nextInt();

        System.out.println("\n");
        Product products[] = new Product[number];
        System.out.println("Enter Product data");
        for(int k=0; k<number; k++)
        {
            System.out.println("Product Id ");
            int id =a.nextInt();
            System.out.println("Product name ");
            String name = a.next();
            System.out.println("Product cost ");
            int cost = a.nextInt();
            System.out.println("Product qantity ");
            int quantity = a.nextInt();
            System.out.println("\n");
            products[k] = new Product(id, name, cost, quantity);
            count++;
        }
//Testing for marker interface
        if(products[0] instanceof ProductMarker){
            System.out.println("Class is using ProductMarker");
        }
        System.out.println(" Product details\n");
        for(Product product:products)
        {
            System.out.println("Product Id " + product.id);
            System.out.println("Product name " + product.name);
            System.out.println("Product cost " + product.cost);
            System.out.println("Product qantity " + product.quantity);
            System.out.println("\n");
        }
        System.out.println("Total object is "+count);
    }
}