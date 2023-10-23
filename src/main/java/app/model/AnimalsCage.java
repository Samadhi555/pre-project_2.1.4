package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {


    private final Animal animal;
    private final Timer time;

    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal, Timer time) {
        this.animal = animal;
        this.time = time;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(getTimer().getTime());
        System.out.println("________________________");
    }


    public Timer getTimer() {
        return this.time;
    }
}
