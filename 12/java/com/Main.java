import jul.com.catapult.Catapult;
import jul.com.cats.BigCat;
import jul.com.cats.BlackCat;
import jul.com.cats.FlyingCat;
import jul.com.cats.MagicFlyingCat;

public class Main {
    public static void main(final String[] args) {
        BigCat sonya = new BigCat("sonya");
        FlyingCat musya = new FlyingCat("musya");
        BlackCat vasya = new BlackCat("vasya");
        Catapult catapult = new Catapult();
        MagicFlyingCat superMusya = new MagicFlyingCat("superMusya");
        System.out.println("первый пошел!");
        catapult.Firing(sonya);
        System.out.println("второй пошел!");
        catapult.Firing(musya);
        System.out.println("третий пошел!");
        catapult.Firing(vasya);
        System.out.println("Супер муся, наследуемая от летающей муси, пошла!");
        catapult.Firing(superMusya);
        superMusya.ChangeCatName("newSuperMusya");
        System.out.println("Супер муся, наследуемая от летающей муси, пошла!");
        catapult.Firing(superMusya);
    }
}
