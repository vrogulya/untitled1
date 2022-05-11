package Auto;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Please insert type car: fuel or electric?");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("fuel")) {

            Fuelcar car1 = new Fuelcar();

            System.out.println("Please insert brand car");
            String name = scanner.nextLine();

            System.out.println("Please insert volume car");
            int volume = scanner.nextInt();

            System.out.println("Your car "+name+"have average "+ car1.avaregeFuelcar(volume));

        } else if (type.equalsIgnoreCase("electric")) {

            Electrocar car2 = new Electrocar();

            System.out.println("Please insert brand car");
            String name2 = scanner.nextLine();

            System.out.println("Please insert power car");
            int power = scanner.nextInt();

            System.out.println("Your car "+name2+"have average " + car2.avaregeElectrocar(power));
        }
        else {
            System.out.println("Error Sansei");

        }

    }

}

