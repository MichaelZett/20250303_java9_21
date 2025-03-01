package de.zettsystems.java18_21.exercises;

public class PetCare {
    //TODO use pattern matching for switch with record pattern
    public static String suggestActivity(Pet pet) {
        if (pet instanceof Dog) {
            return "Take " + pet.getName() + " for a walk";
        } else if (pet instanceof Cat) {
            return "Play with " + pet.getName() + " and a laser pointer";
        } else if (pet instanceof Fish) {
            return "Watch " + pet.getName() + " swim around";
        } else {
            return "Unknown pet";
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Fish fish = new Fish("Nemo");

        System.out.println(suggestActivity(dog));
        System.out.println(suggestActivity(cat));
        System.out.println(suggestActivity(fish));
    }
}
