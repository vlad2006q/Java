class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Lion extends Animal {

    void makeSound() {
        System.out.println("Lion roars");
    }
}

class Elephant extends Animal {

    void makeSound() {
        System.out.println("Elephant trumpets");
    }
}

class Monkey extends Animal {

    void makeSound() {
        System.out.println("Monkey screeches");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}
class Fox extends Animal {
    void makeSound() {
        System.out.println("What does the Fox say? DrindindindindindinDirin");
    }
}
public class variant7 {
    public static void main(String[] args) {

        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Monkey monkey = new Monkey();
        Cat cat = new Cat();
        Fox fox = new Fox();

        lion.makeSound();
        elephant.makeSound();
        monkey.makeSound();
        cat.makeSound();
        fox.makeSound();
    }
}