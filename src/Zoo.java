public class Zoo {

    public static void main(String[] args) {
        //make and run a main method
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");

        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        Animal[] a = {tigger, pooh, rarity, gemma, stinger};

        Zookeeper zoe = new Zookeeper("Zoebot");
        zoe.feedAnimals(a, "pasta");

    }


}
