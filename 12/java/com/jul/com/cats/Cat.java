package jul.com.cats;

public class Cat {
    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    public void Fly() {
        System.out.println("кошка " + name + " не летает");
    }
}
