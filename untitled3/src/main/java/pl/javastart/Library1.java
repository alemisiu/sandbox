package pl.javastart;

public class Library1 {
    public static void main(String[] args) {
        final String appName = "biblioteka v0.5";
        Book1 book1 = new Book1("w pustyni i puszczy ","Henryk sienkiewicz",2010,296,"Greg");
        Book1 book2 = new Book1("Java. Efektywne programowanie. Wydanie II", " Joshua Bloch", 2009,
                352, "Helion", "9788324620845");
        Book1 book3 = new Book1("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra", 2008, 851, "McGraw-Hill Osborne Media");

        System.out.println(appName);
        System.out.println("ksiazki dostepne w bibliotece:");
//        book1.printinfo();
//        book2.printinfo();
//        book3.printinfo();
    }

}
