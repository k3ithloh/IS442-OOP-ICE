package farming;

// u do not care about the physical location of the class files of Animal and its subclasses
// just the logical grouping that they are in
import farming.type.*;

import java.util.ArrayList;

public class AnimalFarm {
    private ArrayList<Animal> animals = new ArrayList<>();

    public AnimalFarm() {
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cow());
    }

    public void makeNoise() {
        for (Animal a : animals) {
            a.makeNoise();
        }

    }
}
