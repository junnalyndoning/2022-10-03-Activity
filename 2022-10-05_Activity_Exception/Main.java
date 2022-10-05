import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String myfavdessert[] = {"Mango Float", "Fruit Salad", "Buko Salad", "Spaghetti", "Ice Cream"};
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the index of the favorite Dessert you want to display: ");
        int choice = Scan.nextInt();
        try{
            if(choice < 0){
                Scan.close();
                throw new dessertException("The Index is negative!");
            }if(choice > 5){
                Scan.close();
                throw new dessertException("The index "+ choice +" is not valid!");
            }
            System.out.println(myfavdessert[choice]);
        }catch(dessertException e){
            System.out.println(e.getMessage());
        }
        Scan.close();
    }
}
