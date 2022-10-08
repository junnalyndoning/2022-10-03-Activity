import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Dessert> sweetDessert = new ArrayList<Dessert>();
        
            System.out.println("");
            System.out.println("Hello, I hope your doing well,");
            System.out.println("");
            System.out.print("How many dessert you want to input:");
            int numObject = scan.nextInt();
            scan.nextLine();
                try{
                        if(numObject > 0 ){
                            
                            for(int i = 0;i<numObject; i++){
                                System.out.print("Please enter the dessert you want to input "+ "(" + i + ") :");
                                String name = scan.nextLine();
                                sweetDessert.add(new Dessert(name));
                            }
                            System.out.println("");
                            System.out.println("Here are your selected dessert!");
                            for(int j = 0;j<numObject; j++){
                                System.out.println(sweetDessert.get(j).getName());
                                
                            }
                            
                            System.out.println("");
                            System.out.println("Thank you and have a nice day");
                        }else if(numObject == 0){
                            scan.close();
                            throw new NewException("Out of bound try to input another number!");
                        }else{
                            scan.close();
                            throw new NewException("Out of bound try to input another number!");
                        }
                }catch(NewException e){
                    System.out.println(e.getMessage());
                }
        
    } 
}