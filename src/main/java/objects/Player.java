package objects;

public class Player{

    int points = 0;
    public String name = "blah";

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getPoints(){
        return points;
    }

    public void addPoint() {
        this.points += 1;
    }

    // Put code for the Player object here
    // This could be stuff like points earned and questions answered
}