public class Car {

    private String make;
    private String model;
    private int year;
    private double engine;
    private int horsepower;
    private String color;
    private boolean is4x4;
    private String bodyStyle;
    private boolean isAutomaticTransmission;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public boolean isIs4x4() {
        return is4x4;
    }

    public void setIs4x4(boolean is4x4) {
        this.is4x4 = is4x4;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public boolean isAutomaticTransmission() {
        return isAutomaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        isAutomaticTransmission = automaticTransmission;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1991 && year <= 2020)
            this.year = year;
    }

    public void printMakeModelYear() {
        System.out.println(make + " " + model + " " + year);
    }

    //public void printAll() {
    //System.out.println(make + " " + model + " " + year + " " + color + " " + bodyStyle + " "
    //+ engine + " " + horsepower + " " + isAutomaticTransmission + " " + is4x4);
}


