package academy.learnprogramming;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

}
