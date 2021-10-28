public class Car {

    private int roll;
    private int pitch;
    private String direction;
    private String color;
    private String model;
    private int year;
    private int speed;


    public Car (int r, int p, String c, String m, int ye, int s, String d) {
        roll = r;
        pitch = p;
        color = c;
        model = m;
        year = ye;
        speed = s;
        direction = d;
    }
    public void setDirection(String direction) {
        if(direction.equalsIgnoreCase("North")) this.direction = "North";
        if(direction.equalsIgnoreCase("South")) this.direction = "South";
        if(direction.equalsIgnoreCase("East")) this.direction = "East";
        if(direction.equalsIgnoreCase("West")) this.direction = "West";
        else System.out.println("Please choose a cardinal direction (north/east/south/west).");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Your car is now traveling " + this.speed + " MPH.");
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Your car is now " + color + ".");
    }

    public void setYear(int year) {
        this.year = year;
        System.out.println("Your car is from the year " + year + ".");
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println("Your car is a " + model);
    }
    @Override
    public String toString() {
        return "Model: " + this.model + "\n" +
                "Color: " + this.color + "\n" +
                "Speed: " + this.speed + "\n" +
                "Direction: " + this.direction;
    }
}

