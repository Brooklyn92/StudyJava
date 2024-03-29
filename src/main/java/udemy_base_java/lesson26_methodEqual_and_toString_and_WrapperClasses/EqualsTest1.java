package udemy_base_java.lesson26_methodEqual_and_toString_and_WrapperClasses;

import java.util.ArrayList;

public class EqualsTest1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "v4");
        Car c2 = new Car("red", "v4");
        Car c3 = new Car("black", "v8");
        Car c4 = new Car("black", "v8");
        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
    }
}

class Car {
    String color;
    String engine;
    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
           Car c2 = (Car) obj;
           return color.equals(c2.color) && engine.equals(c2.engine);
        }
        else {
            return false;
        }
    }

    public String toString() {
        return "Car color " + color + " and engine " + engine;
    }
}
