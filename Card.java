public class Card {
    
    private int card;

    public Card(int card){
        this.card = card;
    }


    public boolean isLessThan(Card c){
        if (this.card < c.card){
            return true;
        }
        return false;

    }

    public String getRankAsString(){
        String value = null;
        if (card == 2) {
            value = "2";
        }else if (card == 3) {
            value = "3";
        }else if (card == 4) {
            value = "4";
        }else if (card == 5) {
            value = "5";
        }else if (card == 6) {
            value = "6";
        }else if (card == 7) {
            value = "7";
        }else if (card == 8) {
            value = "8";
        }else if (card == 9) {
            value = "9";
        }else if (card == 10) {
            value = "10";
        }else if (card == 11){
            value = "jack";
        }else if (card == 12){
            value = "queen";
        }else if (card == 13){
            value = "king";
        }else if (card == 14){
            value = "ace";
        }

        return value;
    }
}
