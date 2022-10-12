import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        List<Dessert> sweetDessert = new ArrayList<Dessert>();
        
        System.out.println("=================================");
        System.out.println("Welcome to my Mini Dessert Store!");
        System.out.println("=================================\n");
        System.out.println("Note: You can only input an integer.\n");

        try{
            System.out.print("How many dessert you wanted to order: ");
            Integer objects = input.nextInt();
            
            if(objects < 0){
                input.close();
                sc.close();
                throw new DessertException("The number is negative. Please input positive number.");
            }

            for(int i = 0; i < objects; i++){
                
                System.out.println("");
                System.out.print("Please input the dessert you wanted to order: ");
                String dessertname = sc.nextLine();
                System.out.print("How many pieces: ");
                int piecesofsweet = Integer.parseInt(sc.nextLine());
                sweetDessert.add(new Dessert(dessertname, piecesofsweet));
            }

            System.out.println("");
            System.out.println("Here is your order!\n");
            
            for(Dessert list : sweetDessert){
                System.out.println("Dessert name: "+ list.getName() + " , " + "Quantity: "+ list.getPieces());    
            }
            System.out.println("");
            System.out.println("Thank you for buying, and have a great day!");
            System.out.println("");

            input.close();
            sc.close();

        }
        catch(DessertException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("Your input is not a number.");
        }

    }
}