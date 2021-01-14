package academy.learnprogramming;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return ((double) Math.sqrt((this.y - 0) * (this.y - 0) + (this.x - 0) * (this.x - 0)));
    }
    public double distance(int x, int y){
        return ((double) Math.sqrt((this.y - y) * (this.y - y) + (this.x - x) * (this.x - x)));
    }

    public double distance(Point point){
        return ((double) Math.sqrt((this.y - point.y) * (this.y - point.y) + (this.x - point.x) * (this.x - point.x)));
    }
}
