public class Bee extends Animal{

    public Bee (String name) {
        super(name, "pollen");
    }

    public void sleep() {
        System.out.println(name + " never sleeps");
    }

    public void eat(String food) {
        if (food == favouriteFood) {
            System.out.println(name + " eats the " + food + ".");
            System.out.println("YUM!!! " + name + " wants more " + food + "!");
            sleep();
        } else {
            System.out.println("YUCK!!! " + name + " will not eat " + food +  "!");
        }
    }
}

