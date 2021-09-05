import pl.javastart.Client;

class DiscountApp2{
    public static void main(String[] args) {
        Client client1 = new Client(null, "Kowalski", true,20);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false,50);
        double price2 = 1100;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        PrintService printService = new PrintService();
        printService.printSummary(client1, price1, priceDiscount1);
        printService.printSummary(client2, price2, priceDiscount2);
    }
}