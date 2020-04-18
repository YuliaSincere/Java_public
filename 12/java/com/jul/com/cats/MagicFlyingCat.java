package jul.com.cats;

public class MagicFlyingCat extends FlyingCat {

    public MagicFlyingCat(String name) {
        super(name);
    }
    public void Fly() {
        System.out.println("кошка " + name + " МАГИЧЕСКИ ЛЕТАЕТ АААА");
    }
    public void ChangeCatName(String newName) {
        name = newName;
    }
}