import java.util.ArrayList;
import java.util.Collections;


public class Deck {
    
    ArrayList<Card> i = new ArrayList<Card>();

    public Deck(){

        i.add(new Card(2));
        i.add(new Card(3));
        i.add(new Card(4));
        i.add(new Card(5));
        i.add(new Card(6));
        i.add(new Card(7));
        i.add(new Card(8));
        i.add(new Card(9));
        i.add(new Card(10));

        i.add(new Card(11));  //Jack
        i.add(new Card(12));  //Queen
        i.add(new Card(13));  //King
        i.add(new Card(14));  //Ace


    }

    public void shuffle(){
        Collections.shuffle(i);
    }

    public Card draw(){

        return i.get(0);

    }
}
