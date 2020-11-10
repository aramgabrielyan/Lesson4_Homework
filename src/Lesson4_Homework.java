public class Lesson4_Homework {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Isuzu");
        car.setModel("Rodeo");
        car.setYear(2003);
        car.setColor("Black");
        car.setBodyStyle("SUV");
        car.setAutomaticTransmission(true);
        car.setEngine(3.2);
        car.setHorsepower(215);
        car.setIs4x4(true);

        car.printMakeModelYear();
        System.out.println();

        System.out.println("Make:" + " " + car.getMake());
        System.out.println("Model:" + " " + car.getModel());
        System.out.println("Year:" + " " + car.getYear());
        System.out.println("Color:" + " " + car.getColor());
        System.out.println("Body Style:" + " " + car.getBodyStyle());
        System.out.println("Engine:" + " " + car.getEngine());
        System.out.println("Horsepower:" + " " + car.getHorsepower());
        System.out.println("Automatic Transmission:" + " " + car.isAutomaticTransmission());
        System.out.println("4x4:" + " " + car.isIs4x4());


        //car.printAll();


        System.out.println();


        Car car2 = new Car();

        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setYear(2015);
        car2.setColor("White");
        car2.setBodyStyle("Sedan");
        car2.setAutomaticTransmission(false);
        car2.setEngine(1.7);
        car2.setHorsepower(145);
        car2.setIs4x4(false);

        car2.printMakeModelYear();
        System.out.println();

        System.out.println("Make:" + " " + car2.getMake());
        System.out.println("Model:" + " " + car2.getModel());
        System.out.println("Year:" + " " + car2.getYear());
        System.out.println("Color:" + " " + car2.getColor());
        System.out.println("Body Style:" + " " + car2.getBodyStyle());
        System.out.println("Engine:" + " " + car2.getEngine());
        System.out.println("Horsepower:" + " " + car2.getHorsepower());
        System.out.println("Automatic Transmission:" + " " + car2.isAutomaticTransmission());
        System.out.println("4x4:" + " " + car2.isIs4x4());

    }
}

