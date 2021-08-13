class AuctionSystem {
    public static void main(String[] args) {
        Auction auction1 = new Auction();
        auction1.title = "Xbox One";
        auction1.description = "Konsola dla wymagających graczy";
        auction1.price = 999.99;
        auction1.seller = new User();
        auction1.seller.firstName = "Jan";
        auction1.seller.lastName = "Kowalski";
        auction1.seller.address = new Address();
        auction1.seller.address.city = "Wrocław";
        auction1.seller.address.postalCode = "50-500";
        auction1.seller.address.street = "Kościuszki";
        auction1.seller.address.homeNo = "24A";
        auction1.seller.address.flatNo = "21";

        Auction auction2 = new Auction();
        auction2.title = "Samsung S20";
        auction2.description = "Niesamowity telefon z trzema obiektywami";
        auction2.price = 3999;
        auction2.seller = new User();
        auction2.seller.firstName = "Justyna";
        auction2.seller.lastName = "Adamczyk";

        System.out.println("Dostępne aukcje");
        System.out.println(auction1.title + ", " + auction1.description + ", " + auction1.price + "zł, sprzedający: " +
                auction1.seller.firstName + " " + auction1.seller.lastName);
        System.out.println(auction2.title + ", " + auction2.description + ", " + auction2.price + "zł, sprzedający: " +
                auction2.seller.firstName + " " + auction2.seller.lastName);
    }
}