public class Animal {
    String favouriteFood;
    String name;
    static int population = 0;

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name, String favouriteFood) {
        this.favouriteFood = favouriteFood;
        this.name = name;
        population++;
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(name + " eats the " + food + ".");
        if (food == favouriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food + "!");
        } else {
            sleep();
        }
    }
}
