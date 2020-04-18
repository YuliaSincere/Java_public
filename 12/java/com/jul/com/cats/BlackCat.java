package jul.com.cats;

public class BlackCat extends Cat {

    public BlackCat(String name) {
        super(name);
    }

    public void Fly() {
        System.out.println("кошка " + name + " взлетает на венике");
    }
}