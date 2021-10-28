import java.sql.SQLOutput;
import java.util.Scanner;

public class CarClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! What model is your car?");
        String model = scan.nextLine();
        System.out.println("Alright, now what color is your car?");
        String color = scan.nextLine();
        System.out.println("Alright, now what year is your car from?");
        int year = scan.nextInt();

        Car car = new Car(0, 0, color, model, year, 0, "North");
        System.out.println("Car created: \n" + car.toString());
        System.out.println("What would you like to do? \n(set speed / set direction / set color / set model / set year / print info / exit)");
        String input = scan.nextLine();

        while (!(input.equals("set speed") || input.equals("set direction") || input.equals("set color") ||
                input.equals("set model") || input.equals("set year"))) {
            System.out.println("Please choose from one of the above options.");
            input = scan.nextLine();
        }

        for (int i = 0; i < 100; i++) {
            if (input.equals("exit")) break;
            if (input.equals("set speed")) {
                System.out.println("What speed?");
                int speed = scan.nextInt();
                car.setSpeed(speed);
            }
            if (input.equals("set model")) {
                System.out.println("What model?");
                model = scan.nextLine();
                car.setModel(model);
            }
            if (input.equals("set year")) {
                System.out.println("What year?");
                year = scan.nextInt();
                car.setYear(year);
            }
            if (input.equals("set direction")) {
                System.out.println("What direction?");
                String direction = scan.nextLine();
                car.setDirection(direction);
            }
            if (input.equals("print info")) {
                System.out.println(car.toString());
            }
            if (input.equals("set color")) {
                System.out.println("What color?");
                color = scan.nextLine();
                car.setColor(color);
            }
            input = scan.nextLine();
            System.out.println("To carry out another action, request one:\n(set speed / set direction / set color / set model / set year)\nTo exit, say \"exit\".");
        }
    }
}
