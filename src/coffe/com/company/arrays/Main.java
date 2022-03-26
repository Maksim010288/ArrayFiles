package coffe.com.company.arrays;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        StreamOutCollection collection = new StreamOutCollection();
        List<String> dayName = collection.dayName();
        String nameMouse = "січень";
        collection.forOutputMouse(dayName, nameMouse);
        collection.streamOutputMouse(dayName, nameMouse);
    }


}

