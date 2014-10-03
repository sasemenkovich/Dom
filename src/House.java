/**
 * Created by Соня on 26.09.2014.
 */
public class House {

    private int floors;
    private double length;
    private double width;
    private final double HEIGHT = 2.5;
    private final int WEIGHT_WALL = 250;
    private  final int WEIGHT_CEILING = 150;
    private int ballonNumber = 0;

    public House(double length, double width, int floors)
    {
        setLength(length);
        setWidth(width);
        setFloors(floors);
    }

    public int getBallonNumber() {
        return ballonNumber;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getFloorsSquare()
    {
        return length*width*(floors+1);
    }

    public double getHouseWeight()
    {
        return getFloorsSquare() * WEIGHT_CEILING + (3*width + 2.5*length) * HEIGHT * WEIGHT_WALL;
    }

    public void addBalloons(Balloon balloon)
    {
        this.ballonNumber = 0;
        double kgBalloon = (double)balloon.getPower()/1000;
        do {
            this.ballonNumber++;
        }while (this.ballonNumber*kgBalloon<=this.getHouseWeight());
        System.out.println("Потребуется шариков: " + this.ballonNumber);
    }

    public void addBalloons(int balloon)
    {
        this.ballonNumber = 0;
        double kgBalloon = (double)balloon/1000;
        do {
            this.ballonNumber++;
        }while (this.ballonNumber*kgBalloon<=this.getHouseWeight());
        System.out.println("Потребуется шариков: " + this.ballonNumber);
    }
}
