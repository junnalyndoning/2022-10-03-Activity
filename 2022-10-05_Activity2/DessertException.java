public class DessertException extends Exception {

    public DessertException(String message){
        super(message);
    }
    
    public String notNumber(){
        return "Your input is not a number, please input a number.";
    }

}