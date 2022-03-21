import java.util.*;


public class Card_Deck {
    
    public static void main(String[] args){
       
        Deck j = new Deck();
        String ans = "Y";

        
        while (ans.equalsIgnoreCase("Y"))
        {

            j.shuffle();
            Card curr = j.draw();

            System.out.println("The first card is a " + curr.getRankAsString() + ". o (over) or u (under)?");
            Scanner scan = new Scanner(System.in);
            ans = scan.nextLine();

            j.shuffle();
            Card next = j.draw();
            while(next.getRankAsString().equals(curr.getRankAsString()))
            {
                j.shuffle();
                next = j.draw();
            }

            System.out.println("The second card is a " + next.getRankAsString() +".");

            if (curr.isLessThan(next) && ans.equalsIgnoreCase("O") ) 
            {
                System.out.println("You win.");
            } else if (next.isLessThan(curr) && ans.equalsIgnoreCase("U") )
            {
                System.out.println("You win.");
            }else if (ans.equalsIgnoreCase("O")|| ans.equalsIgnoreCase("U"))
            {
                System.out.println("You lose.");
            }else
            {
                System.out.println("Invalid input");
            }

            System.out.println("\nWould you like to play again? (y/n)");
            Scanner scan2 = new Scanner(System.in);
            ans = scan2.nextLine();
            System.out.println();
            
        }

    }

}
