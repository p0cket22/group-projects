package project_1;
import java.util.*;

public class Main{
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("what is users name?");
        String Name = input.nextLine();
        System.out.println("what item/character did they get?");
        String item = input.nextLine();

        System.out.println(Name+ " "+item);
    
    }
}