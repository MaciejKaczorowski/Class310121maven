package classes;

public class Poem {
    private int stropheNumbers;
    private Author creator;
     public Poem(Author creator, int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
        this.creator = creator;
    }
    public int getStropheNumbers() {
        return this.stropheNumbers;
    }
    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }
    public Author getCreator() {
        return this.creator;
    }
    public void setCreator(Author creator) {
        this.creator = creator;
    }
}
