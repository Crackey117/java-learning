package academy.learnprogramming;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over"
    }
}

class MazeRunner extends  Movie {
    public MazeRunner() {
        super("MazeRunner");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
