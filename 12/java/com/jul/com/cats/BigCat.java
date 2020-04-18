package jul.com.cats;

public class BigCat extends Cat {

    public BigCat(String name) {
        super(name);
    }

    public void Fly() {
            System.out.println("кошка " + name + " не летает, а падает");
        }
}