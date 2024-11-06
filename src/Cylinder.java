import java.util.InputMismatchException;
import java.util.Scanner;

public class Cylinder {
    private int radius;
    private int height;


    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void cylinderVolume(int radius, int height) {
        double PI = 3.14;
        System.out.printf("Volume of cylinder with radius: %d, and height: %d\n", radius, height);
        System.out.println("-----------------");
        System.out.printf("IS: %.2fcm^3", ((PI * Math.pow(radius, 2)) * height));
        System.out.println("\n================================================");
    }

    public static void cylinderArea(int radius, int height) {
        double PI = 3.14;
        System.out.printf("Area of cylinder with radius: %d, and height: %d\n", radius, height);
        System.out.println("-----------------");
        System.out.printf("IS: %.2fcm^2", (((PI * Math.pow(radius, 2)) * 2) + (2 * PI * radius * height)));
        System.out.println("\n================================================");
    }

    public static void cylinderStart() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            int heightInput = 0;
            int radiusInput = 0;
            try {
                System.out.println("Give height(cm):");
                heightInput = scanner.nextInt();
                if (heightInput <= 0) {
                    System.out.println("Height can't be negative or zero.");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    continue;
                }
                System.out.println("Give radius(cm):");
                radiusInput = scanner.nextInt();
                if (radiusInput <= 0) {
                    System.out.println("Radius can't be negative or zero.");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    continue;
                }
                check=false;

            } catch (InputMismatchException ie) {
                System.out.println("Give number.");
                scanner.nextLine();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            if(!check){
                cylinderArea(heightInput, radiusInput);
                cylinderVolume(heightInput, radiusInput);
            }
        }
    }
}
