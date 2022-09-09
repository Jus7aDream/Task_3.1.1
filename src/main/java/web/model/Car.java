package web.model;

public class Car {
    private final int year;
    private final String model;
    private final int type;

    public Car(int year, String model, int type) {
        this.year = year;
        this.model = model;
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public int getType() {
        return type;
    }

}
