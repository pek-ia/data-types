package org.example;

class Apple {
    float weightInOunces;   // instance variable = shared between methods in the same class
    String variety;         // replicated each time we use "new"
    String color;
    String season;

    // Constructor
    Apple() {
        weightInOunces = 25;
        variety = "Honeycrisp";
        color = "OrangeyGold with red stripes";
        season = "Mid-September";
    }

    public Apple(float weightInOunces, String variety, String color, String season) {
        this.weightInOunces = weightInOunces;
        this.variety = variety;
        this.color = color;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weightInOunces=" + weightInOunces +
                ", variety='" + variety + '\'' +
                ", color='" + color + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
