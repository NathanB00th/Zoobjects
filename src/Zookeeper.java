public class Zookeeper {

    String name;
    int population = Animal.population;

    public Zookeeper (String name) {
        this.name = name;
    }

    public void feedAnimals(Animal[] animals, String food) {

        System.out.println(name + " is feeding " + food + " to " + animals.length + " of " + population + " total animals.");

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat(food);
        }
    }

}
