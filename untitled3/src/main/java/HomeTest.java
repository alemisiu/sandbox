public class HomeTest {
    public static void main(String[] args) {
        Home home = new Home(10_000, 1000);
        System.out.println(home.getStatus());
        System.out.println("bierzemy prysznic");
        home.takeShower();
        System.out.println(home.getStatus());

        System.out.println("ogladamy tv przez 4 godziny");
        home.watchTv(4);
        System.out.println(home.getStatus());

        System.out.println("gotujemy wode");
      home.boilWater();
        System.out.println(home.getStatus());
    }
}
