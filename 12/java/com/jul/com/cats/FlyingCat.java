package jul.com.cats;

public class FlyingCat extends Cat {

    public FlyingCat(String name) {
        super(name);
    }

    public void Fly() {
        System.out.println("кошка " + name + " взлетает сама по себе");
    }
}