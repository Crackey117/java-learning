package academy.learnprogramming;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damange) {
        this.health = this.health - damange;
        if(this.health <= 0){
            System.out.println("Player knocked out");

        }
    }

    public int healthRemaining() {
        return  this.health;
    }
}
