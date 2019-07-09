package iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        BikeRepository repository = new BikeRepository();

        repository.addBike("Cervelo");
        repository.addBike("Scott");
        repository.addBike("Fuji");

        Iterator<String> iterator = repository.iterator();

        while (iterator.hasNext()) {
            String bike = iterator.next();
            System.out.println(bike);
        }

        for (String bike : repository) {
            System.out.println(bike);
        }
    }
}
